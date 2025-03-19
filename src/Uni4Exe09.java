//Dados dois valores inteiros, escreva um algoritmo que informe se eles são múltiplos ou não.

import java.util.Scanner;

public class Uni4Exe09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int valor1 = scan.nextInt();
        int valor2 = scan.nextInt();
        if (valor1 % valor2 == 0 || valor2 % valor1 == 0) {
            System.out.print("Os valores são múltiplos.");
        } else {
            System.out.print("Os valores não são múltiplos.");
        }
        scan.close();
    }
}
