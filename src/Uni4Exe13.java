/* Escreva um algoritmo que obtém do usuário 3 valores inteiros representando as três cartas deste usuário em uma mão de jogo de truco (1 = AS; 2 = 2; 3 = 3; 7 = 7; 11 = Valete; 12 = Dama; 13 = Rei). O algoritmo deve imprimir na tela a palavra "TRUCO" (se APENAS UMA das três cartas for AS, 2 ou 3), "SEIS" (se APENAS DUAS das três cartas for AS, 2 ou 3) ou "NOVE" (se AS TRÊS cartas forem AS, 2 ou 3). Se não houver AS, 2 ou 3 nas três cartas, não é impresso nada.
Dica: criar variáveis intermediárias para contar a quantidade de "boas".
*/

import java.util.Scanner;

public class Uni4Exe13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int carta1 = scan.nextInt();
        int carta2 = scan.nextInt();
        int carta3 = scan.nextInt();
        int qtdeCartasBoas = 0;
        /* Validação para caso alguma das cartas não esteja com o devido valor informado, dentro do pré-estabelecido:

        if (carta1 <= 0 || carta1 > 13 || carta2 <= 0 || carta2 > 13 || carta3 <= 0 || carta3 > 13) {
            System.out.println("Valor inválido para a(s) carta(s).");
        } else { */
            if (carta1 == 1 || carta1 == 2 || carta1 == 3) {
                qtdeCartasBoas += 1;
            }
            if (carta2 == 1 || carta2 == 2 || carta2 == 3) {
                qtdeCartasBoas += 1;
            }
            if (carta3 == 1 || carta3 == 2 || carta3 == 3) {
                qtdeCartasBoas += 1;
            };

            if (qtdeCartasBoas == 1) {
                System.out.println("TRUCO");
            } else if (qtdeCartasBoas == 2) {
                System.out.println("SEIS");
            } else if (qtdeCartasBoas == 3) {
                System.out.println("NOVE");
            }
        //};
        scan.close();
    }
}
