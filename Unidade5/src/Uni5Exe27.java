import java.util.Scanner;

public class Uni5Exe27 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int dia = 0;
        int manha = 0;
        int tarde = 0;
        int opcao = 1;
        int maiorProducao = 0;
        int diaMaiorProducao = 0;
        double valorDiario = 0;

        while (opcao == 1) {
            System.out.print("Dia do mês de abril (1 a 30): ");
            dia = teclado.nextInt();

            while (dia < 1 || dia > 30) {
                if (dia < 1 || dia > 30) {
                    System.out.println("Dia inválido");
                }

                System.out.print("Dia do mês de abril (1 a 30): ");
                dia = teclado.nextInt();
            }

            System.out.print("Total de peças produzidas no turno da manhã: ");
            manha = teclado.nextInt();
            System.out.print("Total de peças produzidas no turno da tarde: ");
            tarde = teclado.nextInt();

            if (dia <= 15) {
                if (manha >= 30 && tarde >= 30 && (manha + tarde) > 100) {
                    valorDiario = (manha + tarde) * 0.80;
                } else {
                    valorDiario = (manha + tarde) * 0.50;
                }
            } else {
                valorDiario = (manha * 0.40) + (tarde * 0.30);
            }
            if (maiorProducao < (manha + tarde)) {
                maiorProducao = manha + tarde;
                diaMaiorProducao = dia;
            }

            System.out.println("Valor recebido: R$" + valorDiario);
            if (manha > tarde) {
                System.out.println("O período com mais produção foi de: manhã | E a quantidade foi " + manha);
            } else {
                System.out.println("O período com mais produção foi de: tarde | E a quantidade foi " + tarde);
            }

            System.out.print("\nNovo funcionário (1. Sim / 2. Não)? ");
            opcao = teclado.nextInt();
        }

        System.out.println("\nO dia com mais produção é o dia: " + diaMaiorProducao);

        teclado.close();
    }
}
