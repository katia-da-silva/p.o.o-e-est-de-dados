import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {

        int codigoPeca1, numeroPecas1, codigoPeca2, numeroPecas2;
        double valorUnitario1, valorUnitario2, valorTotalPagar;

        Scanner input = new Scanner (System.in);

        System.out.print("Digite os dados do produto [Código da peça] [número de peças] [valor unitário] : ");
        codigoPeca1 = input.nextInt();
        numeroPecas1 = input.nextInt();
        valorUnitario1 = input.nextDouble();

        System.out.print("Digite os dados do produto 2 [Código da peça] [número de peças] [valor unitário] : ");
        codigoPeca2 = input.nextInt();
        numeroPecas2 = input.nextInt();
        valorUnitario2 = input.nextDouble();

        valorTotalPagar = (numeroPecas1 * valorUnitario1) + (numeroPecas2 * valorUnitario2);

        System.out.printf("VALOR A PAGAR: R$ %.2f", valorTotalPagar);
        System.out.println();

    }
}