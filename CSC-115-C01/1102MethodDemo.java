// Carrie Krueger
// 11-2-20
// A menu of math to demonstrate methods:
// Ask the user for two numbers, perform the chosen operation
// and display the result.

// NOTE: Every method should have a comment description of what it does, 
// and additional comments throughout as needed. 
// Also include comments in the main method (major steps)

import java.util.Scanner;

public class MethodDemo {
    
        public static void main(String[] args) {
            
            // Main method runs the program (major steps --> methods)
            // Keep Scanner and user input in here to make it easier 
            
            Scanner sc = new Scanner(System.in);
            
            // Ask the user for 2 numbers
            
            int num1;
            int num2;
            
            System.out.println("Enter number 1:");
            num1 = sc.nextInt();
            
            System.out.println("Enter number 2:");
            num2 = sc.nextInt();
            
            // Display the menu of options 
            // This method is a CODE DISPLACER (it's void)
            
            showMenu();
            
            // Get the user's choice
            // Could make another code displacer method (same with above input)
            // but Scanner scope issues
            
            System.out.println("Enter your choice:");
            int choice = sc.nextInt();
            
            //do the thing they want to do by calling the appropriate method
            
            //Where are the dots? Don't need dot possession if your method is
            //DEFINED in the same class where it is CALLED 
            
            if(choice == 1) {
                add(num1, num2);  // a method that shows how PARAMETERS work
            }
            
            if(choice == 2) {
                divide(num1, num2); // more parameters 
            }
            
            if(choice == 3){
                int answer = square(num1);  // returning a value and saving it to 
                                            // a variable 
                System.out.println(answer);
                
                // System.out.println(square(num1));  //returning to a print statement
            }
            
            
            
        }
        
        // This method displays a menu of options
        public static void showMenu() {
            System.out.println("\nPlease choose from the following:");
            System.out.println("\t1. Add the two numbers");
            System.out.println("\t2. Divide the two numbers");
            System.out.println("\t3. Square the first number");
            System.out.println("\t4. Exponentiate the two numbers");
            
            System.out.println();
        }
        
        
        //This method takes two ints and displays the sum
        //Note: parameters (variables) catch the arguments (values) 
        //sent in to the method 
        public static void add(int a, int b) {
            System.out.println("The sum of " + a + " + " + b + " is " + (a + b));
        }
        
        
        // The method takes two ints and displays the quotient 
        public static void divide(int a, int b) {
            if(b == 0){
                System.out.println("You can't divide by 0!");
            } else {
                // *int division
                System.out.println("The quotient of " + a + " / " + b + " is " + (1.0 * a / b));
                
            }
        }
        
        // This method takes an int and returns the square of it
        public static int square(int a){
            int ans = a * a;
            return ans;
            
          //  return a * a;   shorter
        }
        
        
        
        
        
}
            
