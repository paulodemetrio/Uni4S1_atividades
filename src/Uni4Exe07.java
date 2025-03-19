//O custo do selo de uma carta com até 50 gramas é de R$ 0,45. As cartas com peso superior pagam um adicional de R$ 0,45 por cada 20 gramas, ou fração, em que excedem aquele peso. Escreva um algoritmo que dado o peso da carta, em gramas, determine o custo do selo.

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni4Exe07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        double peso = scan.nextDouble();
        double valorPagar = 0;
        if (peso <= 50) {
            valorPagar = 0.45;
        } else {
            double pesoExcedido = peso - 50;
            double qtAdicional = (pesoExcedido / 20) + 1;
            valorPagar = 0.45 + (0.45 * qtAdicional);
        }
        System.out.println(df.format(valorPagar));
        scan.close();
    }
}
