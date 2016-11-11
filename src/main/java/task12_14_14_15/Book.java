package task12_14_14_15;

/**
 * Created by Юлия on 06.11.2016.
 */
public class Book implements Cloneable, Comparable<Book>{
    private String title;
    private String author;
    private int price;
    private static int edition;
    private int isbn;

    public Book(String title, String author, int price, int isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static int getEdition() {
        return edition;
    }

    public static void setEdition(int edition) {
        Book.edition = edition;
    }

    public void setIsbn(int isbn){
        this.isbn = isbn;
    }

    public int getIsbn(){
        return isbn;
    }

    @Override
    public boolean equals(Object object){
        if(object == null){
            return false;
        }

        if(this == object){
            return true;
        }

        if(this.getClass() != object.getClass()){
            return false;
        }

        Book book = (Book)object;

        if((book.title == null) && (title != null)){
            return false;
        }else{
            if(!title.equals(book.title)){
                return false;
            }
        }

        if((book.author == null) && (author != null)){
            return false;
        }else{
            if(!author.equals(book.author)){
                return false;
            }
        }

        if(book.price != price){
            return false;
        }

        return true;
    }

    @Override
    public int hashCode(){
        int hash = 1;
        hash = hash * 19 + price;
        hash = hash * 33 + title.hashCode();
        hash = hash * 97 + author.hashCode();
        return hash;
    }

    @Override
    public String toString(){
        return getClass().getName()+" @ "+"title: "+title+", author: "+author+", price: "+price+", edition: "+edition;
    }

    @Override
    public Book clone() throws CloneNotSupportedException{
        return (Book)super.clone();
    }

    public int compareTo(Book book){
        return this.isbn - book.isbn;
    }
}