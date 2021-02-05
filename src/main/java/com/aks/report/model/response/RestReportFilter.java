package com.aks.report.model.response;

import java.util.ArrayList;
import java.util.List;

public class RestReportFilter {

    private String  reportName;
    private List<RestReportAttribute> reportAttributes = new ArrayList<RestReportAttribute>();

    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public List<RestReportAttribute> getReportAttributes() {
        return reportAttributes;
    }

    public void setReportAttributes(List<RestReportAttribute> reportAttributes) {
        this.reportAttributes = reportAttributes;
    }
}
