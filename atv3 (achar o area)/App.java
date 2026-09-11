import java.util.Scanner;

public class App{
    public static void main(String[] args) throws Exception{

        double raio;
        double area;
        final double PI = 3.1416;

        System.out.println("Escreva o valor do raio");
        Scanner scan = new Scanner(System.in);

        raio = scan.nextFloat();

        area = PI * Math.pow(raio,2);

        System.out.println("O valor da area é " + area);

        scan.close();
    }
}