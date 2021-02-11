package com.aks.report.util;

import com.aks.report.model.response.RestReportAttribute;
import com.aks.report.model.response.RestReportAttributeFilter;

import java.util.ArrayList;
import java.util.List;

public class RestReportAttributeGenerator {

    public static List<RestReportAttribute> fetchRestReportAttributes(){
        List<RestReportAttribute> reportAttributes = new ArrayList<>(0);
        for(int i=1; i<4; i++){
            RestReportAttribute restReportAttribute = new RestReportAttribute(144, "Column "+i, "dd/MM/yyyy");
            restReportAttribute.setFilter(new RestReportAttributeFilter());
            restReportAttribute.setFieldName("Column "+i);
            //restReportAttribute.setFieldNameAlias("Column "+i);
            reportAttributes.add(restReportAttribute);
        }
        return reportAttributes;
    }
}
