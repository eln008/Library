public class Book {
    public static int length;
    private String name;
    private int quantity;
    private String author;

    public Book(String name, int quantity, String author) {
        this.name = name;
        this.quantity = quantity;
        this.author = author;
    }

    public Book() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", author='" + author + '\'' +
                '}';
    }
}
