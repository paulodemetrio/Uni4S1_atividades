//Uma loja que trabalha com crediário funciona da seguinte maneira: se o pagamento ocorre até o dia do vencimento, o cliente ganha 10% de desconto e é avisado que o pagamento está em dia. Se o pagamento é realizado até cinco dias após o vencimento o cliente perde o desconto, e se o pagamento atrasa mais de cinco dias, é cobrada uma multa de 2% por cada dia de atraso. Faça um algoritmo que leia o dia do vencimento, o dia do pagamento e o valor da prestação e calcule o valor a ser pago pelo cliente, exibindo as devidas mensagens. Suponha que todo vencimento ocorre até o dia dez de cada mês e os clientes nunca deixam para pagar no mês seguinte.

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni4Exe18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Dia do vencimento: ");
        int diaVenc = scan.nextInt();
        System.out.println("Dia do pagamento: ");
        int diaPagto = scan.nextInt();
        System.out.println("Valor da prestação: ");
        double valorPrestacao = scan.nextInt();
        if (diaPagto <= diaVenc) {
            double valorFinal = valorPrestacao - (valorPrestacao * 0.1);
            System.out.println("O pagamento está em dia. O valor da prestação = R$" + df.format(valorFinal));
        } else if (diaPagto == (diaVenc + 1) || diaPagto == (diaVenc + 2) || diaPagto == (diaVenc + 3) || diaPagto == (diaVenc + 4) || diaPagto == (diaVenc + 5)) {
            System.out.println("O pagamento está atrasado. O valor da prestação não mudou: R$" + df.format(valorPrestacao));
        } else {
            double diasAtrasados = diaPagto - diaVenc;
            double valorJuros = valorPrestacao + ((valorPrestacao * 0.02) * diasAtrasados);
            System.out.println("O pagamento está atrasado. Multa de 2% por dia de atraso. Valor da prestação = R$ " + df.format(valorJuros));
        }
        scan.close();
    }
}
