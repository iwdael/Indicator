package com.iwdael.indicator.example;

import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.iwdael.indicator.example.ext.navigator.ScaleCircleNavigator;
import com.iwdael.indicator.Indicator;
import com.iwdael.indicator.ViewPagerHelper;
import com.iwdael.indicator.buildins.circlenavigator.CircleNavigator;

import java.util.Arrays;
import java.util.List;

public class CustomNavigatorExampleActivity extends AppCompatActivity {
    private static final String[] CHANNELS = new String[]{"CUPCAKE", "DONUT", "ECLAIR", "GINGERBREAD", "HONEYCOMB", "ICE_CREAM_SANDWICH", "JELLY_BEAN", "KITKAT", "LOLLIPOP", "M", "NOUGAT"};
    private List<String> mDataList = Arrays.asList(CHANNELS);
    private ExamplePagerAdapter mExamplePagerAdapter = new ExamplePagerAdapter(mDataList);

    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_navigator_example_layout);

        mViewPager = (ViewPager) findViewById(R.id.view_pager);
        mViewPager.setAdapter(mExamplePagerAdapter);
        mViewPager.setCurrentItem(3);
        initMagicIndicator1();
        initMagicIndicator2();
        initMagicIndicator3();
    }

    private void initMagicIndicator1() {
        Indicator magicIndicator = (Indicator) findViewById(R.id.magic_indicator1);
        CircleNavigator circleNavigator = new CircleNavigator(this);
//        circleNavigator.setNavigatorCount(CHANNELS.length);
        circleNavigator.setCircleColor(Color.RED);
        circleNavigator.setCircleClickListener(new CircleNavigator.OnCircleClickListener() {
            @Override
            public void onClick(int index) {
                mViewPager.setCurrentItem(index);
            }
        });

        magicIndicator.setNavigator(circleNavigator);
        ViewPagerHelper.bind(magicIndicator, mViewPager);
    }

    private void initMagicIndicator2() {
        Indicator magicIndicator = (Indicator) findViewById(R.id.magic_indicator2);
        CircleNavigator circleNavigator = new CircleNavigator(this);
        circleNavigator.setFollowTouch(false);
        circleNavigator.setNavigatorCount(CHANNELS.length);
        circleNavigator.setCircleColor(Color.RED);
        circleNavigator.setCircleClickListener(new CircleNavigator.OnCircleClickListener() {
            @Override
            public void onClick(int index) {
                mViewPager.setCurrentItem(index);
            }
        });
        magicIndicator.setNavigator(circleNavigator);
        ViewPagerHelper.bind(magicIndicator, mViewPager);
    }

    private void initMagicIndicator3() {
        Indicator magicIndicator = (Indicator) findViewById(R.id.magic_indicator3);
        ViewPagerHelper.bind(magicIndicator, mViewPager);
//        ScaleCircleNavigator scaleCircleNavigator = new ScaleCircleNavigator(this);
//        scaleCircleNavigator.setNavigatorCount(CHANNELS.length);
//        scaleCircleNavigator.setNormalCircleColor(Color.LTGRAY);
//        scaleCircleNavigator.setSelectedCircleColor(Color.DKGRAY);
//        scaleCircleNavigator.setCircleClickListener(new ScaleCircleNavigator.OnCircleClickListener() {
//            @Override
//            public void onClick(int index) {
//                mViewPager.setCurrentItem(index);
//            }
//        });
        magicIndicator.setNavigator(ScaleCircleNavigator.class);

    }
}
