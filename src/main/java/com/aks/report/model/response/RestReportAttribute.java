package com.aks.report.model.response;

public class RestReportAttribute {

    private int tableColumnWidth;
    private String tableColumnName;
    private String dateTimeFormat;

    public RestReportAttribute(int tableColumnWidth, String tableColumnName, String dateTimeFormat) {
        this.tableColumnWidth = tableColumnWidth;
        this.tableColumnName = tableColumnName;
        this.dateTimeFormat = dateTimeFormat;
    }

    public int getTableColumnWidth() {
        return tableColumnWidth;
    }

    public void setTableColumnWidth(int tableColumnWidth) {
        this.tableColumnWidth = tableColumnWidth;
    }

    public String getTableColumnName() {
        return tableColumnName;
    }

    public void setTableColumnName(String tableColumnName) {
        this.tableColumnName = tableColumnName;
    }

    public String getDateTimeFormat() {
        return dateTimeFormat;
    }

    public void setDateTimeFormat(String dateTimeFormat) {
        this.dateTimeFormat = dateTimeFormat;
    }
}
