public class SpreadsheetDocument implements Document{
    String spreadsheetName;
    int rowCount;
    int columnCount;

    public SpreadsheetDocument() {
        System.out.println("Creating a Spreadsheet Document prototype.");
    }

    public SpreadsheetDocument(String spreadsheetName, int rowCount, int columnCount) {
        this.spreadsheetName = spreadsheetName;
        this.rowCount = rowCount;
        this.columnCount = columnCount;
    }

    public Document clone() {
        return new SpreadsheetDocument(this.spreadsheetName, this.rowCount, this.columnCount);
    }

    public void open() {
        System.out.println("Opening Spreadsheet Document: " + spreadsheetName + " (" + rowCount + " rows, " + columnCount + " columns)");
    }

    public String getType() {
        return "Spreadsheet";
    }

    public String toString() {
        return "Type: " + getType() + ", Name: " + spreadsheetName + ", Rows: " + rowCount + ", Columns: " + columnCount;
    }

}
