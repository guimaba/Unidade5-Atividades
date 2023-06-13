public class Uni5Exe10 {
    public static void main(String[] args) throws Exception {
        for (int numero = 1000; numero <= 9999; numero++) {
            int p1 = numero / 100;
            int p2 = numero % (p1 * 100);
            int conj = p1 + p2;
            if (Math.pow(conj, 2) == numero) {
                System.out.println(p1 + " + " + p2 + " = " + conj + " = " + numero);
            }
        }
        
    }
}
