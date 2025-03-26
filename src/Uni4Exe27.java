/* As tarifas de um estacionamento são as seguintes:

1° e 2° hora - R$ 5,00 cada
3° e 4° hora - R$ 7,50 cada
5° hora e seguintes - R$ 10,00 cada

O número de horas a pagar é sempre inteiro e arredondado para cima ou para baixo dependendo do tempo. Até 29 minutos depois da chegada, arredonda-se para baixo e após 30 minutos arredonda-se para cima. Por exemplo, quem estacionar durante 1 hora e 15 minutos pagará por 1 hora e quem estacionar por 1 hora e 35 minutos pagará por duas horas. Entretanto, se a pessoa permaneceu menos de 30 minutos, também pagará por uma hora. Os horários de chegada e partida são apresentados na forma de pares de inteiros, representando horas e minutos. Por exemplo, o par 12 50 representará meio dia e cinquenta. Assim, faça um algoritmo que leia os horários de chegada e de partida e escreva na tela o tempo que ficou estacionado, e o preço a ser cobrado. Deverá haver validação de dados. Admite-se que a chegada e a partida se dão com intervalo não superior a 24 horas, e sempre chegam e saem no mesmo dia.
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni4Exe27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.print("Hora de chegada: ");
        int horaC = scan.nextInt();
        System.out.print("Minutos de chegada: ");
        int minC = scan.nextInt();
        System.out.print("Hora de saída: ");
        int horaS = scan.nextInt();
        System.out.print("Minutos de saída: ");
        int minS = scan.nextInt();

        if (horaC < 0 || horaC > 23 || minC < 0 || minC > 59 || horaS < 0 || horaS > 23 || minS < 0 || minS > 59) {
            System.out.println("Horário inválido.");
        } else {
            int minTotal = (horaS * 60 + minS) - (horaC * 60 + minC);
            if (minTotal < 0) {
                System.out.println("Horário de saída não pode ser anterior ao horário de chegada.");
            } else {
                int horaTotal = minTotal / 60;
                if (minTotal % 60 > 0) {
                    horaTotal++;
                }
                double preco = 0;
                switch (horaTotal) {
                    case 1:
                    case 2:
                        preco = horaTotal * 5;
                        break;
                    case 3:
                    case 4:
                        preco = 2 * 5 + (horaTotal - 2) * 7.5;
                        break;
                    default:
                        if (horaTotal > 4) {
                            preco = 2 * 5.0 + 2 * 7.5 + (horaTotal - 4) * 10.0;
                        }
                        break;
                }
                System.out.println("Tempo total estacionado: " + horaTotal + " hora(s).");
                System.out.printf("Preço a pagar: R$ " + df.format(preco));
            }
        }
        scan.close();
    }
}