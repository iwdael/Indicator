package com.iwdael.indicator.buildins.commonnavigator.model;

/**
 * author  : iwdael
 * e-mail  : iwdael@outlook.com
 * github  : http://github.com/iwdael
 * project : Indicator
 */
public class PositionData {
    public int mLeft;
    public int mTop;
    public int mRight;
    public int mBottom;
    public int mContentLeft;
    public int mContentTop;
    public int mContentRight;
    public int mContentBottom;

    public int width() {
        return mRight - mLeft;
    }

    public int height() {
        return mBottom - mTop;
    }

    public int contentWidth() {
        return mContentRight - mContentLeft;
    }

    public int contentHeight() {
        return mContentBottom - mContentTop;
    }

    public int horizontalCenter() {
        return mLeft + width() / 2;
    }

    public int verticalCenter() {
        return mTop + height() / 2;
    }
}
