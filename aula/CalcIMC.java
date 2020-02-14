/*
			Cálculo do IMC
			índice de massa corporal

			//Expressão
			IMC = Peso / (Altura)²
			IMC = PesoEmKg / (AlturaEmMetros * AlturaEmMetros)
			< 20 : Abaixo do peso
			20-25 : Peso ideal
			25-30 : Sobrepeso
			30-35 : Obesidade Moderada
			35-40 : Obesidade Severa
			40-45 : Obesidade Mórbida
			> 50 : Super-Obesidade
*/
import javax.swing.JOptionPane;


public class CalcIMC
{
	public static void main(String[] args)
	{
		String peso = JOptionPane.showInputDialog("Qual o seu peso em quilogramas (KG)?");
		String altura = JOptionPane.showInputDialog("Qual a sua altura em metros?");
		double pesoEmKg = Double.parseDouble(peso);
		double alturaEmMetros = Double.parseDouble(altura);

		double imc = pesoEmKg / (alturaEmMetros * alturaEmMetros);
		
		String msg = (imc >= 20-25 && imc <= 25)  ? "Parabéns! Você está no peso ideal." : "Você precisa se cuidar melhor\n pois está fora do peso.";
		
		JOptionPane.showMessageDialog(null,"Calculo IMC: " + (int)imc + "\n" + msg);
	}
}