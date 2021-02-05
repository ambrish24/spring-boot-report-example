package com.aks.report.model.response;

import java.io.Serializable;

public class SearchResultGroup implements Serializable {

    private ParameterizedObject customProperties;
    private String columnValue;

    public SearchResultGroup(String columnValue) {
        this.columnValue = columnValue;
    }

    public SearchResultGroup(ParameterizedObject customProperties, String columnValue) {
        this.customProperties = customProperties;
        this.columnValue = columnValue;
    }

    public ParameterizedObject getCustomProperties() {
        return customProperties;
    }

    public void setCustomProperties(ParameterizedObject customProperties) {
        this.customProperties = customProperties;
    }

    public String getColumnValue() {
        return columnValue;
    }

    public void setColumnValue(String columnValue) {
        this.columnValue = columnValue;
    }
}
