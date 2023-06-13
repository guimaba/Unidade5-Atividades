import java.util.Scanner;

public class Uni5Exe25 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int pontosE = 0;
        int pontosD = 0;
        while (true) {
            System.out.print("Digite o código do ponto (D/E): ");
            String codigoPonto = teclado.nextLine();

            if (codigoPonto.equalsIgnoreCase("D")) {
                pontosD++;
            } 
            else if (codigoPonto.equalsIgnoreCase("E")) {
                pontosE++;
            }
            if ((pontosD >= 1 || pontosE >= 21) && Math.abs(pontosD - pontosE) >= 2) {
                break; // Encerrar o while se os requisitos forem cumpridos.
            }
        }
        System.out.println("\n--- Resultado do Jogo ---");
        System.out.println("Pontos do jogador do lado esquerdo: " + pontosE);
        System.out.println("Pontos do jogador do lado direito: " + pontosD);
        if (pontosE > pontosD) {
            System.out.println("Vencedor: Jogador do lado esquerdo");
        } else {
            System.out.println("Vencedor: Jogador do lado direito");
        }
        teclado.close();
    }
}
