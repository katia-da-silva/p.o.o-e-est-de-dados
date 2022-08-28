import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int A, B, SOMA;
        Scanner input = new Scanner (System.in);

        // Le o primeiro numero
        System.out.print("Digite um número: ");
        A = input.nextInt();

        // Le o segundo numero
        System.out.print("Digite outro número: ");
        B = input.nextInt();

        // Soma os 2 numeros
        SOMA = A + B;

        System.out.println();
        System.out.println("SOMA = " + SOMA);
    }
}