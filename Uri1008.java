import java.util.Scanner;

public class Uri1008{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int funcionario, horasTrabalhadas;
        double valorPorHora, salarioFuncionario;

        //entrada
        funcionario = teclado.nextInt();
        horasTrabalhadas = teclado.nextInt();
        valorPorHora = teclado.nextDouble();

        // processamento
        salarioFuncionario = valorPorHora * horasTrabalhadas;

        // saida
        System.out.println("NUMBER = " + funcionario);
        System.out.printf("SALARY = %.2f\n", salarioFuncionario);
        teclado.close();
    }
}