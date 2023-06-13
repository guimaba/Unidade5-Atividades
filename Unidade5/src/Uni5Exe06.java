import java.util.Scanner;

public class Uni5Exe06 {
    public static void main(String[] args) throws Exception {   
        Scanner teclado = new Scanner(System.in);
        double altura = 0;
        double pessoa = 0;
        for (int n = 0; n < 20; n++) {
            pessoa = teclado.nextDouble();
            altura += pessoa;
        }
        double media = altura/20;
        System.out.println(media);
        teclado.close();
    }
}
