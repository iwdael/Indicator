package com.iwdael.indicator;


import androidx.viewpager.widget.ViewPager;

/**
 * author  : iwdael
 * e-mail  : iwdael@outlook.com
 * github  : http://github.com/iwdael
 * project : Indicator
 */
public class ViewPagerHelper {
    public static void bind(final Indicator indicator, ViewPager viewPager) {
        indicator.getNavigator().setNavigatorCount(viewPager.getAdapter().getCount());
        indicator.onPageSelected(viewPager.getCurrentItem());
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                indicator.onPageScrolled(position, positionOffset, positionOffsetPixels);
            }

            @Override
            public void onPageSelected(int position) {
                indicator.onPageSelected(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                indicator.onPageScrollStateChanged(state);
            }
        });

    }
}
