//Dada uma pergunta, “a cor é azul?”, faça um programa que leia uma variável lógica com a resposta e responda “Sim”, caso a resposta seja true, ou “Não”, caso seja false.

import java.util.Scanner;

public class Uni4Exe05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("A cor é azul? (true/false) ");
        boolean v = scan.nextBoolean();
        if(v){
            System.out.println("Sim");
        }else{
            System.out.println("Não");
        }
        scan.close();
    }    
}