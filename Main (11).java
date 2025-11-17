import java.util.Scanner;

public class PalindromosVetores {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a[], i, erro = 0;

        final int TAM = 10;

        a = new int[TAM];

        for (i = 0; i < TAM; i++) {
            System.out.println("Escreva os números do seu palíndromo:");
            a[i] = in.nextInt();
        }

        if (a[0] == a[9]) {
            if (a[1] == a[8]) {
                if (a[2] == a[7]) {
                    if (a[3] == a[6]) {
                        if (a[4] == a[5]) {
                        } else {
                            erro = 1;
                        }
                    } else {
                        erro = 1;
                    }
                } else {
                    erro = 1;
                }
            } else {
                erro = 1;
            }
        } else {
            erro = 1;
        }

        if (erro == 0) {
            System.out.println("O número é um palíndromo");
        } else {
            System.out.println("O número não é um palíndromo");
        }
    }
}