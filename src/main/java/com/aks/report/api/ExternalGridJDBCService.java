package com.aks.report.api;

import com.aks.report.model.response.RestGridResults;
import com.aks.report.model.response.RestReportFilter;

public interface ExternalGridJDBCService {

    RestGridResults fetchRestGridResults(String restUrl, Class<RestGridResults> responseType, String fetchRowsRequestJson); //http://localhost:9090/api/report/rows
    RestReportFilter fetchRestReportFilter(String restUrl, Class<RestReportFilter> responseType, String fetchReportFilterRequestJson); // http://localhost:9090/api/report/filter
}
