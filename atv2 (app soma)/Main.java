import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        float fltN1, fltN2, fltResultado;

        System.out.println("Digite o primeiro valor: ");
        fltN1 = teclado.nextFloat();

        System.out.println("Digite o segundo valor: ");
        fltN2 = teclado.nextFloat();
        
        fltResultado = fltN1 + fltN2;
        System.out.println("O resultado da soma é: " + fltResultado);

        teclado.close();
    }
}