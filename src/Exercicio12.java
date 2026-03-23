import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor de A");
        double a = scan.nextDouble();

        System.out.println("Digite o valor de B");
        double b = scan.nextDouble();

        System.out.println("Digite o valor de C");
        double c = scan.nextDouble();

        System.out.println("Digite o valor de D");
        double d = scan.nextDouble();

        double maior = 0;

        if (a > b) {
            maior = a;
        } else {
            maior = b;
        }
    }
}
