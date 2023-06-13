public class Uni5Exe02 {
    public static void main(String[] args) throws Exception {   
        int pares = 0;
        int impares = 0;
        for (int n = 1; n < 101; n++) {
            if (n % 2 == 0) {
                pares += n;
            }
            else {
                impares += n;
            }
        }     
        System.out.println("PARES: " + pares);
        System.out.println("IMPARES: " + impares);
    }
}
