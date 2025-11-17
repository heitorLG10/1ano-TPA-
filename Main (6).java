import java.util.Scanner;

public class FatorialVetor {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a[], b[], i, f, j;

        final int TAM = 15;

        a = new int[TAM];
        b = new int[TAM];

        for (i = 0; i < TAM; i++) {
            System.out.print("Digite A[" + i + "]: ");
            a[i] = in.nextInt();
        }

        for (i = 0; i < TAM; i++) {

            f = 1;

            if (a[i] < 0) {  
                b[i] = 0;
            } else {

                for (j = 1; j <= a[i]; j++) {
                    f = f * j;
                }
                b[i] = f;
            }
        }

        System.out.print("A = (");
        for (i = 0; i < TAM; i++) {
            System.out.print(a[i]);
            if (i < TAM - 1) System.out.print(", ");
        }
        System.out.println(")");

        System.out.print("B = (");
        for (i = 0; i < TAM; i++) {
            System.out.print(b[i]);
            if (i < TAM - 1) System.out.print(", ");
        }
        System.out.println(")");
    }
}