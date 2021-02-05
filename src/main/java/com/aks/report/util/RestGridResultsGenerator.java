package com.aks.report.util;

import com.aks.report.model.response.RestGridResults;
import com.aks.report.model.response.RestReportAttribute;

import java.util.ArrayList;

public class RestGridResultsGenerator {

    public static RestGridResults fetchRestGridResults(){
        RestGridResults restGridResults = new RestGridResults();
        restGridResults.setResults(RestReportRowGenerator.fetchRestReportRows());
        restGridResults.setMaxCellCount(100000);
        restGridResults.setMaxColumnCount(80);
        restGridResults.setMaxRowCount(10000);
        restGridResults.setReportedAttributesInOrder(new ArrayList<RestReportAttribute>());
        return restGridResults;
    }
}
