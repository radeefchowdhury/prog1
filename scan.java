import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ReadingFile {

   // This programs reads a file with names and scores, displaying the names
   //highest and lowest score, total amount of grades and the average of all the scores 
    // I couldn't get netbeans to read my file when I entered integers
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\radee\\Desktop\\sathu.txt");
        Scanner scFile = new Scanner(file);
        while(scFile.hasNext()){
            String names = scFile.next();
            scFile.useDelimiter(" "); 
            System.out.println(names);
            int score = scFile.nextInt();
            System.out.println(score);
            
            
        }
        
    }
    
}
