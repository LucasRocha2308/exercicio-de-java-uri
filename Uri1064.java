import java.util.Scanner;

public class Uri1064{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float valor, mediaPositivos=0;
        int qtdePositivos = 0;

        for(int cont = 1; cont <= 6; cont++){
            valor = teclado.nextFloat();
            if(valor > 0){
                qtdePositivos++;
                mediaPositivos = mediaPositivos + valor;
            }
        }

        System.out.println(qtdePositivos+" valores positivos");
        System.out.printf("%.1f\n", mediaPositivos / qtdePositivos);

        teclado.close();
    }
}