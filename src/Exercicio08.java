import javax.swing.JOptionPane;

import static javax.swing.JOptionPane.ERROR_MESSAGE;

public class Exercicio08 {
    public static void main (String[] args) {
        String entradaA = JOptionPane.showInputDialog(null, "Digite um número: ");

        try {
            int numA = Integer.parseInt(entradaA);
            String entradaB = JOptionPane.showInputDialog(null, "Digite outro número");
            int numB = Integer.parseInt(entradaB);
            if (numB == 0) {
                JOptionPane.showMessageDialog(null, "Não é possível dividir por zero");
            } else if (numA % numB == 0) {
                JOptionPane.showMessageDialog(null, "O número " + numA
                        + " é divisível por " + numB);
            }
            else {
                JOptionPane.showMessageDialog(null, "O número " + numA
                        + " não é divisível por " + numB);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Escreva somente números",
                    "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
}
