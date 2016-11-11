package task12_14_14_15;

import org.junit.Test;
import task12_14_14_15.comparators.ComparatorByAuthorTitle;
import task12_14_14_15.comparators.ComparatorByAuthorTitlePrice;
import task12_14_14_15.comparators.ComparatorByTitle;
import task12_14_14_15.comparators.ComparatorByTitleAuthor;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Юлия on 12.11.2016.
 */
public class BookTest {

    Book book1 = new Book("Hamlet", "Shakespeare", 10, 3);
    Book book2 = new Book("War and Peace", "Tolstoy", 8, 2);
    Book book3 = new Book("Romeo and Juliet", "Shakespeare", 12, 1);
    Book book4 = new Book("Eugene Onegin", "Pushkin", 13, 4);

    @Test
    public void testToString(){
        String expected = "task12_14_14_15.Book @ title: War and Peace, author: Tolstoy, price: 8, edition: 0";
        assertEquals(expected, book2.toString());
    }

    @Test
    public void testSort(){
        Book[] expexted = {book3, book2, book1, book4};
        Book[] inputValues = {book1, book2, book3, book4};
        Arrays.sort(inputValues);
        assertArrayEquals(expexted, inputValues);
    }

    @Test
    public void testComparatorByTitle(){
        Book[] expected = {book4, book1, book3, book2};
        Book[] inputValues = {book1, book2, book3, book4};
        List<Book> bookList = Arrays.asList(inputValues);
        Collections.sort(bookList, new ComparatorByTitle());
        Book[] actual = (Book[]) bookList.toArray();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testComparatorByAuthorTitle(){
        book1.setAuthor("1");
        book1.setTitle("1");
        book2.setAuthor("2");
        book2.setTitle("2");
        book3.setAuthor("2");
        book3.setTitle("1");
        book4.setAuthor("1");
        book4.setTitle("2");
        Book[] expected = {book1, book4, book3, book2};
        Book[] inputValues = {book1, book2, book3, book4};
        List<Book> bookList = Arrays.asList(inputValues);
        Collections.sort(bookList, new ComparatorByAuthorTitle());
        Book[] actual = (Book[]) bookList.toArray();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testComparatorByTitleAuthor(){
        book1.setAuthor("1");
        book1.setTitle("1");
        book2.setAuthor("2");
        book2.setTitle("2");
        book3.setAuthor("2");
        book3.setTitle("1");
        book4.setAuthor("1");
        book4.setTitle("2");
        Book[] expected = {book1, book3, book4, book2};
        Book[] inputValues = {book1, book2, book3, book4};
        List<Book> bookList = Arrays.asList(inputValues);
        Collections.sort(bookList, new ComparatorByTitleAuthor());
        Book[] actual = (Book[]) bookList.toArray();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testComparatorByAuthorTitlePrice(){
        book1.setAuthor("1");
        book1.setTitle("1");
        book2.setAuthor("2");
        book2.setTitle("2");
        book3.setAuthor("2");
        book3.setTitle("2");
        book4.setAuthor("1");
        book4.setTitle("2");
        Book[] expected = {book1, book4, book2, book3};
        Book[] inputValues = {book1, book2, book3, book4};
        List<Book> bookList = Arrays.asList(inputValues);
        Collections.sort(bookList, new ComparatorByAuthorTitlePrice());
        Book[] actual = (Book[]) bookList.toArray();
        assertArrayEquals(expected, actual);
    }
}