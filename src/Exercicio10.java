import java.util.Scanner;

public class Exercicio10 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número: ");
        double num = scan.nextDouble();
        scan.close();
        if (num % 3 == 0 && num % 7 == 0) {
            System.out.println("Ele é divísivel por 3 e por 7");
        } else {
            System.out.println("Não é divisível por 3 e nem por 7");
        }
    }
}
