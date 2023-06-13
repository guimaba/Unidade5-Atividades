import java.util.Scanner;

public class Uni5Exe21 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        double chico = 150;
        double ze = 110;
        int anos = 0;

        while (chico >= ze) {
            chico += 2;
            ze += 3;
            anos++;
        }
        
        System.out.println("Levarão " + anos + " anos.");
        System.out.println("Altura de Zé: " + ze / 100);
        System.out.println("Altura de Chico: " + chico / 100);

        teclado.close();
    }
}