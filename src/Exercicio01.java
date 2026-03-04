import java.util.Scanner;
import java.util.Locale;
public class Exercicio01 {
    public static void main (String[] args) {
        System.out.println("Digite seu número: ");
        Scanner scan = new Scanner (System.in);
        scan.useLocale(Locale.US);
        double num = scan.nextDouble();
        scan.close();
        if (num > 20) {
            System.out.println("Seu número é: " + num);
        }
    }
}
