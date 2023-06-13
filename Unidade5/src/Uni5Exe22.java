import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni5Exe22 {
    public static void main(String[] args) throws Exception {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner teclado = new Scanner(System.in);
        double salario = 2000;
        double porcentagem = 1.5;
        int anosPassados = 1996;        
        System.out.print("Digite o ano atual: ");
        int anoAtual = teclado.nextInt();
        while (anosPassados <= anoAtual) {
            salario += (salario * porcentagem)/100;
            porcentagem*=2;
            System.out.println("Salário do ano: " + anosPassados + " | R$" + df.format(salario));
            anosPassados++;
            
        }
        System.out.println("Salário Atual: R$" + df.format(salario));
        teclado.close();
    }
}