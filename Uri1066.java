import java.util.Scanner;

public class Uri1066{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int valor, qtdePar = 0, qtdeImpar = 0, qtdePositivo = 0, qtdeNegativo  = 0;

        for(int cont = 1; cont <= 5; cont++){
            valor = teclado.nextInt();
            if(valor % 2 == 0){
                qtdePar++;
            }
            if(valor % 2 != 0 ){
                qtdeImpar++;
            }
            if(valor > 0){
                qtdePositivo++;
            }
            if(valor < 0){
                qtdeNegativo++;
            }
        }

        System.out.println(qtdePar+" valor(es) par(es)");
        System.out.println(qtdeImpar+" valor(es) impar(es)");
        System.out.println(qtdePositivo+" valor(es) positivo(s)");
        System.out.println(qtdeNegativo+" valor(es) negativo(s)");

        teclado.close();
    }
}