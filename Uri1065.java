import java.util.Scanner;

public class Uri1065{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int valor, qtdePar = 0;

        for(int cont = 1; cont <= 5; cont++){
            valor = teclado.nextInt();
            if( valor % 2 == 0){
                qtdePar++;
            }
        }

        System.out.println(qtdePar+" valores pares");

        teclado.close();
    }
}