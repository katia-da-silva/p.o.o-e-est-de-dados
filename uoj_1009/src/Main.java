import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        String nomeVendedor;
        double salarioFixo, totalVendas;
        double salarioMes, comissao;

        Scanner input = new Scanner (System.in);

        System.out.print("Digite o Nome do vendedor : ");
        nomeVendedor = input.next();

        System.out.print("Digite o salario fixo : ");
        salarioFixo = input.nextDouble();

        System.out.print("Digite total de vendas: ");
        totalVendas = input.nextDouble();

        comissao = totalVendas * (15.0 / 100.0);
        salarioMes = salarioFixo  + comissao;

        System.out.printf("TOTAL = R$ %.2f", salarioMes);
        System.out.println();

    }
}