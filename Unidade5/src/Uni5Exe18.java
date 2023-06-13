import java.util.Scanner;

public class Uni5Exe18 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        
        int canal = 1;
        int canal4 = 0;
        int canal5 = 0;
        int canal9 = 0;
        int canal12 = 0;
        while (canal != 0) {
        System.out.print("Digite qual canal de TV estava assistindo (4, 5, 9, 12), ou '0' para SAIR : ");
        if (canal != 0) {
        canal = teclado.nextInt();
        if(canal == 4){
            canal4++;
        }
        if(canal == 5){
            canal5++;
        }
        if(canal == 9){
            canal9++;
        }
        if(canal == 12){
            canal12++;
        }
        }
    }
    System.out.print("Digite quantas pessoas que tem TV: ");
        int pessoas = teclado.nextInt();
    double percentualCanal4 = (canal4*100) / pessoas;
    canal -= canal4;
    System.out.println("Porcentagem de pessoas assistindo o Canal 4: " + percentualCanal4 + "%");
    double percentualCanal5 = (canal5*100) / pessoas;
    canal -= canal5;
    System.out.println("Porcentagem de pessoas assistindo o Canal 5: " + percentualCanal5 + "%");
    double percentualCanal9 = (canal9*100) / pessoas;
    canal -= canal9;
    System.out.println("Porcentagem de pessoas assistindo o Canal 9: " + percentualCanal9 + "%");
    double percentualCanal12 = (canal12*100) / pessoas;
    canal -= canal12;
    System.out.println("Porcentagem de pessoas assistindo o Canal 12: " + percentualCanal12 + "%");
    double percentualNenhumCanal = (canal*100) / pessoas;
    System.out.println("Porcentagem de pessoas com a TV Desligada: " + percentualNenhumCanal + "%");
    teclado.close();
    }
}