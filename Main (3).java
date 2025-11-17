import java.util.Scanner;

public class VetoresPares {

    public static void main(String[] args) {

            Scanner in = new Scanner(System.in);

            final int TAM = 10;

                int a[], i ,ii;

                a = new int [TAM];


        for (i = 0; i<TAM; i++) {
                System.out.println("Digite o valor do vetor A");
                a[i] = in.nextInt();

            System.out.print("Pares até " + a[i] + ": ");

            for (ii = 0;ii <= a[i]; ii++) {
                if (ii % 2 == 0) {
                    System.out.print(ii + " ");

                }
            }
            System.out.println(" ");
        }
    }
}