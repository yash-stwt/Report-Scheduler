package com.yashstwt.report.util;

import com.yashstwt.report.service.GenerateReportServie;
import org.springframework.scheduling.annotation.Scheduled;

public class ReportScheduler {

    private final GenerateReportServie reportService;

    public ReportScheduler(GenerateReportServie reportService) {
        this.reportService = reportService;
    }

    @Scheduled(fixedRate = 300000)
    public void scheduleReportGeneration() {
        reportService.generateReport();
    }
}
