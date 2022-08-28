import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int numeroFuncionario, horasTrabalhadas;
        double valorHora, salario;

        Scanner input = new Scanner (System.in);

        System.out.print("Digite o Número do Funcionário : ");
        numeroFuncionario = input.nextInt();

        System.out.print("Digite as Horas Trabalhadas: ");
        horasTrabalhadas = input.nextInt();

        System.out.print("Digite o Valor por Hora: ");
        valorHora = input.nextDouble();

        salario = horasTrabalhadas * valorHora;

        System.out.printf("NUMBER = %d\n", numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f", salario);
        System.out.println();

    }
}