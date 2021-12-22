package com.iwdael.indicator.buildins.commonnavigator.abs;


import com.iwdael.indicator.buildins.commonnavigator.model.PositionData;

import java.util.List;

/**
 * author  : iwdael
 * e-mail  : iwdael@outlook.com
 * github  : http://github.com/iwdael
 * project : Indicator
 */
public interface IPagerIndicator {
    void onPageScrolled(int position, float positionOffset, int positionOffsetPixels);

    void onPageSelected(int position);

    void onPageScrollStateChanged(int state);

    void onPositionDataProvide(List<PositionData> dataList);
}
