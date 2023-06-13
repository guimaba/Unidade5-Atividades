import java.util.Scanner;

public class Uni5Exe17 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        
        int inscricao = 1;
        int inscMalto = 0;
        int inscMbaixo = 0;
        int atletas=  0;
        double atMalto = 0;
        double atMbaixo = 1000;
        double altura = 0;
        double media = 0;
        
        while (inscricao != 0) {
        System.out.println("Digite um número inscricao ou '0' para SAIR: ");
        inscricao = teclado.nextInt();
        if (inscricao != 0) {
        altura = teclado.nextDouble();
        if(altura > 10){
            altura /= 100;
        }
        media += altura;
        if (atMalto < altura) {
            inscMalto = inscricao;
            atMalto = altura;
        }
        if (atMbaixo > altura) {
            inscMbaixo = inscricao;
            atMbaixo = altura;
        }
        atletas++;
        }
    }
     
    media /= atletas;

    System.out.println("Atleta mais alto: " + inscMalto + " com " + atMalto + "m de altura.");
    System.out.println("Atleta mais baixo: " + inscMbaixo + " com " + atMbaixo + "m de altura.");
    System.out.println("Média de altura: " + media);
    
    teclado.close();
    }
}