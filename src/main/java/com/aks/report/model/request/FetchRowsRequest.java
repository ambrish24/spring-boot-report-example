package com.aks.report.model.request;

import java.util.Map;

public class FetchRowsRequest {

    private GridInfo gridInfo;
    private MaxValues maxValues = new MaxValues();
    private Map<String, Map<String, Object>> prefs;

    public GridInfo getGridInfo() {
        return gridInfo;
    }

    public void setGridInfo(GridInfo gridInfo) {
        this.gridInfo = gridInfo;
    }

    public MaxValues getMaxValues() {
        return maxValues;
    }

    public void setMaxValues(MaxValues maxValues) {
        this.maxValues = maxValues;
    }

    public Map<String, Map<String, Object>> getPrefs() {
        return prefs;
    }

    public void setPrefs(Map<String, Map<String, Object>> prefs) {
        this.prefs = prefs;
    }
}
