import java.util.Arrays;

public class Library {
    private String name;
    private String address;
    private Book[] books;

    public Library(String name, String address, Book[] books) {
        this.name = name;
        this.address = address;
        this.books = books;
    }



    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public String addABookToTheLibrary(Book book) {
        for (Book b: books) {
            if (b.getName().equals(book.getName())) {

                return "Такая книга  у нас уже есть!";
            }
        }
        Book[] books1=new Book[books.length+1];
        for (int i = 0; i < books.length; i++) {
            books1[i]=books[i];
        }
        books1[books.length]=book;
        books = Arrays.copyOf(books1,books1.length);
        return "Successfully added!";
    }

    public Book[] removeBookFromLibrary(Book[] books, String bookName) {


        int indexToRemove = -1;
        for (int i = 0; i < books.length; i++) {
            if (books[i].getName().equals(bookName)) {
                indexToRemove = i;
                break;
            }
        }

        if (indexToRemove >= 0) {
            Book[] updatedBooks = new Book[books.length - 1];
            for (int i = 0, j = 0; i < books.length; i++) {
                if (i != indexToRemove) {
                    updatedBooks[j++] = books[i];
                }
            }

            return updatedBooks;
        } else {
            return books;
        }

    }

    public Book updateBookByName(String bookName, int newQuantity) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getName().equals(bookName)){
                books[i].setQuantity(newQuantity);
                return books[i];
            }

        }

        return null;
    }

    public void getAllBookByAuthor(String author) {

        for (int i = 0; i < books.length; i++) {
            if(books[i].getAuthor().equals(author)){
                System.out.println(books[i]+" ");
            }
        }

    }

    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ",\naddress='" + address + '\'' +
                ",\nbooks=" + Arrays.toString(books) +'\n'+
                '}';
    }

}
