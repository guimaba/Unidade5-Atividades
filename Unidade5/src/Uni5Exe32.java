import java.util.Scanner;

public class Uni5Exe32 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Informe o dia da semana do primeiro dia do mês (1=Domingo, 2=Segunda, ..., 7=Sábado): ");
        int primeiroDiaSemana = teclado.nextInt();
        
        System.out.print("Informe o número de dias do mês: ");
        int numeroDiasMes = teclado.nextInt();
        while (numeroDiasMes > 31 || numeroDiasMes < 30 && numeroDiasMes != 28) {
            System.out.print("Dia do mês inválido. Digite novamente: ");
        numeroDiasMes = teclado.nextInt();
        }
        System.out.println("D\tS\tT\tQ\tQ\tS\tS");

        for (int i = 1; i < primeiroDiaSemana; i++) {
            System.out.print("\t");
        }
        
        int diaSemana = primeiroDiaSemana;
        
        for (int dia = 1; dia <= numeroDiasMes; dia++) {
            System.out.print(dia + "\t");
            
            if (diaSemana == 7) {
                System.out.println();
                diaSemana = 1;
            } else {
                diaSemana++;
            }
        }

        teclado.close();
    }
}
