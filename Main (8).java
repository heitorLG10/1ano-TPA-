import java.util.Scanner;

public class IntersecaoVetores {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a[], b[], c[], i, j, e = 0, r = 0, k, ci = 0;

        final int TAM = 10;

        a = new int[TAM];
        b = new int[TAM];
        c = new int[TAM];

        for (i = 0; i < TAM; i++) {
            System.out.print("Digite A[" + i + "]: ");
            a[i] = in.nextInt();
        }

        for(i = 0; i <TAM; i++) {
                System.out.print("Digite B[" + i + "]: ");
            b[i] = in.nextInt();
        }

        for (i = 0; i < TAM; i++) {

            for (j = 0; j < TAM; j++) {
                if (a[i] == b[j]) {
                    e = 1;
                    j = TAM;
                }
            }

            if (e == 1) {

                for (k = 0; k < ci; k++) {
                    if (c[k] == a[i]) {
                        r = 1;
                        k = ci;
                    }
                }

                if (r == 0) {
                    c[ci] = a[i];
                    ci++;
                }
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
        System.out.print("C = (");
        for (i = 0; i < TAM; i++) {
            System.out.print(c[i]);
            if (i < TAM - 1) System.out.print(", ");
        }
        System.out.println(")");
    }
}