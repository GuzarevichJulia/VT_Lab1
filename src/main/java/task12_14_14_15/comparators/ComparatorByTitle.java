package task12_14_14_15.comparators;

import task12_14_14_15.Book;

/**
 * Created by Юлия on 06.11.2016.
 */
public class ComparatorByTitle extends MyComparator {
    public int compare(Book book, Book book2){
        String title = book.getTitle();
        return title.compareTo(book2.getTitle());
    }
}
