import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner scan=new Scanner (System.in);
    Book book0 = new Book("betme met",40, "Chingiz Aitmatov");
    Book book1 = new Book("Uzak jol",7, "Mukai elebaev");
    Book book2 = new Book("birinchi mugalim",80, "aitmatov Chyngyz");
    Book book3 = new Book("ru",30, "hurakami ru ");
    Book book4 = new Book("Becoming",10, "Michael Obama");
    Book book5 = new Book("Syngankylych",5, "Tologon Kasymbekiv");

    Book [] books = { book1, book2, book3,book4,book5};
    Library library = new Library("bilimkana", "Chyngys A ulica 454",books);
        System.out.println( library.updateBookByName("Becoming",38));
        System.out.println(Arrays.toString(library.removeBookFromLibrary(new Book[]{book0}, "betme bet")));
        System.out.println(library);
    }
}