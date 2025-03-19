//Dados dois números inteiros descreva um algoritmo para informar o maior valor entre eles.

import java.util.Scanner;

public class Uni4Exe03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        if (n1 > n2) {
            System.out.println("O valor " + n1 + " é maior do que o valor " + n2);
        } else if (n2 > n1) {
            System.out.println("O valor " + n2 + " é maior do que o valor " + n1);
        } else {
            System.out.println("Os valores são iguais");
        }
        scan.close();
    }    
}
