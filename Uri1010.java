import java.util.Scanner;

public class Uri1010{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int codigoPeca1, numeroPeca1, codigoPeca2, numeroPeca2;
        double valorUnitarioPeca1, valorUnitarioPeca2, valorASerPago;

        // entrada
        codigoPeca1 = teclado.nextInt();
        numeroPeca1 = teclado.nextInt();
        valorUnitarioPeca1 = teclado.nextDouble();

        codigoPeca2 = teclado.nextInt();
        numeroPeca2 = teclado.nextInt();
        valorUnitarioPeca2 = teclado.nextDouble();

        
        // processamento
        valorASerPago = ( numeroPeca1 * valorUnitarioPeca1 + numeroPeca2 * valorUnitarioPeca2);

        // saida
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorASerPago);
        teclado.close();
    }
}