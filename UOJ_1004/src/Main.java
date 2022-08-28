import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int A, B, PROD;
        Scanner input = new Scanner (System.in);

        // Le o primeiro numero
        System.out.print("Digite um número: ");
        A = input.nextInt();

        // Le o segundo numero
        System.out.print("Digite outro número: ");
        B = input.nextInt();

        // produto entre os 2 numeros
        PROD = A * B;

        System.out.println();
        System.out.println("PROD = " + PROD);
    }
}