// Carrie Krueger
// 9-11-20
// Chapter 2 Notes: Output and Escape Sequences 

public class Ch2Escape {
    public static void main(String[] args) {
        escape();  // this method will explore output and escape seq.
    }
    
    // a method to investigate output and escape sequences
    public static void escape() {
        //print vs. println
        System.out.print("Hello Class!");   //next thing prints on 
        System.out.println("It's Friday!!!"); // same line (no ln)
        // ln --> next thing prints on next line 
        
        System.out.println(); // prints out a blank line
        
        System.out.println("Weekend yay!");
        
        // OUTPUT 
        System.out.println(2); // you can put text or numbers in a 
                               // print statement 
                               
        System.out.println(1 + 2 * 3);  // order of operations 
        
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
        
        // Think of a quotation or a saying 
        // Create a new class called PrintQuote.java 
        // Output your quote with visible " " around it 
        // Ex. "That's the way the cookie crumbles"
        
        // Use a method to print your quote!
        

        
    }
}
