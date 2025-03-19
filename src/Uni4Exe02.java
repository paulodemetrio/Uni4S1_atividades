//Dado um valor inteiro maior do que 0 informe se o valor é par ou ímpar.

import java.util.Scanner;
public class Uni4Exe02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n % 2 == 0) {
            System.out.println("Número é par");
        } else {
            System.out.println("Número é ímpar");
        }
        scan.close();
    }
}
