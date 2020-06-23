package com.hacknife.indicator.buildins.commonnavigator.titles.badge;

/**
 * author  : Hacknife
 * e-mail  : hacknife@outlook.com
 * github  : http://github.com/hacknife
 * project : Indicator
 */
public class BadgeRule {
    private BadgeAnchor mAnchor;
    private int mOffset;

    public BadgeRule( BadgeAnchor anchor, int offset) {
        mAnchor = anchor;
        mOffset = offset;
    }

    public   BadgeAnchor getAnchor() {
        return mAnchor;
    }

    public void setAnchor( BadgeAnchor anchor) {
        mAnchor = anchor;
    }

    public int getOffset() {
        return mOffset;
    }

    public void setOffset(int offset) {
        mOffset = offset;
    }
}
