package com.aks.report.model.response;

import java.util.ArrayList;
import java.util.List;

public class RestReportRow {

    private List<SearchResultGroup> columnsList =  new ArrayList<SearchResultGroup>();
    private ParameterizedObject customProperties;

    public RestReportRow(List<SearchResultGroup> columnsList, ParameterizedObject customProperties) {
        this.columnsList = columnsList;
        this.customProperties = customProperties;
    }

    public List<SearchResultGroup> getColumnsList() {
        return columnsList;
    }

    public void setColumnsList(List<SearchResultGroup> columnsList) {
        this.columnsList = columnsList;
    }

    public ParameterizedObject getCustomProperties() {
        return customProperties;
    }

    public void setCustomProperties(ParameterizedObject customProperties) {
        this.customProperties = customProperties;
    }
}
