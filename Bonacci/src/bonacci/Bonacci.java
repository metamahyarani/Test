/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bonacci;

import java.util.Scanner;

/**
 *
 * @author Praktikan
 */
public class Bonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
             Scanner show = new Scanner(System.in);
        System.out.print("Masukan Angka : ");
        int inputan = show.nextInt();
        long fib[] = new long[inputan];
         
        fib[0] = 0;
        fib[1] = 1;
         
        for(int i = 2; i < inputan; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
         
        for (int i = 0; i < inputan; i++) {
            System.out.print(fib[i] +  " ");
        }
    }
    }
    
}
