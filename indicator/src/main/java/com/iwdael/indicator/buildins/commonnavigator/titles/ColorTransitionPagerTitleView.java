package com.iwdael.indicator.buildins.commonnavigator.titles;

import android.content.Context;

import com.iwdael.indicator.buildins.ArgbEvaluatorHolder;


/**
 * author  : iwdael
 * e-mail  : iwdael@outlook.com
 * github  : http://github.com/iwdael
 * project : Indicator
 */
public class ColorTransitionPagerTitleView extends SimplePagerTitleView {

    public ColorTransitionPagerTitleView(Context context) {
        super(context);
    }

    @Override
    public void onLeave(int index, int totalCount, float leavePercent, boolean leftToRight) {
        int color =  ArgbEvaluatorHolder.eval(leavePercent, mSelectedColor, mNormalColor);
        setTextColor(color);
    }

    @Override
    public void onEnter(int index, int totalCount, float enterPercent, boolean leftToRight) {
        int color =  ArgbEvaluatorHolder.eval(enterPercent, mNormalColor, mSelectedColor);
        setTextColor(color);
    }

    @Override
    public void onSelected(int index, int totalCount) {
    }

    @Override
    public void onDeselected(int index, int totalCount) {
    }
}
