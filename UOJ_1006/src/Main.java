import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        double A, B, C, MEDIA;
        Scanner input = new Scanner (System.in);

        System.out.print("Digite a primeira nota : ");
        A = input.nextDouble();

        System.out.print("Digite a segunda nota: ");
        B = input.nextDouble();

        System.out.print("Digite a terceira nota: ");
        C = input.nextDouble();

        MEDIA = ((A * 2) + (B * 3) + (C * 5)) / 10;

        System.out.printf("MEDIA = %.1f", MEDIA);
        System.out.println();
    }
}