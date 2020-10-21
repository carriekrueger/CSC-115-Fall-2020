// Carrie Krueger
// 10-21-20
// All about while loops 


public class WhileLoops {
    public static void main(String[] args) {
        
       loops(); // while loops
    }
    
    // this method looks at while loops 
    public static void loops() {
        
        // Ask a question once: if-else statement 
        // Ask a question repeatedly (or do something repeatedly):
        // loop (while loop)
        
        // LOOP RULES: 
        
        // When you program a loop, you should know that it will
        // DEFINITELY end once some condition has occurred 
        
        // Usually you will have to increment some variable
        // so that the loop will approach the end state 
        // LCV (loop control variable)
        
        
        // WAY TO INCREMENT A VARIABLE (3.7 in textbook)
        
        int count = 0; 
        // how to add 1? 
        
        count = count + 1; // adds 1 and saves the value (assigns)
                           // to count 
                           
        count += 1; // compound operator (shortcut) 
        count++; // another common way to increment by 1 
        
        // Use curly braces { } around while loop code!!!
        
        // HERE COMES A LOOP!
        
        int counter = 0;
        
        // ends when the value of counter is 5 
        while(counter != 5) {
            counter += 1;  //increment counter (get it to 5)
            System.out.println(counter);
        }
        
        // how many times does this loop run? // 5 times
        // can adjust start/end/increment values, also could use < or >
        
        int num = 0;
        
        while(num < 3) {
            System.out.println(num);
        }
        
        // infinite loop of doom!!! 
        // Ctrl+c escape / break out of the loop in the terminal
        // needs incrementor
        
        
        // LIVE CODE DEMOS in Blackboard 
        
    
        
        
        
    }
}
