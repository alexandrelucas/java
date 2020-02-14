import javax.swing.JOptionPane;
import java.util.Random;

public class Gui
{
	public static void main(String[] args)
	{
		String nome = JOptionPane.showInputDialog("Qual o seu nome?");
		JOptionPane.showMessageDialog(null,nome);
	}
}