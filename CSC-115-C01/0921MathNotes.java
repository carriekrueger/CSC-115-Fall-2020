// Carrie Krueger
// 9-21-20
// Notes on math, casting, constants (Ch. 3); Math class, rounding (Ch. 4)

public class MathNotes {
    public static void main(String[] args) {
        
        doMath(); // let's do some math
    }
    
    // a method to do math things 
    public static void doMath() {
    
        // Division 
        
        System.out.println(5/2);  // 2
        System.out.println(5.0/2);   // 2.5
        
        int num1 = 60;
        int num2 = 50;
        
        System.out.println(num1/num2);  // exact? 
        System.out.println(1.0*num1/num2);  // introduce a DOUBLE LITERAL (works)
        System.out.println((double)num1/num2); // **the right way: CASTING 
        // casting is when you temporarily turn one variable type into another
        // PEMDAS at work... 
        System.out.println((double)(num1/num2)); // nope- cast too late 
        
        // casting TRUNCATES (doesn't round)
        
        double pay = 500.92;
        System.out.println((int)pay);  // 500? 501? truncates- 500
         
        pay = 99.999999999;
        System.out.println((int)pay); // 99 
        
        
        // What if we want to round? 
        // Math: premade java class (like String)
        // many useful methods that do various math things 
        // access with Math.____
        // can send information/variables in the ( )
        
        
        
        // round:  Math.round(double num)
        // returns (gives) a long, need to cast to an int
        
        int roundedPay = (int)Math.round(pay);  // without cast: error
        System.out.println(roundedPay);         // (type mismatch)
        
        
        // EXPONENTS (Powers)
        // ex. num1 squared? 
        // computer doesn't understand () means multiply, or ^ 
        // num1 * num1 
        // OR use Math.pow(base, exponent)  ** returns a double 
        
        double squared = Math.pow(num1, 2);
        System.out.println(squared);  // 3600.0 
        
        
        // CONSTANTS (constant variables)
        // a variable whose value is set once and cannot be changed 
        // proper formatting: all caps, keyword final 
        
        final int NUMBER_OF_STUDENTS = 18; 
        
        double TAX_RATE = 0.08;  // not quite right... 
        
        // Math --> built in constants 
        
        System.out.println(Math.PI);
        
        
     
        
        
    }
}
