import java.util.Scanner;

public class Uni5Exe34 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int opcao;
        int numContasEncerradas = 0;
        
        do {
            System.out.println("Selecione uma opção:");
            System.out.println("(1) Encerrar a conta de um hóspede");
            System.out.println("(2) Verificar número de contas encerradas");
            System.out.println("(3) Sair");
            
            opcao = teclado.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do hóspede: ");
                    teclado.nextLine();
                    String nome = teclado.nextLine();
                    
                    System.out.print("Digite o número de diárias: ");
                    int numDiarias = teclado.nextInt();
                    
                    double taxaServicos;
                    
                    if (numDiarias < 15) {
                        taxaServicos = 7.50;
                    } else if (numDiarias == 15) {
                        taxaServicos = 6.50;
                    } else {
                        taxaServicos = 5.00;
                    }
                    
                    double totalAPagar = (50.00 * numDiarias) + (numDiarias * taxaServicos);
                    
                    System.out.println("Nome: " + nome);
                    System.out.println("Total a ser pago: R$ " + totalAPagar);
                    
                    numContasEncerradas++;
                    
                    break;
                case 2:
                    System.out.println("Número de contas encerradas: " + numContasEncerradas);
                    break;
                case 3:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção incorreta. Digite um número de opção válido.");
                    break;
            }
        } while (opcao != 3);
        
        teclado.close();
    }
}
