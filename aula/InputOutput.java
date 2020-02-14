import java.util.Scanner;

public class InputOutput
{
	public static void main(String[] args)
	{
		//Chamada do programa
		//System.out.println(args[0]);

		//Interação com o usuário
		Scanner s = new Scanner(System.in);
		System.out.println("Qual o seu nome? ");
		String nome = s.nextLine();
		System.out.println("Bem vindo " + nome);
	}
}