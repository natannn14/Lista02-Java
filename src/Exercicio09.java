import javax.swing.JOptionPane;
public class Exercicio09 {
    public static void main (String[] args) {
        String valorA = JOptionPane.showInputDialog(null, "Digite um número");
        try {
            int numA = Integer.parseInt(valorA);

            String valorB = JOptionPane.showInputDialog(null, "Digite um número");
            int numB = Integer.parseInt(valorB);
            if (numA == numB) {
                JOptionPane.showMessageDialog(null, "Os dois são iguais");
            } else if (numA > numB) {
              JOptionPane.showMessageDialog(null, "O número " + numA
                    + " é maior que o número " + numB);
            }
            else {
              JOptionPane.showMessageDialog(null, "O número " + numA
                    + " é menor que o número " + numB);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite apenas números");
        }
    }
}