import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        double raio;
        double volume;
        double pi = 3.14159;

        Scanner input = new Scanner (System.in);

        System.out.printf("Digite Raio : ");
        raio = input.nextInt();

        volume = (4.0 / 3.0) * pi * (raio * raio * raio);

        System.out.printf("VOLUME = %.3f", volume);
        System.out.println();

    }
}