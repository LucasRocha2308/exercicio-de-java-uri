import java.util.Scanner;

public class Uri1038v1{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);
        int qtd, codigo;
        double total;

        codigo = teclado.nextInt();
        qtd    = teclado.nextInt();

        if (codigo == 1){
            total = qtd * 4.0;
        }
        else if (codigo == 2){
            total = qtd * 4.50;
        }
        else if (codigo == 3 ){
            total = qtd * 5.0;
        }
        else if (codigo == 4){
            total = qtd * 2.0;
        }
        else{
            total = qtd * 1.50;
        }

        System.out.printf("Total: R$ %.2f\n", total);

        teclado.close();
    }
}