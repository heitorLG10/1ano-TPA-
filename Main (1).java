import java.util.Scanner;

public class TabuadaDeVetores {

        public static void main(String[] args) {

                Scanner in = new Scanner(System.in);

            final int TAM = 5;

            int a[], r, i, t;

            a = new int [TAM];

            for (i=0; i<TAM; i++) {
                    System.out.println("Digite os valores do veter A:");
                    a[i] = in.nextInt();

                    for (t=1; t<11; t++) {
                            r = a[i]*t;
                            System.out.println(r+" = "+a[i]+" X "+t);
                    }

            } 
        }
}