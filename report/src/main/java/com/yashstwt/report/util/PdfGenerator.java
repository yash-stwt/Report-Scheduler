package com.yashstwt.report.util;


import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;

public class PdfGenerator {

    public void generatePdf(String content) {
        try{
            Document document = new Document();
            String fileName  = "report-"+System.currentTimeMillis()+".pdf";
            PdfWriter.getInstance(document,new FileOutputStream(fileName));
            document.open();
            document.add(new Paragraph("Automatic PDF Report"));
            document.add(new Paragraph(content));
            document.close();
            System.out.println("PDF generated: " + fileName);
        } catch (Exception e) {
            System.out.println("Error generating PDF: " + e.getMessage());
        }
    }
}
