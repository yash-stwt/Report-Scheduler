package com.yashstwt.report.service;

import com.yashstwt.report.util.PdfGenerator;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class GenerateReportServie {

    private final PdfGenerator pdfGenerator;
    private final EmailService emailService;

    public GenerateReportServie(PdfGenerator pdfGenerator, EmailService emailService) {
        this.pdfGenerator = pdfGenerator;
        this.emailService = emailService;
    }

    public void generateReport(){
        String data = "Sample data Report generated at: " + LocalDateTime.now();
        byte[] pdfBytes = pdfGenerator.generatePdf(data);

        emailService.sendEmail(
                "yashthakur7606@gmail.com",
                "Timely report",
                "Please find the attached report.",
                pdfBytes,
                "report-"+System.currentTimeMillis()+".pdf");

        System.out.println("Report generated & emailed at: " + java.time.LocalDateTime.now());
    }
}
