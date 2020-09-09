// Carrie Krueger
// 9-9-20
// Chapter 2 Notes: Output and Escape Sequences 

public class Ch2Escape {
    public static void main(String[] args) {
        escape();  // this method will explore output and escape seq.
    }
    
    //a method to investigate output and escape sequences 
    public static void escape() {
        
        // print vs. println 
        System.out.println("Hello Class!"); // ln prints the next thing
        System.out.println();  // prints blank line
        System.out.print("It's Wednesday!"); // on the next line
        System.out.println();  // prints blank line
        
        
        // OUTPUT 
        System.out.println(2);  // you can put text or numbers in
        System.out.println(1 + 2 * 3); // you can do math
                                       // order of operations 
                                       
        // special characters denoted with the \ (the escape character)
        
        // \n --> new line 
        System.out.print("Hello!  \n\n\n\n");
        System.out.println("He\nllo!");
        
        // \t --> tab 
        System.out.println("Hi\tHi");
        System.out.println("Hi\t\t\t\tHi");
        
        // \\ --> \
        System.out.println("\\");
        
        // \" --> " 
        System.out.println("She said \"Java is the best!\"");
        
        // You try! 
        // Think of a quote or a saying 
        // Create a new class called PrintQuote 
        // Output your saying with visible " " around it 
        
        // Ex. "That's the way the cookie crumbles."
        
        // Use a method to print your quote! 
        
      
        
        
    }
    
}
