import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int A, B, C, D, DIFERENCA;
        Scanner input = new Scanner (System.in);

        System.out.print("Digite o primeiro numero : ");
        A = input.nextInt();

        System.out.print("Digite o segundo numero: ");
        B = input.nextInt();

        System.out.print("Digite o terceiro numero: ");
        C = input.nextInt();

        System.out.print("Digite o quarto numero: ");
        D = input.nextInt();

        DIFERENCA = (A * B - C * D);

        System.out.printf("DIFERENCA = %d", DIFERENCA);
        System.out.println();
    }
}