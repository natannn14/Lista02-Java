import java.util.Scanner;
import java.util.Locale;
public class Exercicio06 {
    public static void main(String[] args) {
        System.out.println("Digite um número: ");
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);
        double num = scan.nextDouble();
        scan.close();
        if (num % 3 == 0) {
            System.out.println("É MÚLTIPLO DE 3");
        } else {
            System.out.println("NÃO É MÚLTIPLO DE 3");
        }
    }
}