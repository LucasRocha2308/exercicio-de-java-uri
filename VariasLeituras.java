import java.util.Scanner;

public class VariasLeituras{
    public static void main(String args[]){

    Scanner teclado = new Scanner(System.in);

    int valor1, valor2;
    double valor3;
    String nome;

    System.out.println("Por favor digite seu nome");
    nome = teclado.nextLine();
    System.out.println("Seu nome eh: "+nome);

    System.out.println("Digite alguns valores");
    valor1 = teclado.nextInt();
    valor2 = teclado.nextInt();
    valor3 = teclado.nextDouble();

    System.out.println("Voce digitou:"+valor1+" - "+valor2+ " - "+valor3);
    System.out.printf("Voce tambem digitou: %d - %d - %.2f\n", valor1, valor2, valor3);
    teclado.close();
    }
}