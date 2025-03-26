/* Faça um algoritmo que escreva o menu abaixo, leia uma opção do usuário e execute a operação correspondente. O algoritmo deve exibir uma mensagem de erro se a opção for inválida. O menu tem as seguintes opções:
Escolha uma opção:
1 - Soma de dois números.
2 - Diferença entre dois números.
3 - Produto entre dois números.
4 - Divisão entre dois números (o denominador não pode ser zero).
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni4Exe25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Valor 1: ");
        double v1 = scan.nextDouble();
        System.out.println("Valor 2: ");
        double v2 = scan.nextDouble();
        System.out.println("Escolha uma das opções para operação:");
        System.out.println("1 - Soma de dois números.");
        System.out.println("2 - Diferença entre dois números.");
        System.out.println("3 - Produto entre dois números.");
        System.out.println("4 - Divisão entre dois números (o denominador não pode ser zero).");
        int op = scan.nextInt();
        switch (op) {
            case 1:
                double soma = v1 + v2;
                System.out.println(soma);
                break;
            case 2:
                double dif = v1 - v2;
                System.out.println(dif);
                break;
            case 3:
                double mult = v1 * v2;
                System.out.println(mult);
                break;
            case 4:
                double div = v1 / v2;
                System.out.println(df.format(div));
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
        scan.close();
    }
}
