import java.util.Scanner;
import java.util.Locale;
public class Exercicio03 {
    public static void main (String[] args) {
        System.out.println("Digite um número qualquer: ");
        Scanner scan = new Scanner (System.in);
        scan.useLocale(Locale.US);
        double num = scan.nextDouble();
        scan.close();
        if (num % 2 == 0) {
            System.out.println("O seu número é par");
        } else {
            System.out.println("O seu número é impar");
        }
    }
}
