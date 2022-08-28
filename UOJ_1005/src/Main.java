import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        double A, B, MEDIA;
        Scanner input = new Scanner (System.in);

        System.out.print("Digite a nota : ");
        A = input.nextDouble();

        System.out.print("Digite outra nota: ");
        B = input.nextDouble();

        MEDIA = ((A * 3.5) + (B * 7.5 )) / 11;

        System.out.printf("MEDIA = %.5f", MEDIA);
        System.out.println();
    }
}