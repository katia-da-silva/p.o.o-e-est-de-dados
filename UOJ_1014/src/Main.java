import java.util.Scanner;

import static java.lang.Math.abs;

public class Main {
    public static void main(String[] args)
    {
        int X;
        double Y, kmLitro;

        Scanner input = new Scanner (System.in);

        System.out.printf("Digite a distância total percorrida (em Km): ");
        X = input.nextInt();

        System.out.printf("Digite total de combustível gasto (em litros): ");
        Y = input.nextDouble();

        kmLitro = (X / Y);

        System.out.printf("%.3f km/l", kmLitro);

        System.out.println();

    }
}