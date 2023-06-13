public class Uni5Exe03 {
    public static void main(String[] args) throws Exception {   
        double numero = 0;
        for (double n = 1; n < 101; n++) {
            numero = numero + (1/n);
        }
        System.out.println(numero);
    }
}
