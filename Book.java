
package question3;


public class Book {
    private String title;
    private String publisher = "Vanier";
    private String author;
    private int isbn;
    private int year;   
    private int amountOfBook; 
    public Book() {
        author = "No author";
        isbn = 0;
        year = 0;
        amountOfBook = 0;
    }
    public Book(String title, String author, int isbn, int year, int amountOfBook){
        this.author = author; 
        this.title = title;
        this.isbn = isbn;
        this.year = year;
        this.amountOfBook = amountOfBook;
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

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getAmountOfBook() {
        return amountOfBook;
    }

    public void setAmountOfBook(int amountOfBook) {
        this.amountOfBook = amountOfBook;
    }
}
