package com.flipkart.chatheads.config;

public class FloatingViewPreferences {
    private boolean startRightSide;
    private boolean alignFloatingViewsLeft;
    private int alignmentMargin;
    private float inactiveAlpha;
    private int floatingViewCount;
    private int sizeDp;
    private boolean isHardwareAccelerated;

    public FloatingViewPreferences(boolean startRightSide, boolean alignFloatingViewsLeft, int alignmentMargin, float inactiveAlpha, int floatingViewCount, int sizeDp, boolean isHardwareAccelerated) {
        this.startRightSide = startRightSide;
        this.alignFloatingViewsLeft = alignFloatingViewsLeft;
        this.alignmentMargin = alignmentMargin;
        this.inactiveAlpha = inactiveAlpha;
        this.floatingViewCount = floatingViewCount;
        this.sizeDp = sizeDp;
        this.isHardwareAccelerated = isHardwareAccelerated;
    }

    public boolean startRightSide() {
        return startRightSide;
    }

    public boolean alignFloatingViewsLeft() {
        return alignFloatingViewsLeft;
    }

    public int getAlignmentMargin() {
        return alignmentMargin;
    }

    public float getInactiveAlpha() {
        return inactiveAlpha;
    }

    public int getFloatingViewCount() {
        return floatingViewCount;
    }

    public int getSizeDp() {
        return sizeDp;
    }

    public boolean isHardwareAccelerated() {
        return isHardwareAccelerated;
    }
}
