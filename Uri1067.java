import java.util.Scanner;

public class Uri1067{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int X;
        X = teclado.nextInt();
        for( int cont = 1 ; cont <= X; cont= cont + 2){
            System.out.println(cont);
        }
        teclado.close();
    }
}