package com.yashstwt.report.controller;

import com.yashstwt.report.service.GenerateReportServie;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/report/api")
public class ReportGeneratorController {

    private final GenerateReportServie generateReport;

    public ReportGeneratorController(GenerateReportServie generateReport) {
        this.generateReport = generateReport;
    }

    @GetMapping("/generate")
    public String generateReport() {
        generateReport.generateReport();
        return "Report generated successfully";
    }

}
