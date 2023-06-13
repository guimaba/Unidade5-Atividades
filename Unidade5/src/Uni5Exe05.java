import java.util.Scanner;

public class Uni5Exe05 {
    public static void main(String[] args) throws Exception {   
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        while (n < 2) {
            System.out.print("Tente novamente: ");
            n = teclado.nextInt();
        }
        int num1 = 8;
        System.out.println(num1);
        int num2 = 10;
        System.out.println(num2);
        for (int cont = 3; cont <= n; cont++) {   
            if (cont % 2 != 0) {
            num1*=2;
            System.out.println(num1);
            }
            if(cont % 2 == 0) {
            num2 = num1 + 2;
            System.out.println(num2);
            }
        }
        teclado.close();
    }
}
