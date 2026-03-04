import java.util.Scanner;
import java.util.Locale;
public class Exercicio07 {
    public static void main (String[] args) {
        System.out.println("Digite um número: ");
        Scanner scan = new Scanner (System.in);
        scan.useLocale(Locale.US);
        double num = scan.nextDouble();
        scan.close();
        if (num % 5 == 0) {
            System.out.println("É DIVISÍVEL POR 5");
        } else {
            System.out.println("NÃO É DIVISÍVEL POR 5");
        }
    }
}
