package com.aks.report.controller;

import com.aks.report.model.response.RestReportFilter;
import com.aks.report.util.RestReportFilterGenerator;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestReportFilterController {

    @RequestMapping(value = "/api/report/filter", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<RestReportFilter> getRestGridResults() {
        RestReportFilter restReportFilter = RestReportFilterGenerator.fetchReportFilter();
        return new ResponseEntity<RestReportFilter>(restReportFilter, HttpStatus.OK);
    }
}
