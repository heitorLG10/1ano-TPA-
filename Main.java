import java.util.Scanner;

public class ImparOuParvetor {

        public static void main(String[] args) {

                Scanner in = new Scanner(System.in);

                final int TAM = 20;

                int a[], b[], i, ib=0;

                a = new int[TAM];
                b = new int[TAM];

                for (i=0; i<TAM; i++) {
                        System.out.println("Digite o "+(i+1)+" valor do vetor A");
                        a[i] = in.nextInt();
                }
                for (i=0; i<TAM; i++) {
                        if (a[i] % 2 == 0) {
                                b[ib] = a[i];
                                ib++;
                        }        
                }
                for (i=0; i<TAM; i++) {
                        if (a[i] % 2 != 0) {
                                b[ib] = a[i];
                                ib++;
                        }
                }
                System.out.print("A = ");
                for (i=0; i<TAM; i++) {
                        System.out.println(a[i]+" ");
                }
                System.out.print("B = ");
                for (i=0; i<TAM; i++) {
                        System.out.print(b[i]+" ");
                }
        }
}