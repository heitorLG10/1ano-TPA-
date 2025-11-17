import java.util.Scanner;

public class DiferenteVetores {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a[], b[], c[], i, j, e = 0, r = 0, k, ci = 0 ,ac;

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

            ac = 0;
            r = 0;

            for (j = 0; j < TAM; j++) {
                if (a[i] == b[j]) {
                    ac = 1;
                    j = TAM;
                }
            }

            if (ac == 0) {

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