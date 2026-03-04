import java.util.Scanner;
import java.util.Locale;
public class Exercicio02 {
    public static void main (String[] args) {
        System.out.println("Digite um valor inteiro: ");
        Scanner scan = new Scanner (System.in);
        scan.useLocale(Locale.US);
        int valA = scan.nextInt();
        System.out.println("Digite outro valor inteiro: ");
        int valB = scan.nextInt();
        scan.close();
        int soma = valA + valB;
        if (soma > 10) {
            System.out.println("Esse é o resultado da sua soma: " + soma);
        }
    }
}
