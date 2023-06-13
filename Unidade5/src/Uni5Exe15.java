import java.util.Scanner;

public class Uni5Exe15 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Nome ou FIM para sair: ");
        String nome = teclado.next();

        while (!nome.trim().equalsIgnoreCase("Fim")) {
            System.out.print("Nota 1: ");
            float nota1 = teclado.nextFloat();
            System.out.print("Nota 2: ");
            float nota2 = teclado.nextFloat();
            float media = (nota1 + nota2) / 2;

            System.out.println("Média do(a) aluno(a) " + nome + " é " + media);

            System.out.print("Nome ou FIM para sair: ");
            nome = teclado.next();
        }
        teclado.close();
    }
}
