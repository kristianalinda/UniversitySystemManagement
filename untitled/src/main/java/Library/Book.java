package Library.interfaces;

import Library.enums.Category;

public class Book implements IBook{
    String title;
    String author;
    Category category;
    boolean borrowed = false;
    int ageLimit = 0;

    public Book(String title, String author, int ageLimit){
        this.title = title;
        this.author = author;
        this.ageLimit = ageLimit;
    }
    
    public void setCategory(Category category){
        this.category =category;
    }
    public  void borrow(){
        this.borrowed = true();
    }
    public void putBack(){
        this.borrowed = false;
    }
}
