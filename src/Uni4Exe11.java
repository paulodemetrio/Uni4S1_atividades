//Escreva um algoritmo para ler o ano de nascimento de 3 irmãos, escrever uma mensagem que indique se eles são TRIGÊMEOS, GÊMEOS, APENAS IRMÃOS. Considere que eles são GÊMEOS se dois deles possuem a mesma idade e o outro diferente dos demais, e apenas irmãos se todas as idades forem diferentes.

import java.util.Scanner;
public class Uni4Exe11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ano1 = scan.nextInt();
        int ano2 = scan.nextInt();
        int ano3 = scan.nextInt();
        if (ano1 == ano2 && ano1 == ano3) {
            System.out.println("TRIGÊMEOS");
        } else if ((ano1 == ano2 && ano1 != ano3) || (ano1 == ano3 && ano1 != ano2) || (ano2 == ano3 && ano2 != ano1)) {
            System.out.println("GÊMEOS");
        } else {
            System.out.println("APENAS IRMÃOS");
        }
        scan.close();
    }
}
