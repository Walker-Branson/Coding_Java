/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab05;

/**
 *
 * @author Walker
 */
public class Lab05 {

    /**
     * @param args the command line arguments
     */
    public static double harm(int n) {
        double retVal = 0.0;
        for (int i = 1; i <= n; ++i) {
            retVal += 1.0 / i;
        }
        return retVal;
    }

    public static void harmonicTable(int size) {
        System.out.println("\n\nTable of Harmonic Numbers.\n\n");


        System.out.printf("%4s", "n");
        System.out.printf("%18s", "harm(n)\n\n");
        System.out.printf("%18s", "harm(n) - ln(n)"); // the new line
        System.out.println("");
        System.out.println("");        

        for (int n = 1; n <= size; ++n) {
            System.out.printf("%4d", n);
            System.out.printf("%18.12f", harm(n));
            System.out.printf("%18.12f", harm(n) - Math.log(1.0 * n));
            
            System.out.printf("");
            System.out.println("");
        }

    }

    public static void main(String[] args) {
        System.out.println("Harmonic Numbers.");
        System.out.println("Walker\n");

        System.out.println("Test: H(2) should be 1.5: " + harm(2));

        harmonicTable(10);

    }

}
