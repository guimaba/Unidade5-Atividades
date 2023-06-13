import java.util.Scanner;

public class Uni5Exe26 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Valor máximo de pedágio: R$");
        double valorMaximoPedagio = teclado.nextDouble();

        int trechosAcimaMaximo = 0;
        int totalTrechos = 0;
        int trechosDistanciaAcima150 = 0;

        while (true) {
            System.out.print("Pedágio: R$");
            double valorPedagio = teclado.nextDouble();

            if (valorPedagio < 0) {
                break; // Encerrar o while se valorPedagio for negativo.
            }

            System.out.print("Distância (em Km): ");
            int distancia = teclado.nextInt();

            totalTrechos++;

            if (valorPedagio > valorMaximoPedagio) {
                trechosAcimaMaximo++;
            }
            if (distancia > 150 && valorPedagio <= valorMaximoPedagio) {
                trechosDistanciaAcima150++;
            }
        }

        System.out.println("\nResultados:");
        System.out.println(trechosAcimaMaximo + " (trechos com valor acima do qual Astolfo nega-se a pagar.)");
        System.out.println(totalTrechos + " (quantidade de trechos informados.)");
        System.out.println(trechosDistanciaAcima150 + " (trechos acima de 150km com valor aceito por Astolfo.)");

        teclado.close();
    }
}
