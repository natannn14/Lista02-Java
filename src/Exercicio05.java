import java.util.Scanner;
import java.util.Locale;
public class Exercicio05 {
    public static void main (String[] args) {
        System.out.println("Digite um número qualquer:");
        Scanner scan = new Scanner (System.in);
        scan.useLocale(Locale.US);
        double num = scan.nextDouble();
        scan.close();
        if (num >= 0) {
            double raiz = Math.sqrt(num);
            System.out.println("A Raíz Quadrada desse número é " + raiz);
        } else {
            double quad = num * num;
            System.out.println("O Quadrado desse número é " + quad);
        }
    }
}
