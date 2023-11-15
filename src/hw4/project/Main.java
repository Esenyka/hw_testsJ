package hw4.project;

public class Main {
    public static void main(String[] args) {
        BookRepository br = new InMemoryBookRepository();
        BookService bs = new BookService(br);

        System.out.println(bs.findBookById("1"));
        System.out.println(bs.findAllBooks());
    }
}
