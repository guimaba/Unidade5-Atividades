import java.util.ArrayList;
import java.util.Scanner;

public class Uni5Exe09 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> array = new ArrayList<String>();
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        String nome = "";
        int idade = 0;
        int comVinteAnos = 0;
        for (int cont = 0; cont < n; cont++) {
            nome = teclado.next();
            idade = teclado.nextInt();
            if (idade == 18) {
                array.add(nome);
            }
            else if (idade >= 20) {
                comVinteAnos++;
            }
        }
        if (array.isEmpty())
        System.out.println("Ninguém com 18 anos.");
        else
        System.out.println("Com 18 anos: " + array);
        if (comVinteAnos == 0)
        System.out.println("Ninguém com 20 anos ou mais.");
        else
        System.out.println("Com ou Mais de vinte anos: " + comVinteAnos);
        teclado.close();
    }
}
