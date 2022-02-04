/*
Leia 4 valores inteiros A, B, C e D. A seguir,
1 - se B for maior do que C e                               B > C
2 - se D for maior do que A, e                              D > A
3 - a soma de C com D for maior que a soma de A e B e       C + D > A + B
4 - se C e D, ambos, forem positivos e                      C > 0 && D > 0
5 - se a variável A for par                                 A % 2 == 0
*/

import java.util.Scanner;

public class Uri1035{
    public static void main(String arg[]){
        Scanner teclado = new Scanner(System.in);
        int A,B,C,D;

        //entrada
        A = teclado.nextInt();
        B = teclado.nextInt();
        C = teclado.nextInt();
        D = teclado.nextInt();

        if( B > C && D > A && C + D > A + B && C > 0 && D > 0 && A % 2 == 0){
            System.out.println("Valores aceitos");
        }else{
            System.out.println("Valores nao aceitos");
        }
    }
}