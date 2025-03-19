//Uma empresa tem para um funcionário os seguintes dados: o nome, o número de horas trabalhadas mensais e o número de dependentes.A empresa paga R$ 10,00 por hora(valor para cálculo do salário trabalho)e R$ 60,00 por dependente(valor para cálculo do salário família)e são feitos descontos de 8,5%sobre o salário trabalho para o INSS e de 5%sobre o salário trabalho para o imposto de renda.Descreva um programa que informe o nome,o salário bruto e o salário líquido do funcionário.

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe12 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         DecimalFormat df = new DecimalFormat("0.00");

         System.out.print("Nome: ");
         String nome = scanner.nextLine();

         System.out.print("Quantidade de horas trabalhadas no mês: ");
         int horasTrabalhadas = scanner.nextInt();

         System.out.print("Número de dependentes: ");
         int dependentes = scanner.nextInt();

         double salarioTrabalho = horasTrabalhadas * 10.0;
         double salarioFamilia = dependentes * 60.0;
         double salarioBruto = salarioTrabalho + salarioFamilia;

         double descontoINSS = salarioTrabalho * 0.085;
         double descontoIR = salarioTrabalho * 0.05;
         double salarioLiquido = salarioBruto - descontoINSS - descontoIR;

         System.out.println("O funcionário " + nome + " possui um salário bruto de R$ " + df.format(salarioBruto) + " e um salário líquido de R$ " + df.format(salarioLiquido));
         scanner.close();
     }
}