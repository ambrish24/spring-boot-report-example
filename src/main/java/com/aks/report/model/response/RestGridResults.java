package com.aks.report.model.response;

import java.util.ArrayList;
import java.util.List;

public class RestGridResults {

    private List<RestReportRow> results;
    private ArrayList<RestReportAttribute> reportedAttributesInOrder = new ArrayList<RestReportAttribute>();
    private int maxColumnCount = 80;
    private int maxCellCount = 100000;
    private int maxRowCount = 10000;

    public List<RestReportRow> getResults() {
        return results;
    }

    public void setResults(List<RestReportRow> results) {
        this.results = results;
    }

    public int getMaxColumnCount() {
        return maxColumnCount;
    }

    public void setMaxColumnCount(int maxColumnCount) {
        this.maxColumnCount = maxColumnCount;
    }

    public int getMaxCellCount() {
        return maxCellCount;
    }

    public void setMaxCellCount(int maxCellCount) {
        this.maxCellCount = maxCellCount;
    }

    public int getMaxRowCount() {
        return maxRowCount;
    }

    public void setMaxRowCount(int maxRowCount) {
        this.maxRowCount = maxRowCount;
    }

    public ArrayList<RestReportAttribute> getReportedAttributesInOrder() {
        return reportedAttributesInOrder;
    }

    public void setReportedAttributesInOrder(ArrayList<RestReportAttribute> reportedAttributesInOrder) {
        this.reportedAttributesInOrder = reportedAttributesInOrder;
    }
}
