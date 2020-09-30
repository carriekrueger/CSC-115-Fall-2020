// Carrie Krueger
// 9-30-20
// Notes on if/else statements

import java.util.Scanner;

public class IfElseNotes {
    public static void main(String[] args) {
        
        ifMethod(); // let's explore ifs and elses
    }
    
    // a method to study if statements 
    public static void ifMethod() {
        
        // Task: ask the user for a number and tell them if it's even
        
        Scanner sc = new Scanner(System.in);  // this makes a Scanner that
                                              // reads from the keyboard
                                              
        System.out.println("Enter a number: ");  // prompt the user for info
        int number = sc.nextInt(); // reads and stores number
        
        /* 3 common mistakes: 
        
        1. DON'T put a ';' after the if() 
        2. DO put curly braces { } around the code to be executed if true 
        3. DO remember to test for equality with '=='
        
        */
        
        // test for evenness with mod 
        if(number % 2 == 0) {
            System.out.println(number + " is even.");
            System.out.println("Rock on!");
        }
        
        System.out.println("The end.");  // prints every time
        
        // Task: compare two numbers
        
        int num1 = 10;
        int num2 = 7; 
        
        // compare and output message
        if(num1 < num2) {
            System.out.println("num1 is less!");
        } else {
            System.out.println("num1 is NOT less!");
        }
        
        sc.close();
        
  
      
    }
}
        
