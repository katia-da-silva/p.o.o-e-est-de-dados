import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int a, b, x;
        Scanner input = new Scanner (System.in);

        // Le o primeiro numero
        System.out.print("Digite um número: ");
        a = input.nextInt();

        // Le o segundo numero
        System.out.print("Digite outro número: ");
        b = input.nextInt();

        // Soma os 2 numeros
        x = a + b;

        System.out.println();
        System.out.println("X = " + x);
    }
}