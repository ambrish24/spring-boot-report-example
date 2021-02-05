package com.aks.report.util;

import com.aks.report.model.response.ParameterizedObject;
import com.aks.report.model.response.SearchResultGroup;

import java.util.ArrayList;
import java.util.List;

public class SearchResultGroupGenerator {

    public static List<SearchResultGroup> fetchSearchResultGroups(){
        List<SearchResultGroup> searchResultGroups = new ArrayList<>(0);
        ParameterizedObject parameterizedObject = new ParameterizedObjectImpl();
        parameterizedObject.setParameter("style:background-color", "#00ffff");
        ParameterizedObject parameterizedObject2 = new ParameterizedObjectImpl();

        for(int i=1; i<4; i++){
            SearchResultGroup searchResultGroup = null;
            if(i == 1) {
                searchResultGroup = new SearchResultGroup(parameterizedObject, "Column Value - " + i);
            } else{
                searchResultGroup = new SearchResultGroup("Column Value - " + i);
            }
            searchResultGroups.add(searchResultGroup);
        }

        return searchResultGroups;
    }
}
