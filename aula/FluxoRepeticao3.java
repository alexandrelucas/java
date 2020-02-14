import java.util.ArrayList;
import java.util.Scanner;

public class FluxoRepeticao3
{
	public static void main(String[] args)
	{
		/*
		int i = 0;
		int j = 1;
		while(i < 2) // Enquanto
		{
			System.out.println(i);
			i++;
		};

		do // O programa executa pelo menos 1 vez antes da execuçao do while
		{
			System.out.println("Tika " + j);
		} while (j < 2);*/

		ArrayList<String> produtos = new ArrayList<String>();
		Scanner s = new Scanner(System.in);
		System.out.println("Liste seus produtos: Para sair digite FIM");

		String produto;

		while(!"FIM".equals(produto = s.nextLine()))
		{
			produtos.add(produto);
		}
		System.out.println(produtos.toString());
	}
}