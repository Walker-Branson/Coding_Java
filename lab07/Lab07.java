/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package lab07;

/**
*    Walker Branson
*     CS 2300
*     Lab 07:
*     TwoInts class
*     10/09/2020
*/
public class Lab07 {
    
    
    private final int a;
    private final int b;
   
    
    public Lab07(int a, int b) {
            this.a = a;
            this.b = b;
    }

    
    public String toString() {
        return "<" + a + ", " + b + ">";
    }
    
    
    public int getA(){
        return a;
    }
    
    public int getB() {
        return b;
    }
    
    
    
    public boolean aIsPos() {
        if (a > 0){
        return true;
        }
        else {
        return false;
        }
    }
    
    
    public boolean bIsPos() {
        if (b > 0) {
        return true;
        } else {
            return false;
        }
    }
    
    

    
    
    
    
    
    public static void main(String[] args) {
        System.out.println("");
        
        
        Lab07 blue = new Lab07(4,11);
        System.out.println("blue = " + blue);
        
        System.out.println("");
        
        Lab07 green = new Lab07(14, -1);
        System.out.println("green = " + green);
        
        System.out.println("");
        
        
        
        System.out.println("blue.a is:  " + blue.getA());
        
        if (blue.aIsPos()){
            System.out.println("Yep, a is positive!");
        } else {
            System.out.println("Nope, a is not positive!");
        }        
        System.out.println("");
        
        
        
        System.out.println("blue.b is:  " + blue.getB());
        
        if (blue.bIsPos()) {
            System.out.println("Yep, b is positive!");
        } else {
            System.out.println("Nope, b is not positive!");
        }        
        System.out.println("");
        
        
        
        System.out.println("green.a is: " + green.getA());
        
        if (green.aIsPos()) {
            System.out.println("Yep, a is positive!");
        } else {
            System.out.println("Nope, a is not positive!");
        }     
        System.out.println("");
        
        
        
        System.out.println("green.b is: " + green.getB());
        
        if (green.bIsPos()) {
            System.out.println("Yep, b is positive!");
        } else {
            System.out.println("Nope, b is not positive!");
        }
        
        
        
        System.out.println("");
    }

}
