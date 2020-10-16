/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04scanner;

import java.util.Scanner;

/**
 *
 * @author Walker
 */
public class Lab04Scanner {
    private static Scanner scanner = new Scanner (System.in);
    
    public static void taskInt(){
        System.out.println("\nEnter an integer: ");
        int input = scanner.nextInt();
        System.out.println("You entered: " + input + ".");
    }
    
    public static void taskDouble(){
        System.out.println("\nEnter a double: ");
        double input = scanner.nextDouble();
        System.out.println("You entered: " + input + ".");
    }

    public static void taskLine(){
        System.out.println("\nEnter a line of text: ");
        String input = scanner.nextLine();
        System.out.println("Your input text is " + input + ".");
    }
    
    public static void taskFirstName(){
        System.out.println("\nEnter your name first name: ");
        String input = scanner.nextLine();
        System.out.println("You entered " + input + ".");
        int indexOfBlank = input.indexOf(" ");
        System.out.println("first name: " + input + ",");
    }
    
    public static void taskLastName(){
        System.out.println("\nEnter your name last name: ");
        String input = scanner.nextLine();
        System.out.println("You entered " + input + ".");
        int indexOfBlank = input.indexOf(" ");
        System.out.println("last name: " + input + ".");
    }
    
    
    public static void main(String[] args) {
        System.out.println("Lab 04. Start of Scanner Project.\n");
        
        taskInt();
        
        taskDouble();
        
        taskLine();
        
        taskFirstName();
        
        taskLastName();
        
        System.out.println("\n\nEnd of Scanner Project. Bye.");
    }
}


