import java.util.Scanner;

public class Uni5Exe13{
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        int qntCombustivel = 0;
        int somaQntCombustivel = 0;
        int km = 0;
        int somaKm = 0;

        System.out.println("Quantas paradas foram feitas? ");
        int totalParadas = teclado.nextInt();

        for (int i = 1 ; i <= totalParadas ; i++) {
            System.out.print("Informe a quilometragem: ");
            km = teclado.nextInt();
            somaKm += km;

            System.out.println("Quantos litros foram abastecidos? ");
            qntCombustivel = teclado.nextInt();
            somaQntCombustivel += qntCombustivel;

            System.out.println("Km por litro da parada [" + i + "]: " + (km / (double) qntCombustivel));

        }
        float kmMedia = (somaKm / (float) somaQntCombustivel);
        System.out.println("Km por litro média: " + kmMedia);

        teclado.close();
    }
}
