import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni5Exe24 {
    public static void main(String[] args) throws Exception {
        DecimalFormat df = new DecimalFormat("0.0");
        Scanner teclado = new Scanner(System.in);

        System.out.print("Qual o limite diário de pesca? (Em Kg)\nLimite Diário: ");
        double limDiario = teclado.nextDouble();
        double pesoPescaTotal = 0;

        String opcao = "SIM";

        while (opcao.equalsIgnoreCase("SIM")) {
            System.out.print("Qual o peso do peixe? (Em Gramas)\nPeso: ");
            double pesoPeixe = teclado.nextDouble();
            pesoPeixe /= 1000;
            pesoPescaTotal += pesoPeixe;
            if (pesoPescaTotal > limDiario) {
                System.out.println("Limite excedido! \n Último peixe descartado devido ao limite diário.");
                pesoPescaTotal -= pesoPeixe;
                break;
            } else {
                System.out.println("Deseja informar o peso de mais peixe? (SIM/NÃO)");
                opcao = teclado.next();
            }

        }
        if (!opcao.equalsIgnoreCase("SIM")) {
            System.out.println("Limite diário: " + df.format(limDiario));
            System.out.println("Peso Total da pesca: " + df.format(pesoPescaTotal));
        }
        teclado.close();
    }
}
