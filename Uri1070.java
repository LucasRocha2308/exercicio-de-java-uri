import java.util.Scanner;

public class Uri1070{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int X;
        X = teclado.nextInt();
        if(X % 2 == 0){
            X = X + 1;
        }
        for( int cont = X ; cont <= X + 11; cont= cont + 2){
            System.out.println(cont);
        }
        teclado.close();
    }
}