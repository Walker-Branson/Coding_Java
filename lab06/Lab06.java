/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package lab06;

/**  Walker Branson
*   CS 2300
*   09/28/2020
*/
public class Lab06 {
    
    
    /**
     * isPrime method tests primality of integers.
     * @param n: The integers to test.
     * @return true if n is prime, false if n is not prime
     */
    public static boolean isPrime(int n){
        
        // negative numbers, 0, and 1 are not prime
        if(n < 2){
            return false;
        }
        
        for(int m = 2; m * m <= n; ++m){
            if (n % m == 0)
                return false;
        }
        
        return true;
        
    }
    
    public static void makePrimeTable(int primesToFind, int primesPerLine){
        
        int widthOfTable = 13 * primesPerLine;
        String stringLeft1 = "Prime Number Table";
        
        String stringRight1 = "CS 2300 Lab Week 06";
        
        int extraSpaces1 = widthOfTable - stringLeft1.length() - 
                stringRight1.length();
        
        // This should print one line of a table header the same width as the table
        System.out.println("");
        System.out.print(stringLeft1);
        
        for (int i = 0; i < extraSpaces1; ++i){
            System.out.print(" "); // one extra space
        }
        System.out.print(stringRight1);
        
        

        String stringLeft2 = "Walker Branson";
        
        String stringRight2 = "2020 09 30";
        
        int extraSpaces2 = widthOfTable - stringLeft2.length() - 
                stringRight2.length();
        
        // This should print one line of a table header the same width as the table
        System.out.println("");
        System.out.print(stringLeft2);
        
        for (int i = 0; i < extraSpaces2; ++i){
            System.out.print(" "); // one extra space
        }
        System.out.print(stringRight2);
        System.out.println("");
        
        
        System.out.println("\n");
        
        int numberFound = 1;
        int candidateNumber = 1;
        
        while (numberFound <= primesToFind){
            if (isPrime(candidateNumber)) {
                
                System.out.printf("%12d ", candidateNumber);
                if(numberFound % primesPerLine == 0){
                    System.out.println("");
                }
                
                numberFound += 1;
            }
            
            candidateNumber += 1;
        }
        
        
        
        
        
    }
    
    
    public static void main(String[] args) {
        
        System.out.println("\nPrime Testing.\n\n");
        
        
        System.out.println("   6 is prime? ( no)... " + isPrime(6));
        
        System.out.println("   7 is prime? (yes)... " + isPrime(7));
        
        System.out.println("7917 is prime? ( no)... " + isPrime(7917));
        
        System.out.println("7919 is prime? (yes)... " + isPrime(7919));
        
        System.out.println("  -1 is prime? ( no)... " + isPrime(-1));
        
        System.out.println("   0 is prime? ( no)... " + isPrime(0));
        
        System.out.println("   1 is prime? ( no)... " + isPrime(1));
        
        System.out.println("54321 is prime? ( ?)... " + isPrime(54321));
        
        System.out.println("\n");
        
        
        makePrimeTable(100, 5);
        
        
        
        
        System.out.println("\n\nBye.\n");
        
    }
    
}
