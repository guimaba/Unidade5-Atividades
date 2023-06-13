import java.util.Scanner;

public class Uni5Exe20 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Insira o peso do material radioativo: ");
        double peso = teclado.nextDouble();
        int segundos = 0;
        while (peso >= 0.5) {
            peso/=2;
            segundos+=50;
        }
        int minutos = segundos/60;
        segundos = segundos - (minutos * 60);
        int horas = minutos / 60;
        minutos = minutos - (horas * 60);
        int dias = horas / 24;
        horas = horas - (dias * 24);
        System.out.println("O material leva " + dias + " dias, " + horas + " horas, " + minutos + " minutos, " + segundos + " segundos para sua massa se tornar menor que 0.5");
        System.out.println("Peso final: " + peso);
        teclado.close();
    }
}