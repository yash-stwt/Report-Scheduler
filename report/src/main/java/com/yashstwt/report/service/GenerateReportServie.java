package com.yashstwt.report.service;

import com.yashstwt.report.util.PdfGenerator;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class GenerateReportServie {

    private final PdfGenerator pdfGenerator;

    public GenerateReportServie(PdfGenerator pdfGenerator) {
        this.pdfGenerator = pdfGenerator;
    }

    public void generateReport() {
        // Logic to generate report using pdfGenerator
        String reportData = "Sample Report Data";
        pdfGenerator.generatePdf(reportData);
        System.out.println("Report genearted at :" + LocalDateTime.now());
    }
}
