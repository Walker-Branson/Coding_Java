/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03;

/**
 *
 * @author Walker
 */
public class Lab03 {

    public static void main(String[] args) {
        System.out.println("Elementary Control Structures\n\n");

        System.out.println("\nExpression Values");

        int e = 4;

        System.out.println("e < 10:    " + (e < 10));

        System.out.println("e < 4:    " + (e < 4));

        System.out.println("e <= 4:    " + (e <= 4));

        System.out.println("e == 4:    " + (e == 4));

        System.out.println("e != 4:    " + (e != 4));

        System.out.println("e % 2 == 0:    " + (e % 2 == 0));

        System.out.println("true:    " + true);

        System.out.println("not true:    " + !true);

        System.out.println("\nTwo meanings for + operator");

        System.out.println("concatenation:" + e + e);

        System.out.println("addition:     " + (e + e));

        for (int i = 1; i < 10; ++i) {
            System.out.println(i + i);
        }

        for (int i = 1; i <= 20; ++i) {
            if (i % 2 == 0) {
                System.out.println(i + " is even.");
            } else {
                System.out.println(i + " is odd.");
            }
        }
        
        int total = 0;
        for (int i = 1; i <= 20; ++i){
            total += i;
        }
        System.out.println("total is " + total);

        System.out.println("\n\nGoodbye.\n\n");
    }
}

