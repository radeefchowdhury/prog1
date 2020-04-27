
package question3;


public class Question3 {

 //This uses objects to print out two books with their title, author, isbn, etc
 //I couldnt get to do the publisher nor use the toString
    public static void main(String[] args) {
        Book myBook = new Book("The Handmaid's Tale","Marget", 192939, 1985, 1);{
        String myBookTitle = myBook.getTitle();
        String myBookAuthor = myBook.getAuthor();
        int myBookisbn = myBook.getIsbn();
        int myBoookyear = myBook.getYear();
        int myBookamountOfBook = myBook.getAmountOfBook();
        
        System.out.println("The book title is: "); System.out.println(myBookTitle);
        System.out.println("The author is: "); System.out.println(myBookAuthor);
        System.out.println("The isbn is: "); System.out.println(myBookisbn);
        System.out.println("The year of release is : "); System.out.println(myBoookyear);
        
        System.out.println("---------------------------------------------------------------");
        
        Book book2 = new Book("1984","Orwell", 121212121, 1949, 1); {
        String book2Title = book2.getTitle();
        String book2Author = book2.getAuthor();
        int book2isbn = book2.getIsbn();
        int book2year = book2.getYear();
        
        
        book2.toString();
        }
    }
        
        
       
    }
    
}
