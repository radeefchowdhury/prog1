
import java.util.Scanner;

public class Question2 {

    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integer numbers to find out the GCD ");
        
        if(sc.hasNextInt()){
            int num1 = sc.nextInt();
        int num2= sc.nextInt();
        
        while(num1!=num2){
            if(num1>num2)
                num1 = num1-num2; 
            else
                num2= num2-num1;
            System.out.println("GCD of given numbers is:" + num2);
        }
        
        }
        else{
            System.out.println("Retype your integers");
        }
        
    }
    
}