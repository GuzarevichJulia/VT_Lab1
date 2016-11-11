package task12_14_14_15.comparators;

import task12_14_14_15.Book;

/**
 * Created by Юлия on 06.11.2016.
 */
public class ComparatorByTitleAuthor extends ComparatorByTitle {
    public int compare(Book book, Book book2){
        int compareByTitle = super.compare(book, book2);
        if(compareByTitle == 0){
            String author = book.getAuthor();
            return author.compareTo(book2.getAuthor());
        }else {
            return compareByTitle;
        }

    }
}
