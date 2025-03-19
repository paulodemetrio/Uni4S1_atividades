//Faça um algoritmo que leia um caractere. Caso seja digitada a letra 'M' escreva “Masculino”. Se for digitada a letra 'F' escreva “Feminino”. Se for informado 'I' escreva “Não Informado”. Qualquer outra letra digitada escreva “Entrada Incorreta”. Atenção: antes de testar a letra, converta-a para maiúscula.

import java.util.Scanner;

public class Uni4Exe06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char letra = scan.next().toUpperCase().charAt(0);
        if (letra == 'M') {
            System.out.println("Masculino");
        } else if (letra == 'F') {
            System.out.println("Feminino");
        } else if (letra == 'I') {
            System.out.println("Não Informado");
        } else {
            System.out.println("Entrada Incorreta");
        }
        scan.close();
    }    
}