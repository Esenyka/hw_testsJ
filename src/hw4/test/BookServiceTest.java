
import hw4.project.Book;
import hw4.project.BookRepository;
import hw4.project.BookService;
import hw4.project.InMemoryBookRepository;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

public class BookServiceTest {

    @Test
    void bookServiceWorkTest() {
        Book book1 = mock(Book.class);
        when(book1.getId()).thenReturn("1");
        when(book1.getTitle()).thenReturn("Interesting book");
        when(book1.getAuthor()).thenReturn("Tom C");

        Book book2 = mock(Book.class);
        when(book2.getId()).thenReturn("2");
        when(book2.getTitle()).thenReturn("Very interesting book");
        when(book2.getAuthor()).thenReturn("Mot C");

        BookRepository bookRepository = mock(InMemoryBookRepository.class);
        when(bookRepository.findById("1")).thenReturn(book1);
        when(bookRepository.findById("2")).thenReturn(book1);
        ArrayList<Book> al = new ArrayList();
        al.add(book1);
        al.add(book2);
        when(bookRepository.findAll()).thenReturn(al);

        BookService bookService = new BookService(bookRepository);

        assertThat(bookService.findBookById("1")).isEqualTo(book1);
        assertThat(bookService.findAllBooks()).isEqualTo(al);
    }
}
