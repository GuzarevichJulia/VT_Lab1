package task13;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Юлия on 12.11.2016.
 */
public class ProgrammerBookTest {

    ProgrammerBook programmerBook1 = new ProgrammerBook("book1", "author1", 8, "java", 2, 1);
    ProgrammerBook programmerBook2 = new ProgrammerBook("book2", "author2", 10, "java", 4, 2);
    ProgrammerBook programmerBook3 = new ProgrammerBook("book1", "author1", 8, "java", 2, 1);

    @Test
    public void testToString(){
        String expected = "task13.ProgrammerBook @ title: book2, author: author2, price: 10, edition: 0, language: java, level: 4";
        assertEquals(expected, programmerBook2.toString());
    }

    @Test
    public void testEquals(){
        boolean expected1 = true;
        boolean expected2 = false;
        assertEquals(expected1,programmerBook1.equals(programmerBook3));
        assertEquals(expected2,programmerBook1.equals(programmerBook2));
    }

}