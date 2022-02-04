import java.util.Scanner;

public class Uri1014{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int distanciaTotal;
        double totalCombustivelGasto, consumoMedioDeAutomovel;

        //entrada
        distanciaTotal = teclado.nextInt();
        totalCombustivelGasto = teclado.nextDouble();

        // processamento
        consumoMedioDeAutomovel = distanciaTotal / totalCombustivelGasto;

        // saida
        System.out.printf("%.3f km/l\n", consumoMedioDeAutomovel);
        teclado.close();
    }
}