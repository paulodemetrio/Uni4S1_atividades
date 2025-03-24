/* O índice de massa corporal (IMC) é uma medida internacional usada para calcular se uma pessoa está no peso ideal. O IMC é determinado pela divisão da massa do indivíduo pelo quadrado de sua altura, onde a massa está em quilogramas e a altura está em metros, de acordo com a fórmula:

IMC= Massa / (Altura^2)

Faça um algoritmo para classificar o IMC e dizer o grau de obesidade do indivíduo, de acordo com a seguinte tabela: */

import java.util.Scanner;

public class Uni4Exe21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Altura: ");
        double altura = scan.nextDouble();
        System.out.print("Massa: ");
        double massa = scan.nextDouble();
        double imc = massa / (Math.pow(altura, 2));
        if (imc < 18.5) {
            System.out.println("Magreza");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Saudável");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Sobrepeso");
        } else if (imc >= 30 && imc <= 34.9) {
            System.err.println("Obesidade Grau I");
        } else if (imc >= 35 && imc <= 39.9) {
            System.out.println("Obesidade Grau II (severa)");
        } else if (imc >= 40) {
            System.out.println("Obesidade Grau III (mórbida)");
        }
        scan.close();
    }
}
