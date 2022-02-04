import java.util.Scanner;

public class Uri1073{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int N;
        N = teclado.nextInt();
        for( int cont = 2 ; cont <= N ; cont= cont + 2){
            System.out.println(cont+"^2"+" = "+cont * cont);
        }
        teclado.close();
    }
}