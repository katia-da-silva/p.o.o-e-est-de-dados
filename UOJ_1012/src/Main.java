import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        double A, B, C;
        double areaTriangulo, raioCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
        double pi = 3.14159;

        Scanner input = new Scanner (System.in);

        System.out.printf("Digite os valores [A] [B] [C]: ");
        A = input.nextDouble();
        B = input.nextDouble();
        C = input.nextDouble();

        areaTriangulo = (A * C) / 2;
        raioCirculo = pi * (C * C);
        areaTrapezio = ((A + B) * C) / 2;
        areaQuadrado = B * B;
        areaRetangulo = A * B;

        System.out.printf("TRIANGULO: %.3f\n", areaTriangulo);
        System.out.printf("CIRCULO: %.3f\n", raioCirculo);
        System.out.printf("TRAPEZIO: %.3f\n", areaTrapezio);
        System.out.printf("QUADRADO: %.3f\n", areaQuadrado);
        System.out.printf("RETANGULO: %.3f\n", areaRetangulo);

        System.out.println();

    }
}