import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o salário bruto");
        double salario = scan.nextDouble();

        System.out.println("Digite o valor da prestação");
        double prestacao = scan.nextDouble();

        scan.close();

        double limitemaximo = salario * 0.3;

        if (prestacao <= limitemaximo) {
            System.out.println("Seu emprestimo foi liberado");
        } else {
            System.out.println("Seu emprestimo não foi liberado");
        }
    }
}
