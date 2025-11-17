public class ElevadoVetor {

    public static void main(String[] args) {

            final int TAM = 11;

                int a[], i;

                a = new int [TAM];

        for (i = 0; i < TAM; i++) {
            a[i] = (int) Math.pow(2, i);
        }

        for (i = 0; i < TAM; i++) {
            System.out.println("A[" + i + "] = " + a[i]);
        }
    }
}