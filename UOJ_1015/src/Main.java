import java.util.Scanner;

import static java.lang.Math.abs;

public class Main {
    public static void main(String[] args)
    {
        double x1, y1, x2, y2, distancia, p1, p2;

        Scanner input = new Scanner (System.in);

        System.out.printf("Digite os valores de p1(x1,y1): ");
        x1 = input.nextDouble();
        y1 = input.nextDouble();

        System.out.printf("Digite os valores de p2(x2,y2): ");
        x2 = input.nextDouble();
        y2 = input.nextDouble();

        p1 = (x2 - x1) * (x2 - x1);
        p2 = (y2 - y1) * (y2 - y1);

        distancia = Math.sqrt(p1 + p2);

        System.out.printf("%.4f", distancia);

        System.out.println();

    }
}