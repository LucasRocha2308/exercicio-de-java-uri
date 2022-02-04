import java.util.Scanner;

public class Uri1009{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        String vendedor;
        double salarioFixo, totalDeVendasEfetuadas, totalReceber;

        //entrada
        vendedor = teclado.nextLine();
        salarioFixo = teclado.nextDouble();
        totalDeVendasEfetuadas = teclado.nextDouble();

        // processamento
        totalReceber = salarioFixo + (totalDeVendasEfetuadas * 0.15);

        // saida
        System.out.printf("TOTAL = R$%.2f\n", totalReceber);
        teclado.close();
    }
}