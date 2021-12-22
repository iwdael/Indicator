package com.iwdael.indicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

import com.iwdael.indicator.abs.IPagerNavigator;


/**
 * author  : iwdael
 * e-mail  : iwdael@outlook.com
 * github  : http://github.com/iwdael
 * project : Indicator
 */
public class Indicator extends FrameLayout {
    private IPagerNavigator mNavigator;

    public Indicator(Context context) {
        this(context, null);
    }

    public Indicator(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public Indicator(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.Indicator);
        String className = typedArray.getString(R.styleable.Indicator_indicator);
        if (className != null) {
            try {
                Class<? extends View> v = (Class<? extends View>) Class.forName(className);
                setNavigator((IPagerNavigator) v.getConstructor(Context.class).newInstance(context));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        typedArray.recycle();
    }

    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        if (mNavigator != null) {
            mNavigator.onPageScrolled(position, positionOffset, positionOffsetPixels);
        }
    }

    public void onPageSelected(int position) {
        if (mNavigator != null) {
            mNavigator.onPageSelected(position);
        }
    }

    public void onPageScrollStateChanged(int state) {
        if (mNavigator != null) {
            mNavigator.onPageScrollStateChanged(state);
        }
    }

    public IPagerNavigator getNavigator() {
        return mNavigator;
    }

    public void setNavigator(IPagerNavigator navigator) {
        if (mNavigator == navigator) {
            return;
        }
        if (mNavigator != null) {
            mNavigator.onDetachFromMagicIndicator();
            navigator.setNavigatorCount(mNavigator.getNavigatorCount());
            navigator.onPageSelected(mNavigator.getPageSelected());

        }

        mNavigator = navigator;

        removeAllViews();
        if (mNavigator instanceof View) {
            LayoutParams lp = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
            addView((View) mNavigator, lp);
            mNavigator.onAttachToMagicIndicator();
        }
    }

    public void setNavigator(Class<? extends View> clazz) {
        try {
            setNavigator((IPagerNavigator) clazz.getConstructor(Context.class).newInstance(getContext()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setNavigator(String className) {
        try {
            setNavigator((Class<? extends View>) Class.forName(className));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
