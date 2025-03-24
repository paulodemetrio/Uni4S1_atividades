/* Dadas 3 notas obtidas por um aluno em 3 provas e a média dos exercícios, descreva um algoritmo que calcule a média de aproveitamento e o conceito do aluno, usando a fórmula:

media = (notaProva1 + notaProva2 * 2 + notaProva3 * 3 + notaExercicios)/7

A atribuição dos conceitos obedece à tabela abaixo:
    media	         conceito
>= 9.0                  A
>= 7.5 e < 9.0	        B
>= 6.0 e < 7.5	        C
>= 4.0 e < 6.0	        D
< 4.0	                E

O algoritmo deve escrever a média de aproveitamento, o conceito correspondente e a mensagem "aprovado" caso o conceito seja A, B ou C, e "reprovado" caso o conceito seja D ou E.

*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni4Exe20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        double nota1 = scan.nextDouble();
        double nota2 = scan.nextDouble();
        double nota3 = scan.nextDouble();
        double mediaExe = scan.nextDouble();
        double mediaAprov = (nota1 + nota2 * 2 + nota3 * 3 + mediaExe) / 7;
        if (mediaAprov >= 9.0) {
            System.out.println("A média de aproveitamento foi: " + df.format(mediaAprov) + ". Conceito: A. Aprovado");
        } else if (mediaAprov >= 7.5 && mediaAprov < 9.0) {
            System.out.println("A média de aproveitamento foi: " + df.format(mediaAprov) + ". Conceito: B. Aprovado");
        } else if (mediaAprov >= 6.0 && mediaAprov < 7.5) {
            System.out.println("A média de aproveitamento foi: " + df.format(mediaAprov) + ". Conceito: C. Aprovado");
        } else if (mediaAprov >= 4.0 && mediaAprov < 6.0) {
            System.out.println("A média de aproveitamento foi: " + df.format(mediaAprov) + ". Conceito: D. Reprovado");
        } else if (mediaAprov < 4.0) {
            System.out.println("A média de aproveitamento foi: " + df.format(mediaAprov) + ". Conceito: E. Reprovado");
        }
        scan.close();
    }
}
