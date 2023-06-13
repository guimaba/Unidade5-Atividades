import java.util.Scanner;

public class Uni5Exe14 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        float lucroMenos10 = 0;
        float lucroEntre10e20 = 0;
        float lucroMaior20 = 0;
        float somaPrecoCompra = 0;
        float somaPrecoVenda = 0;

        for (int i = 0; i < 20; i++) {
            System.out.print("Nome do produto: ");
            String nome = teclado.next();
            System.out.print("Preço de compra: ");
            float precoCompra = teclado.nextFloat();
            somaPrecoCompra += precoCompra;
            System.out.print("Preço de venda: ");
            float precoVenda = teclado.nextFloat();
            somaPrecoVenda += precoVenda;
            System.out.print("Item: " + nome);
            System.out.print(" | Preço de Compra: " + precoCompra);
            System.out.println(" | Preço de Venda: " + precoVenda);
            float percentualLucro = (precoVenda - precoCompra) / (precoCompra * 100);
            if (percentualLucro < 10) {
                lucroMenos10++;
            } else if (percentualLucro > 20) {
                lucroMaior20++;
            } else {
                lucroEntre10e20++;
            }
        }

        System.out.println("Quantidade de produtos com lucro < 10% " + lucroMenos10);
        System.out.println("Quantidade de produtos com lucro entre 10% e 20%: " + lucroEntre10e20);
        System.out.println("Quantidade de produtos com lucro maior que 20%: " + lucroMaior20);

        System.out.println("Total de compras: R$" + somaPrecoCompra);
        System.out.println("Total de vendas: R$" + somaPrecoVenda);
        System.out.println("Total de lucro: R$" + (somaPrecoVenda - somaPrecoCompra));
        teclado.close();
    }
}
