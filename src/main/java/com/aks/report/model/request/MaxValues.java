package com.aks.report.model.request;

public class MaxValues {
    private int maxColumnCount = 80;
    private int maxRowCount = 10000;

    public int getMaxColumnCount() {
        return maxColumnCount;
    }

    public void setMaxColumnCount(int maxColumnCount) {
        this.maxColumnCount = maxColumnCount;
    }

    public int getMaxRowCount() {
        return maxRowCount;
    }

    public void setMaxRowCount(int maxRowCount) {
        this.maxRowCount = maxRowCount;
    }
}
