import java.util.Scanner;

public class Uni5Exe23 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String opcao = "s";

        while (opcao.equalsIgnoreCase("s")) {
            System.out.print("Digite o nome do vendedor: ");
            String nome = teclado.nextLine();

            System.out.print("Digite o número de produtos vendidos pelo vendedor: ");
            int numProdutos = teclado.nextInt();

            double totalVendas = 0.0;
            for (int i = 1; i <= numProdutos; i++) {
                System.out.printf("Digite o preço unitário do produto %d: ", i);
                double precoUnitario = teclado.nextDouble();

                System.out.printf("Digite a quantidade vendida do produto %d: ", i);
                int quantidade = teclado.nextInt();

                totalVendas += (precoUnitario * 0.3) * quantidade;
            }

            double salario = totalVendas;

            System.out.println("\n--- Relatório do Vendedor ---");
            System.out.println("Nome do vendedor: " + nome);
            System.out.println("Total de vendas: R$" + totalVendas);
            System.out.println("Salário: R$" + salario);

            System.out.print("\nDeseja digitar os dados de mais um vendedor? (s/N): ");
            opcao = teclado.next();

            teclado.nextLine(); // Limpar o buffer do teclado
            System.out.println(); // Imprimir uma linha em branco para separar os relatórios
        }
        teclado.close();
    }
}