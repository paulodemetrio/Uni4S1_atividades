//Um casal possui três filhos: Marquinhos, Zezinho e Luluzinha. Faça um algoritmo para ler as idades dos filhos e exibir quem é o caçula da família; suponha que não haja empates.

import java.util.Scanner;

public class Uni4Exe10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Idade de Marquinhos: ");
        int idadeMarquinhos = scan.nextInt();
        System.out.print("Idade de Zezinho: ");
        int idadeZezinho = scan.nextInt();
        System.out.print("Idade de Luluzinha: ");
        int idadeLuluzinha = scan.nextInt();
        if (idadeMarquinhos < idadeZezinho && idadeMarquinhos < idadeLuluzinha) {
            System.out.println("O Marquinhos é o caçula.");
        } else if (idadeZezinho < idadeMarquinhos && idadeZezinho < idadeLuluzinha) {
            System.out.println("O Zezinho é o caçula.");
        } else {
            System.out.println("A Luluzinha é a caçula.");
        }
        scan.close();
    }
}
