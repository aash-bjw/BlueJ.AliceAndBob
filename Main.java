/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args ){
        Scanner stdin = new Scanner(System.in);
        
        String username = new String();
     
    System.out.println("What is your name?"); 
    username = stdin.nextLine();
    
    if (username.equals("Alice") || username.equals("Bob")){
        System.out.println("Hello, " + username +"!"); 
    }
      
    }
}
