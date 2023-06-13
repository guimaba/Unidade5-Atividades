import java.util.Scanner;

public class Uni5Exe30 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Tamanho da mochila: ");
        int mochila = s.nextInt();
        System.out.print("Valor inicial: ");
        int valorInicial = s.nextInt();
        System.out.print("Valor incremento: ");
        int valorIncremento = s.nextInt();

        int quantidade = 0;
        int somaInternos = 0;
        int somaExternos = 0;
        String elementosInternos = "";
        String elementosExternos = "";

        while (quantidade < mochila) {
            elementosInternos += valorInicial + " ";
            somaInternos += valorInicial;
            valorInicial -= valorIncremento;
            quantidade++;
        }
        while (valorInicial >= 0) {
            elementosExternos += valorInicial + " ";
            somaExternos += valorInicial;
            valorInicial -= valorIncremento;
        }

        System.out.println("Todos: " + elementosInternos + " " + elementosExternos);
        System.out.println("Internos: " + elementosInternos);
        System.out.println("Externos: " + elementosExternos);
        System.out.println("Soma internos: " + somaInternos);
        System.out.println("Soma externos: " + somaExternos);

        s.close();
    }
}