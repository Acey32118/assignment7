public class DocumentRegistry {
    
    private PdfDocument pdfPrototype;
    private TextDocument textPrototype;
    private SpreadsheetDocument spreadsheetPrototype;

    public DocumentRegistry() {
        pdfPrototype = new PdfDocument();
        textPrototype = new TextDocument();
        spreadsheetPrototype = new SpreadsheetDocument();
    }

    public Document createPdf(String fileName, String author, int pages) {
        PdfDocument doc = (PdfDocument) pdfPrototype.clone();
        doc.fileName = fileName;
        doc.author = author;
        doc.pageCount = pages;
        return doc;
    }

    public Document createText(String filePath, String encoding, int words) {
        TextDocument doc = (TextDocument) textPrototype.clone();
        doc.filePath = filePath;
        doc.encoding = encoding;
        doc.wordCount = words;
        return doc;
    }

    public Document createSpreadsheet(String name, int rows, int columns) {
        SpreadsheetDocument doc = (SpreadsheetDocument) spreadsheetPrototype.clone();
        doc.spreadsheetName = name;
        doc.rowCount = rows;
        doc.columnCount = columns;
        return doc;
    }

}
