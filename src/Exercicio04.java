import java.util.Scanner;
import java.util.Locale;
public class Exercicio04 {
    public static void main (String[] args) {
        System.out.println("Digite um número: ");
        Scanner scan = new Scanner (System.in);
        scan.useLocale(Locale.US);
        double numA = scan.nextDouble();
        System.out.println("Digite outro número: ");
        double numB = scan.nextDouble();
        scan.close();
        double somaI = numA + numB;
        if (somaI > 20) {
            double somaFinal = somaI + 8;
            System.out.println("Seu novo valor é: " + somaFinal);
        } else {
            double sub = somaI - 5;
            System.out.println("Seu novo valor é: " + sub);
        }
    }
}
