import java.util.Scanner;

public class Uni5Exe01 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        for (int qnt = 0; qnt < 20; qnt++) {
            int numero = teclado.nextInt();
            if (numero % 2 == 0) {
                System.out.println("PAR");
            }
            else {
                System.out.println("IMPAR");
            }
        }
        teclado.close();
    }
}
