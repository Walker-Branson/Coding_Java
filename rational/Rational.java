/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package rational;

/**
*
* @author Walker
*/
public class Rational {
    
    // the numer and denom fields represent a fraction
    // CLASS INVARIANTS:
    // CI1: denom is not 0,
    // CI2: denom is positive,
    // CT3: numer and denom are in the lowest term.
    
    private final long numer;
   private final long denom;
    
    
    // full service c-tor for fractions
    public Rational(long numer, long denom) {
        // CI1. Cannot fix -- must throw exception.
        if (denom == 0) {
            throw new ZeroDenomException();
        }
        // CI2. Can fix.
        if (denom < 0) {
            numer *= -1;
            denom *= -1;
        }
        // CI3. Can fix.
        long gcd = greatestCommonDivisor(numer, denom);
        if (gcd != 1) {
            numer /= gcd;
            denom /= gcd;
        }    
        // all class invariants now satisfied, initialize fields:
        this.numer = numer;
        this.denom = denom;
    }
    
    
    // one arg c-tor for longs
    public Rational(long number) {
        this(number, 1);
    }
    
    
    // one arg c-tor for longs
    public Rational() {
        this(0, 1);
    }
    
    
    // toString and toDouble
    public String toString() {
        return numer + " / " + denom;
    }
    
    
    public double toDouble() {
        return 1.0 * numer / denom;
    }


    
    
    public static long greatestCommonDivisor(long a, long b){
        long c;
        while(b != 0){
            c = a % b;
            a = b;
            b = c;
        }
        return Math.abs(a);
    }
    
    
    // adds the rhs object to the calling object
    // using a/b + c/d = (ad + bc) / bd
    public Rational plus(Rational rhs){
        long up = numer * rhs.denom + rhs.numer * denom;
        long dn = denom * rhs.denom;
        return new Rational(up, dn);
    }
    
    
    public Rational minus(Rational rhs){
        long up = numer * rhs.denom - rhs.numer * denom;
        long dn = denom * rhs.denom;
        return new Rational(up, dn);
    }
    
   //ned to fix these 2 methods 
    public Rational times(Rational rhs){
        long up = numer * rhs.numer;
        long dn = denom * rhs.denom;
        return new Rational(up, dn);
    }
    
    
    public Rational dividedby(Rational rhs) {
        long up = numer * rhs.denom;
        long dn = denom * rhs.numer;
        return new Rational(up, dn);
    }
    
    
}
