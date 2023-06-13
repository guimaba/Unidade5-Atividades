import java.util.Scanner;

public class Uni5Exe33 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int votosCandidato1 = 0;
        int votosCandidato2 = 0;
        int votosCandidato3 = 0;
        int votosCandidato4 = 0;
        int votosNulos = 0;
        int votosBrancos = 0;
        int totalVotos = 0;
        
        int voto;
        
        do {
            System.out.println("Digite o código do candidato (1 a 4), 5 para voto nulo, 6 para voto em branco:");
            voto = teclado.nextInt();
            
            switch (voto) {
                case 1:
                    votosCandidato1++;
                    totalVotos++;
                    break;
                case 2:
                    votosCandidato2++;
                    totalVotos++;
                    break;
                case 3:
                    votosCandidato3++;
                    totalVotos++;
                    break;
                case 4:
                    votosCandidato4++;
                    totalVotos++;
                    break;
                case 5:
                    votosNulos++;
                    totalVotos++;
                    break;
                case 6:
                    votosBrancos++;
                    totalVotos++;
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção incorreta. Digite um número de opção válido.");
                    break;
            }
        } while (voto != 0);
        
        System.out.println("Total de votos para cada candidato:");
        System.out.println("Candidato 1: " + votosCandidato1);
        System.out.println("Candidato 2: " + votosCandidato2);
        System.out.println("Candidato 3: " + votosCandidato3);
        System.out.println("Candidato 4: " + votosCandidato4);
        System.out.println("Total de votos nulos: " + votosNulos);
        System.out.println("Total de votos em branco: " + votosBrancos);
        
        double percentualNulos = (double) votosNulos / totalVotos * 100;
        double percentualBrancos = (double) votosBrancos / totalVotos * 100;
        
        System.out.println("Percentual de votos nulos sobre o total: " + percentualNulos + "%");
        System.out.println("Percentual de votos em branco sobre o total: " + percentualBrancos + "%");
        
        teclado.close();
    }
}
