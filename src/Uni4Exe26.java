/* Dado um caractere indicando uma opção, escreva um algoritmo para:

se opção = ‘T’: calcular a área de um triângulo de base b e altura h
se opção = ‘Q’: calcular a área de um quadrado de lado l
se opção = ‘R’: calcular a área de um retângulo de base b e altura h
se opção = ‘C’: calcular a área de um círculo de raio r
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni4Exe26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Escolha uma das opções:");
        System.out.println("T - Calcular a área de um triângulo de base B e altura H.");
        System.out.println("Q - Calcular a área de um quadrado de lado L.");
        System.out.println("R - Calcular a área de um retângulo de base B e altura H.");
        System.out.println("C - Calcular a área de um círculo de raio R.");
        char op = scan.next().toUpperCase().charAt(0);
        switch (op) {
            case 'T':
                System.out.print("Base: ");
                int baseTri = scan.nextInt();
                System.out.print("Altura: ");
                int alturaTri = scan.nextInt();
                double areaTri = (baseTri * alturaTri) / 2;
                System.out.println(areaTri);
                break;
            case 'Q':
                System.out.print("Lado: ");
                int lado = scan.nextInt();
                int areaQua = lado * lado;
                System.out.println(areaQua);
            case 'R':
                System.out.print("Base: ");
                int baseRet = scan.nextInt();
                System.out.print("Altura: ");
                int alturaRet = scan.nextInt();
                double areaRet = baseRet * alturaRet;
                System.out.println(areaRet);
            case 'C':
                System.out.print("Raio: ");
                int raio = scan.nextInt();
                double areaCir = Math.PI * Math.pow(raio, raio);
                System.out.println(df.format(areaCir));
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
        scan.close();
    }
}
