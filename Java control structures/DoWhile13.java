/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosTema3BucleDoWhile;

/**
 *
 * @author Ivan
 */
public class DoWhile13 {

    public static void main(String[] args) {
        int num = 0;

        do {
            if (num % 2 == 0) {
                
                System.out.println(num);
            }
            ++num;
        } while (num <= 100);

    }

}
