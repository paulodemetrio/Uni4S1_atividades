/* Dadas as coordenadas (X e Y) de um Ponto, você deve informar em qual quadrante ele está localizado

0, se os dois valores forem zero
1, se os dois valores forem positivos
2, se o x for negativo e o y, positivo 
3, se os dois valores forem negativos
4, se o x for positivo e o y, negativo 
*/

import java.util.Scanner;

public class Uni4Exe19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("X: ");
        int x = scan.nextInt();
        System.out.print("Y: ");
        int y = scan.nextInt();
        if (x == 0 && y == 0) {
            System.out.println("Quadrante 0");
        } else if (x > 0 && y > 0) {
            System.out.println("Quadrante 1");
        } else if (x < 0 && y > 0) {
            System.out.println("Quadrante 2");
        } else if (x < 0 && y < 0) {
            System.out.println("Quadrante 3");
        } else if (x > 0 && y < 0) {
            System.out.println("Quadrante 4");
        };
        scan.close();
    }
}
