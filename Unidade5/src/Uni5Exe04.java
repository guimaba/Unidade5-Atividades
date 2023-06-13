public class Uni5Exe04 {
    public static void main(String[] args) throws Exception {   
        double numero = 0;
        double dividendo = 3;
        double divisor = 2;
        double soma = 4;
        for (int n = 0; n < 20; n++) {
            numero += dividendo/divisor;
            System.out.println(numero);
            dividendo += 2;
            System.out.println(dividendo);
            divisor += soma;
            soma += 2;
            System.out.println(divisor);
        }
        System.out.println(dividendo);
        System.out.println(divisor);
        System.out.println(numero);
    }
}
