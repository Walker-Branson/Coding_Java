/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package interval;

/**
*
* @author Walker
*/
public class Interval {
    
    private final double lower;
    private final double upper;
    
    
    public Interval (double lower, double upper){
        if (lower > upper){
            double average = (lower + upper) / 2;
            System.out.println("Bad data overrule. (" + lower + ", " + upper + ") --> (" + average + ", " + average + "). ");
            lower = upper = average;
        }
        this.lower = lower;
        this.upper = upper;
    }
    
    
    
    public Interval (double same){
        this(same, same);
    }
    
    
    public Interval (){
        this(0,0);
    }
    
    
    
    
    @Override
    public String toString(){
        return ("[" + lower + ", " + upper + "]");
    }
    
    
    
    public Interval plus(Interval rhs){
        return new Interval (this.lower + rhs.lower, this.upper + rhs.upper);
    }
    
    
    
    
    public double getMidpoint(){
        return (this.upper + this.lower) / 2;
    }
    
    
    
    public double getRadius() {
        return (this.upper - this.lower) / 2;
    }
    
    
    
    public static void main(String[] args){
        System.out.println("Interval class by Walker Branson");
        System.out.println("CS 2300 Lab08 Thursday 11:07 AM\n\n");
        
        Interval banana = new Interval (4,14);
        System.out.println("banana = " + banana);
        Interval apple = new Interval(4, -2);
        System.out.println("apple = " + apple);
        Interval crisp = new Interval(4);
        System.out.println("crisp = " + crisp);
        Interval zero = new Interval();
        System.out.println("zero = " + zero);
        Interval unit = new Interval(0,1);
        System.out.println("unit = " + unit);
        
        System.out.println("");
        
        Interval i_5_15 = banana.plus(unit);
        System.out.println("i_5_15 = " + i_5_15);
        
        System.out.println("");
        
        double bananaMP = banana.getMidpoint();
        System.out.println("bananaMP = " + bananaMP);
        double bananaR = banana.getRadius();
        System.out.println("bananaR = " + bananaR);
        
        System.out.println("\n\nBye.\n\n");
    }
    
    
    
}
