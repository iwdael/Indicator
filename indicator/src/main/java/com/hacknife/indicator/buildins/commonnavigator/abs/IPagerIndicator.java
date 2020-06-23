package com.hacknife.indicator.buildins.commonnavigator.abs;


import com.hacknife.indicator.buildins.commonnavigator.model.PositionData;

import java.util.List;

/**
 * author  : Hacknife
 * e-mail  : hacknife@outlook.com
 * github  : http://github.com/hacknife
 * project : Indicator
 */
public interface IPagerIndicator {
    void onPageScrolled(int position, float positionOffset, int positionOffsetPixels);

    void onPageSelected(int position);

    void onPageScrollStateChanged(int state);

    void onPositionDataProvide(List<PositionData> dataList);
}
