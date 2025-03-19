//Dado uma letra, escreva um algoritmo que informe se ela é ou não uma vogal.

import java.util.Scanner;

public class Uni4Exe08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite uma letra: ");
        char letra = scan.next().toLowerCase().charAt(0);
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.print("É vogal");
        } else {
            System.out.print("NÃO é vogal");
        }
        scan.close();
    }    
}
