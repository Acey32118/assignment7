public class PdfDocument implements Document{
    String fileName;
    String author;
    int pageCount;

    public PdfDocument() {
        System.out.println("Creating a PDF Document prototype.");
    }

    public PdfDocument(String fileName, String author, int pageCount) {
        this.fileName = fileName;
        this.author = author;
        this.pageCount = pageCount;
    }

    public Document clone() {
        return new PdfDocument(this.fileName, this.author, this.pageCount);
    }

    public void open() {
        System.out.println("Opening PDF Document: " + fileName + " by " + author + " (" + pageCount + " pages)");
    }

    public String getType() {
        return "PDF";
    }

    public String toString() {
        return "Type: " + getType() + ", File: " + fileName + ", Author: " + author + ", Pages: " + pageCount;
    }

}
