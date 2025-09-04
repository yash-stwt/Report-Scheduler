package com.yashstwt.report.util;


import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import org.springframework.stereotype.Component;

import java.io.ByteArrayOutputStream;

@Component
public class PdfGenerator {

    public static byte[] generatePdf(String content) {
        try(ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            Document document = new Document();
            PdfWriter.getInstance(document,baos);
            document.open();
            document.add(new Paragraph("Automatic PDF Report"));
            document.add(new Paragraph(content));
            document.close();
            System.out.println("PDF generated: ");
            return baos.toByteArray();
        } catch (Exception e) {
            System.out.println("Error generating PDF: " + e.getMessage());
            return null;
        }
    }
}
