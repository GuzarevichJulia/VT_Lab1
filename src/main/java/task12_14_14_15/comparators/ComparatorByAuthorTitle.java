package task12_14_14_15.comparators;

import task12_14_14_15.Book;

/**
 * Created by Юлия on 07.11.2016.
 */
public class ComparatorByAuthorTitle extends ComparatorByTitle {
    public int compare(Book book, Book book2) {
        String author = book.getAuthor();
        int compareByAuthor = author.compareTo(book2.getAuthor());
        if (compareByAuthor == 0){
            return super.compare(book, book2);
        }else {
            return compareByAuthor;
        }
    }
}
