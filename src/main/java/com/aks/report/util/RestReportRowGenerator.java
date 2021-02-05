package com.aks.report.util;

import com.aks.report.model.response.ParameterizedObject;
import com.aks.report.model.response.RestReportRow;
import com.aks.report.model.response.SearchResultGroup;

import java.util.ArrayList;
import java.util.List;

public class RestReportRowGenerator {

    public static List<RestReportRow> fetchRestReportRows(){
        List<RestReportRow> restReportRows = new ArrayList<>(0);
        ParameterizedObject parameterizedObject = new ParameterizedObjectImpl();
        List<SearchResultGroup> columnsList = SearchResultGroupGenerator.fetchSearchResultGroups();
        for(int i=1; i<1001; i++){
            RestReportRow restReportRow = new RestReportRow(columnsList, parameterizedObject);
            restReportRows.add(restReportRow);
        }
        return restReportRows;
    }
}
