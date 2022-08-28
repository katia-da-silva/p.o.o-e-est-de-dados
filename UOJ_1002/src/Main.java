import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        double n = 3.14159;

        Scanner input = new Scanner (System.in);

        // Le o primeiro numero
        System.out.print("Digite o raio: ");
        double raio = input.nextDouble();

        double area = (raio * raio) * n;

        System.out.println();
        System.out.println("A=" + area);
    }
}