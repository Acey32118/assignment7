public class TextDocument implements Document {
    String filePath;
    String encoding;
    int wordCount;

    public TextDocument() {
        System.out.println("Creating a Text Document prototype.");
    }

    public TextDocument(String filePath, String encoding, int wordCount) {
        this.filePath = filePath;
        this.encoding = encoding;
        this.wordCount = wordCount;
    }

    public Document clone() {
        return new TextDocument(this.filePath, this.encoding, this.wordCount);
    }

    public void open() {
        System.out.println("Opening Text Document: " + filePath + " with encoding: " + encoding + " (" + wordCount + " words)");
    }

    public String getType() {
        return "Text";
    }

    public String toString() {
        return "Type: " + getType() + ", Path: " + filePath + ", Encoding: " + encoding + ", Words: " + wordCount;
    }
}
