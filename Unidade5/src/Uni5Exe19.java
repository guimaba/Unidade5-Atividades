import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni5Exe19 {
    public static void main(String[] args) throws Exception {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner teclado = new Scanner(System.in);
        int codigoCompra = 0;
        double valorCompra = 1;
        double valorComDesconto = 0;
        double valorDoDesconto = 0;
        double lucroDia = 0;
        while (valorCompra != 0) {
        System.out.print("Digite qual o valor da compra ou '0' para SAIR : R$");
        if (valorCompra != 0) {
        valorCompra = teclado.nextInt();
        if(valorCompra <= 500){
            valorDoDesconto = (valorCompra*15)/100;
            valorComDesconto += valorCompra - valorDoDesconto;
        } 
        else {
            valorDoDesconto = (valorCompra*20)/100;
            valorComDesconto += valorCompra - valorDoDesconto;
        }
        codigoCompra++;
        System.out.println("Compra [" + codigoCompra + "] - Valor a pagar: R$" + df.format(valorComDesconto));
        lucroDia += valorComDesconto;
        }
    }
    System.out.println("O lucro total do Dia na loja foi: R$" + df.format(lucroDia));
    teclado.close();
    }
}