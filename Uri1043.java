import java.util.Scanner;

public class Uri1043{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double A,B,C, AREA,PERIMETRO;

        // entrada
        A = teclado.nextDouble();
        B = teclado.nextDouble();
        C = teclado.nextDouble();

        // processamento
        if(A < B + C && B < A + C && C < A + B ){
            PERIMETRO = A + B + C;
            System.out.printf("Perimetro = %.1f\n", PERIMETRO);
        }else{
            AREA = (A + B) * C / 2;
            System.out.printf("Area = %.1f\n", AREA);
        }

        teclado.close();
    }
}