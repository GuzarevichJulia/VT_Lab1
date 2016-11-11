package task13;

import task12_14_14_15.Book;
/**
 * Created by Юлия on 06.11.2016.
 */
public class ProgrammerBook extends Book{
    private String language;
    private int level;

    public ProgrammerBook(String title, String author, int price, String language, int level, int isbn){
        super(title, author, price, isbn);
        this.language = language;
        this.level = level;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public boolean equals(Object object){
        if(!super.equals(object)){
            return false;
        }

        ProgrammerBook prBook = (ProgrammerBook)object;

        if((prBook.language == null) && (language!=null)){
            return false;
        }else {
            if(language.equals(prBook.language)){
                return true;
            }
        }

        if(prBook.level != level){
            return false;
        }

        return true;
    }

    @Override
    public int hashCode(){
        int hash = super.hashCode();
        hash = hash * 41 + language.hashCode();
        hash = hash * 17 + level;
        return hash;
    }

    @Override
    public String toString(){
        return super.toString()+", language: "+language+", level: "+level;
    }
}
