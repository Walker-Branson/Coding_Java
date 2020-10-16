/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package rational;

import static rational.Rational.greatestCommonDivisor;

/**
*
* @author Walker
*/
public class Tests {
    
    
    
    public static void testMath() {
        Rational threeHalves = new Rational (3, 2);
        Rational oneQuarter = new Rational(1, 4);
        Rational zero = new Rational();
        Rational five = new Rational(5);
        Rational one = new Rational (1);
        System.out.println("should be 7/4  : " + threeHalves.plus(oneQuarter));
        System.out.println("should be 7/4  : " + oneQuarter.plus(threeHalves));
        System.out.println("should be 3/1  : " + threeHalves.plus(threeHalves));
        System.out.println("should be 13/2 : " + threeHalves.plus(five));
        System.out.println("should be 3/2  : " + threeHalves.plus(zero));

        System.out.println("");
        
        System.out.println("should be 5/4  : " + threeHalves.minus(oneQuarter));
        System.out.println("should be -5/4 : " + oneQuarter.minus(threeHalves));
        System.out.println("should be 0/1  : " + threeHalves.minus(threeHalves));
        System.out.println("should be -7/2 : " + threeHalves.minus(five));
        System.out.println("should be 3/2  : " + threeHalves.minus(zero));
        
        System.out.println("");
        
        System.out.println("should be 3/8  : " + threeHalves.times(oneQuarter));
        System.out.println("should be 3/8  : " + oneQuarter.times(threeHalves));
        System.out.println("should be 9/4  : " + threeHalves.times(threeHalves));
        System.out.println("should be 15/2 : " + threeHalves.times(five));
        System.out.println("should be 0/1  : " + threeHalves.times(zero));
        
        System.out.println("");
        
        System.out.println("should be 6/1  : " + threeHalves.dividedby(oneQuarter));
        System.out.println("should be 1/6  : " + oneQuarter.dividedby(threeHalves));
        System.out.println("should be 1/1  : " + threeHalves.dividedby(threeHalves));
        System.out.println("should be 3/10 : " + threeHalves.dividedby(five));
        System.out.println("should be 3/2  : " + threeHalves.dividedby(one));
        
    }
    
    
    public static void main(String[] args){
        System.out.println("\nStart Rational Tests.\n");
        
//        testGcd();
        
//        testCTors();
        
        testMath();
        
//        exam();
        
        System.out.println("\nEnd Rational Tests.\n");
    }
    
    
    public static void testGcd(){
        System.out.println("");
        System.out.println("Test Greatest Common Divisor");
        System.out.println("");
        for (long i = -21; i < 31; i += 2){
            for (long j = -17; j < 31; j += 3){
                System.out.printf("\n(%5d,%5d) --> %5d", i, j,
                        greatestCommonDivisor(i, j));
            }
        }
        System.out.println("");
    }
    
    
    public static void testCTors(){
        System.out.println("Rational tests.");
        System.out.println("");
        System.out.println("Test C-tor");
        System.out.println("Expected outcome: 4/25, -4/25, -4/25, "
                + "4/25, 17/1, 0/1.");
        System.out.println("");
        Rational rat01 = new Rational(144, 900);
        Rational rat02 = new Rational(-144, 900);
        Rational rat03 = new Rational(144, -900);
        Rational rat04 = new Rational(-144, -900);
        Rational rat05 = new Rational(17);
        Rational rat06 = new Rational();
        System.out.println("rat01 = " + rat01);
        System.out.println("rat02 = " + rat02);
        System.out.println("rat03 = " + rat03);
        System.out.println("rat04 = " + rat04);
        System.out.println("rat05 = " + rat05);
        System.out.println("rat06 = " + rat06);
        
        System.out.println("");
        System.out.println("Try bad input");
        try {
            Rational rat00 = new Rational(0, 0);
        } catch (ZeroDenomException zde) {
            System.out.println("Expected Zero Denominator Exception. "
                    + zde);
        } catch (Exception e) {
            System.out.println("This should never happen.");
        }
        System.out.println("");
        
        System.out.println("");
        System.out.println("Test toDouble. Expect 0.16");
        System.out.println("rat04 to double: " + rat04.toDouble());

    }
    
    
    public static void exam() {
        Rational a = new Rational(1284, 2889);
        Rational b = new Rational(385, 462);
        Rational c = new Rational();
        System.out.println(" 1: " + a);
        System.out.println(" 2: " + b);
        System.out.println(" 3: " + b.plus(a));
        System.out.println(" 4: " + b.minus(c));
        System.out.println(" 5: " + b.times(a));
        System.out.println(" 6: " + a.dividedby(b));
        System.out.println(" 7: " + a.dividedby(a));
        System.out.println(" 8: " + a.times(a));
        System.out.println(" 9: " + a.times(c));
        try {
            System.out.print("10: ");
            System.out.println(a.dividedby(c));
        } catch (ZeroDenomException zde) {
            System.out.println("ZeroDenomException");
        }
    }

    
}
