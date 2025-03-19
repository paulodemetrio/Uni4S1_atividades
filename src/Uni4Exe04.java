//Dado um número de ponto flutuante maior do que 0, informe se foram digitadas ou não casas decimais no número.

import java.util.Scanner;
public class Uni4Exe04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n = scan.nextDouble();
        double nInteiro = (int) n;
        double nDecimal = n - nInteiro;
        if (nDecimal == 0) {
            System.out.println("Casas decimais não foram digitadas.");
        } else {
            System.out.println("Casas decimais foram digitadas.");
        }
        scan.close();
    }
}
