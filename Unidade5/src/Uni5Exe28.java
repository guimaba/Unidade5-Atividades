import java.util.Scanner;

public class Uni5Exe28 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int voto = 0;
        int totalVotos = 0;
        int ndn = 0;
        int cpm22 = 0;
        int skank = 0;
        int jq = 0;
        String grupoVencedor = "";
        String continuar = "s";
        
        while (continuar.equalsIgnoreCase("s")) {
            if (continuar.equalsIgnoreCase("s")) {
                System.out.print("Digite o código do conjunto (1 a 4): \n1. Nenhum de Nós.\n2. CPM22.\n3. Skank.\n4. Jota Quest.\n Código: ");
                voto = teclado.nextInt();
                
                if (voto >= 1 && voto <= 4) {
                    switch (voto) {
                    case 1: 
                        ndn++;
                        break;
                    case 2: 
                        cpm22++;
                        break;
                    case 3: 
                        skank++;
                        break;
                    case 4: 
                        jq++;
                        break;
                    }
                    totalVotos++;
                } else {
                    System.out.println("\nCódigo inválido! Voto não computado.");
                }
            }
            System.out.print("\nMais um voto (s/n)? ");
            continuar = teclado.next();
        }

        
        if (ndn > cpm22 && ndn > skank && ndn > jq) {
            grupoVencedor = "Nenhum de Nós!";
        }
        if (cpm22 > ndn && cpm22 > skank && cpm22 > jq) {
            grupoVencedor = "Nenhum de Nós!";
        }
        if (skank > cpm22 && skank > ndn && skank > jq) {
            grupoVencedor = "Nenhum de Nós!";
        }
        if (jq > cpm22 && jq > skank && jq > ndn) {
            grupoVencedor = "Nenhum de Nós!";
        }

        double ndnPorcento = (double) ndn / totalVotos * 100;
        double cpm22Porcento = (double) cpm22 / totalVotos * 100;
        double skankPorcento = (double) skank / totalVotos * 100;
        double jqPorcento = (double) jq / totalVotos * 100;
        
        System.out.println("\nResultado da eleição:");
        System.out.println("=======================");
        System.out.println("Votos para cada grupo: \n1. Nenhum de Nós: " + ndn + ".\n2. CPM22: " + cpm22 + ".\n3. Skank: " + skank + ".\n4. Jota Quest: " + jq + ".");
        System.out.println("=======================");
        System.out.println("Percentual de votos para cada grupo: \n1. Nenhum de Nós: " + ndnPorcento + "%\n2. CPM22: " + cpm22Porcento + "%\n3. Skank: " + skankPorcento + "%\n4. Jota Quest: " + jqPorcento + "%");
        System.out.println("=======================");
        System.out.println("Grupo Vencedor: " + grupoVencedor);
        
        
        teclado.close();
    }
}
