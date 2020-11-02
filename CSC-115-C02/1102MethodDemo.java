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
            
            // Display a menu of options
            // This method is called a CODE DISPLACER  (it's void)
            
            showMenu();
            
            // Get user's choice
            // Could make another code displacer method (same for other input)
            // But Scanner scope issues 
            
            System.out.println("Please enter your choice:");
            int choice = sc.nextInt();
            
            // do the thing they want to do by calling the apporpriate method
            
            // Where are the dots?? Don't need to do dot possession if your 
            // method is DEFINED in the same class where it is CALLED
            
            if(choice == 1){
                add(num1, num2);  // a method that shows how PARAMETERS work
            }
            
            if(choice == 2) {
                divide(num1, num2);  // more parameters
            }
            
            if(choice == 3) {
                int answer = square(num1);  // returning a value and 
                                            // saving it to a variable
                                            
                System.out.println(answer);  
                
               // System.out.println(square(num1));  returning to a print statement
            }
            
            if(choice == 4) {
               // int answer = exp(num1, num2);   //returning a value and 
               // System.out.println(answer);     // saving to a variable
               
               System.out.println(exp(num1, num2));
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
        
        
        // This method takes two ints and displays the sum
        // Note: parameters (variables) catch the arguments (values) that are
        // sent in to the method
        
        public static void add(int a, int b) {
            System.out.println("The sum of " + a + " + " + b + " is " + (a + b));
        }
        
        //This method takes two ints and displays the quotient
        public static void divide(int a, int b) {
            if(b == 0) {
                System.out.println("You can't divide by 0!");
            } else {
            
                // *int division 
                System.out.println("The quotient of " + a + " / " + b + " is " + (1.0 * a / b));
                
            }
        }
        
        // This method takes an integer and returns the square of it
        public static int square(int a) {
            int ans = a * a;
            return ans;
            
           // return a * a;   shorter
        }
        
        // This method takes two ints.
        // It returns a raised to the b power
        public static int exp(int a, int b) {
            // return Math.pow(a,b);     cheat code... would need to change return type
       
            //let's write our own!
            
            int counter = 1;
            int answer = 1; 
            
            while(counter <= b) {
                answer *= a;
                counter++;
            }
            
            return answer;
       
        }
        
        
   
        
        
}
            
