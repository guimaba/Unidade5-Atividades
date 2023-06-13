import java.util.Scanner;

public class Uni5Exe29 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o valor desejado: ");
        int valor = teclado.nextInt();
        
        int cedulas20 = valor / 20;
        int resto = valor % 20;
        
        int cedulas10 = resto / 10;
        resto = resto % 10;
        
        int cedulas5 = resto / 5;
        resto = resto % 5;
        
        int cedulas2 = resto / 2;
        resto = resto % 2;
        
        int cedulas1 = resto;
        
        System.out.println("Quantidade mínima de cédulas:");
        System.out.println("Cédulas de 20: " + cedulas20);
        System.out.println("Cédulas de 10: " + cedulas10);
        System.out.println("Cédulas de 5: " + cedulas5);
        System.out.println("Cédulas de 2: " + cedulas2);
        System.out.println("Cédulas de 1: " + cedulas1);
        
        teclado.close();
    }
}
