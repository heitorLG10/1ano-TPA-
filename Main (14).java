import java.util.Scanner;

public class AbcMaiormenor {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a[], b[], c[], i;

        final int TAM = 10;

        a = new int[TAM];
        b = new int[TAM];
        c = new int[TAM];

        for (i = 0; i < TAM; i++) {
            System.out.println("Digite o número da sua sequencia A.");
            a[i] = in.nextInt();

            System.out.println("Digite o número da sua sequencia B.");
            b[i] = in.nextInt();

            c[i] = 0;

            if (a[i]>b[i]) {
                    c[i] = 1;
            } else if (a[i] == b[i]) {
                    c[i] = 0;
            } else {
                    c[i] = -1;
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