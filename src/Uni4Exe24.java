/* Dados 3 valores, escreva um algoritmo que os informe em uma determinada ordem a partir de um menu de opções:

se opção = 1, escreva os 3 valores em ordem crescente
se opção = 2, escreva os 3 valores em ordem decrescente
se opção = 3, escreva os 3 valores de forma que o maior valor fique no meio
*/

import java.util.Scanner;

public class Uni4Exe24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Valor 1: ");
        int v1 = scan.nextInt();
        System.out.print("Valor 2: ");
        int v2 = scan.nextInt();
        System.out.print("Valor 3: ");
        int v3 = scan.nextInt();
        System.out.println("Escolha uma das opções: ");
        System.out.println("1 - Ordem Crescente");
        System.out.println("2 - Ordem Decrescente");
        System.out.println("3 - Maior valor no meio");
        int op = scan.nextInt();
        int maior = 0;
        int medio = 0;
        int menor = 0;
        if (v1 > v2 && v1 > v3) {
            maior = v1;
            if (v2 > v3) {
                medio = v2;
                menor = v3;
            } else {
                medio = v3;
                menor = v2;
            }
        } else if (v2 > v1 && v2 > v3) {
            maior = v2;
            if (v1 > v3) {
                medio = v1;
                menor = v3;
            } else {
                medio = v3;
                menor = v1;
            }
        } else if (v3 > v1 && v3 > v2) {
            maior = v3;
            if (v1 > v2) {
                medio = v1;
                menor = v2;
            } else {
                medio = v2;
                menor = v1;
            }
        };
        switch (op) {
            case 1:
                System.out.println(menor + " " + medio + " " + maior);
                break;
            case 2:
                System.out.println(maior + " " + medio + " " + menor);
                break;
            case 3:
                System.out.println(medio + " " + maior + " " + menor);
            default:
                break;
        }
        scan.close();
    }
}
