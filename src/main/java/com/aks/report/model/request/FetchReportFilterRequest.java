package com.aks.report.model.request;

import java.io.Serializable;

public class FetchReportFilterRequest implements Serializable {

    private GridInfo gridInfo;

    public GridInfo getGridInfo() {
        return gridInfo;
    }

    public void setGridInfo(GridInfo gridInfo) {
        this.gridInfo = gridInfo;
    }
}
