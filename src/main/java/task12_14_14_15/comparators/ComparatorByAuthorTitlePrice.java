package task12_14_14_15.comparators;

import task12_14_14_15.Book;

/**
 * Created by Юлия on 07.11.2016.
 */
public class ComparatorByAuthorTitlePrice extends ComparatorByAuthorTitle {
    public int compare(Book book, Book book2){
        int compareByAuthorTitle = super.compare(book, book2);
        if (compareByAuthorTitle == 0){
            return book.getPrice() - book2.getPrice();
        }else {
            return compareByAuthorTitle;
        }
    }
}
