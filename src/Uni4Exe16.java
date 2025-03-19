//Escreva um algoritmo que leia a idade de 2 homens e 2 mulheres (considere que a idade entre homens e mulheres sempre serão diferentes). Calcule e escreva a soma das idades do homem mais velho com a mulher mais nova, e o produto das idades do homem mais novo com a mulher mais velha.

import java.util.Scanner;

public class Uni4Exe16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a idade do primeiro homem:  ");
        int idadeHomem1 = scan.nextInt();
        System.out.println("Informe a idade do segundo homem:  ");
        int idadeHomem2 = scan.nextInt();
        System.out.println("Informe a idade da primeira mulher:  ");
        int idadeMulher1 = scan.nextInt();
        System.out.println("Informe a idade da segunda mulher:  ");
        int idadeMulher2 = scan.nextInt();
        int soma = 0;
        int produto = 0;

        if (idadeHomem1 > idadeHomem2) {
            if (idadeMulher1 > idadeMulher2) {
                soma = idadeHomem1 + idadeMulher2;
            } else {
                soma = idadeHomem2 + idadeMulher1;
            }
        } else {
            if (idadeMulher1 > idadeMulher2) {
                soma = idadeHomem2 + idadeMulher2;
            } else {
                soma = idadeHomem2 + idadeMulher1;
            }
        };

        if (idadeHomem1 > idadeHomem2) {
            if (idadeMulher1 > idadeMulher2) {
                produto = idadeHomem2 * idadeMulher1;
            } else {
                produto = idadeHomem2 * idadeMulher2;
            }
        } else {
            if (idadeMulher1 > idadeMulher2) {
                produto = idadeHomem1 * idadeMulher1;
            } else {
                produto = idadeHomem1 * idadeMulher2;
            }
        };
        System.out.println("Soma: " + soma + " Produto: " + produto);
        scan.close();
    }
}
