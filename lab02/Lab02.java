/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02;

/**
 *
 * @author Walker
 */
public class Lab02 {
    public static void main(String[] args) {
        System.out.println("Lab 02 Begin");
        
        System.out.println("\n\nLab 02 End\n");
        
        System.out.println("\nprinting integers:");
        int number = 1;
        for (int i = 0; i < 20; ++i){
            System.out.printf("\nuse 4: %4d, use all 4 %04d, use whatever %d", number, number, number);
            number *= 2;
        }
    }
}
