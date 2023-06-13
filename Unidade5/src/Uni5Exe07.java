import java.util.Scanner;

public class Uni5Exe07 {
    public static void main(String[] args) throws Exception {   
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        int numero = teclado.nextInt();
        int menor = numero;
        int maior = 0;
        for (int cont = 1; cont < n; cont++) {
            numero = teclado.nextInt();
            if (numero < menor) {
                menor = numero;
            } 
            else if (numero > maior) {
                maior = numero;
            }
        }
        System.out.println("MENOR: " + menor);
        System.out.println("MAIOR: " + maior);
        teclado.close();
    }
}
