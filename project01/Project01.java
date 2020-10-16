/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package project01;

/**     CS2300 Project #1
*      Walker Branson
*      9/26/2020
*/ 
public class Project01 {
    
    public static void stringStuff(){
        
        System.out.println("String Stuff");
        System.out.println("");
        
        String lastName = new String("Branson");
        String firstName = "Walker";
        String fullName = firstName + " " + lastName;
        System.out.println("my name is: "+ fullName);
        System.out.println("I said:     " + fullName.toUpperCase() + "!");
        
        int num = 2;
        System.out.println("\nHello");
        System.out.println("num\n");
        System.out.println("22: " + num + num);
        System.out.println("4:  " + (num + num));
        
    }
    
    public static void numberOutputStuff(){
        
        double oneThird = 1.0 / 3.0;
        System.out.println("\noneThrird = " + oneThird);
        System.out.println("");
        System.out.printf("%f", oneThird);
        System.out.println("");
        
        int a = 2;
        int b = 3;
        double x = 0.666666;
        System.out.printf("\nFraction: %d / %d = %f,", a, b, x);
        
        System.out.printf("\n\n|%f|", oneThird);
        System.out.printf("\n|%20.2f|", oneThird);       
        System.out.printf("\n|%20.12f|", oneThird);    
        System.out.printf("\n|%20.20f|", oneThird);    
        System.out.printf("\n|%-20.2f|", oneThird);    
        System.out.printf("\n|%20.0f|", oneThird);    
        System.out.printf("\n");    
        
    }   
    
    private static void intMathTable(){
        
        System.out.println("\nInteger Math Table.\n");
        System.out.println("");
        headerLine();
        System.out.println("");
        for (int i = 0; i <12; ++i){
            mathLine(i, 5);
            
        }
        
        System.out.println("");
        
    }
            
    private static void headerLine(){
                
        System.out.printf("\n");
        System.out.printf("%12s", "a");
        System.out.printf("%12s", "b");
        System.out.printf("%12s", "a + b");
        System.out.printf("%12s", "a * b");
        System.out.printf("%12s", "a / b");
        System.out.printf("%12s", "a % b");
        
    }
    
    private static void mathLine(int a, int b){
        
        System.out.printf("\n");
        System.out.printf("%12s", "a");
        System.out.printf("%12s", "b");
        System.out.printf("%12s", "a + b");
        System.out.printf("%12s", "a * b");
        System.out.printf("%12s", "a / b");
        System.out.printf("%12s", "a % b");
        
    }
                

    
    
    public static void main(String[] args) {
        
        System.out.println("Project 1.\n\n");
        
        stringStuff();
        
        numberOutputStuff();
        
        intMathTable();

        System.out.println("\n\nBye.\n");
    }
    
}
