import javax.swing.JOptionPane;
import java.util.Random;

public class JogoDados
{
	public static void main(String[] args)
	{	
		String ppt = JOptionPane.showInputDialog("Qual o seu palpite?");
		int intPalpite = Integer.parseInt(ppt);
		Random r = new Random();
		int indexDado = r.nextInt(6)+1;

		if(intPalpite == indexDado)
		{
			JOptionPane.showMessageDialog(null,"Voce Acertou!");
		}
		else
		{
			JOptionPane.showMessageDialog(null,"Voce errou! :(\nNumero do dado: " + indexDado);
		}

		/*
		String nome = JOptionPane.showInputDialog("Qual o seu nome?");
		JOptionPane.showMessageDialog(null,nome);
		*/

	}
}