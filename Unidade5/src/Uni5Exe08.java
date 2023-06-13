import java.util.Scanner;

public class Uni5Exe08 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        int numero = teclado.nextInt();
        int menor = 0;
        int maior = 0;
        int numerosPositivos = 0;
        for (int cont = 1; cont < n; cont++) {
            numero = teclado.nextInt();
            if (numero < 0 && numero < menor) {
                menor = numero;
            } else if (numero > 0) {
                maior = maior + numero;
                numerosPositivos++;
            }
        }
        if (menor == 0) {
            System.out.println("Não existe números negativos.");
        } else {
            System.out.println("MENOR NEGATIVO: " + menor);
        }
        if (maior == 0) {
            System.out.println("Não existe números positivos.");
        } else {
            maior = maior / numerosPositivos;
            System.out.println("MÉDIA POSITIVOS: " + maior);
        }
        teclado.close();
    }
}
