import java.util.Scanner;

public class Uni5Exe12 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        int numero = 1;
        System.out.println(numero);
        for (int linha = 1; linha < n; linha++) {
            for (int camada = 0; camada <= linha; camada++) {
                numero += 1;
                System.out.print(numero + " ");
            }
            System.out.println();
        }
        teclado.close();
    }
}
