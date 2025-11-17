import java.util.Scanner;

public class SomatoriaVetores {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a[], b[], i, s, j;

        final int TAM = 10;

        a = new int[TAM];
        b = new int[TAM];

        for (i = 0; i < TAM; i++) {
            System.out.print("Digite A[" + i + "]: ");
            a[i] = in.nextInt();
        }

        for (i = 0; i < TAM; i++) {

            s = 0;

            for (j = i; j < TAM; j++) {  
                s += a[j]; 
            }

            b[i] = s;
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