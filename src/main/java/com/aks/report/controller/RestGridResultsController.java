package com.aks.report.controller;

import com.aks.report.model.response.RestGridResults;
import com.aks.report.util.RestGridResultsGenerator;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestGridResultsController {

    @RequestMapping(value = "/api/report/rows", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<RestGridResults> getRestGridResults() {
        RestGridResults restGridResults = RestGridResultsGenerator.fetchRestGridResults();
        return new ResponseEntity<RestGridResults>(restGridResults, HttpStatus.OK);
    }
}
