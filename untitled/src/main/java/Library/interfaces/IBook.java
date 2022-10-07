package Library;

import Library.enums.Category;

public interface IBook {
    public String title;
    public String author;
    public Category category;
    public boolean borrowed;
    public int ageLimit;
}
