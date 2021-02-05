package com.aks.report.util;

import com.aks.report.model.response.RestReportFilter;

public class RestReportFilterGenerator {

    public static RestReportFilter fetchReportFilter(){
        RestReportFilter restReportFilter = new RestReportFilter();
        restReportFilter.setReportName("PDF Report");
        restReportFilter.setReportAttributes(RestReportAttributeGenerator.fetchRestReportAttributes());
        return restReportFilter;
    }
}
