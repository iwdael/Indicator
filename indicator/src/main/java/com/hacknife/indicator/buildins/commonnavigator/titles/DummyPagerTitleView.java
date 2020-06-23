package com.hacknife.indicator.buildins.commonnavigator.titles;

import android.content.Context;
import android.view.View;

import com.hacknife.indicator.buildins.commonnavigator.abs.IPagerTitleView;


/**
 * author  : Hacknife
 * e-mail  : hacknife@outlook.com
 * github  : http://github.com/hacknife
 * project : Indicator
 */
public class DummyPagerTitleView extends View implements IPagerTitleView {

    public DummyPagerTitleView(Context context) {
        super(context);
    }

    @Override
    public void onSelected(int index, int totalCount) {
    }

    @Override
    public void onDeselected(int index, int totalCount) {
    }

    @Override
    public void onLeave(int index, int totalCount, float leavePercent, boolean leftToRight) {
    }

    @Override
    public void onEnter(int index, int totalCount, float enterPercent, boolean leftToRight) {
    }
}
