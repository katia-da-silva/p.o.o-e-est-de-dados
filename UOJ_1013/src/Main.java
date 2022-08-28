import java.util.Scanner;

import static java.lang.Math.abs;

public class Main {
    public static void main(String[] args)
    {
        int a, b, c, maiorAB, maiorBC;

        Scanner input = new Scanner (System.in);

        System.out.printf("Digite 3 valores [a] [b] [c]: ");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        maiorAB = (a + b + abs(a - b)) / 2;

        maiorBC = (maiorAB + c + abs(maiorAB - c)) / 2;

        System.out.printf("%d eh o maior", maiorBC);

        System.out.println();

    }
}