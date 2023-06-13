import java.util.Scanner;

public class Uni5Exe16 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        double altura = 1, alturaMasc = 0, alturaFem = 0, alturaOutr = 0;
        char genero = 0;
        int qtdFem = 0, qtdGrupo = 0;
        while (altura != 0) {
        System.out.println("Digite uma altura ou '0' para SAIR: ");
        altura = teclado.nextDouble();
        if (altura != 0) {
        if(altura > 10);
            altura /= 100;
        System.out.println("Insira o gênero: ");
        System.out.println("M - Masculino | F - Feminino | O - Outro");
        genero = teclado.next().toUpperCase().charAt(0);
        if(genero == 'M'){
            alturaMasc += altura;
            qtdGrupo++;
        }
            if(genero == 'F'){
            alturaFem += altura;
            qtdGrupo++;
            qtdFem++;
        }
        if(genero == 'O'){
            alturaOutr += altura;
            qtdGrupo++;
        }
        }
        }  
        double mediaFem = alturaFem / qtdFem;
        double mediaGrupo = (alturaMasc + alturaFem + alturaOutr) / qtdGrupo;
        System.out.println("Média de altura feminina: " + mediaFem);
        System.out.println("Média de altura do grupo: " + mediaGrupo);
        teclado.close();
    }
}
