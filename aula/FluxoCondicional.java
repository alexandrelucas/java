public class FluxoCondicional
{
	public static void main(String[] args)
	{
		/*
		int num = 9;
		if((num % 2) == 0)
		{
			System.out.println("Par");
		}
		else
		{
			System.out.println("Impar");
		}*/
		/*
		int idade = 18;
		
		if(idade <= 11)
		{
			System.out.println("Crianca");
		} 
		else if(idade > 13 && idade < 18)
			System.out.println("Adolescente");
		else if(idade > 18 && idade <= 60)
			System.out.println("Adulto");
		else System.out.println("Idoso");*/

		int nota = 5;
		if(nota >= 7)
		{
			System.out.println("Passou");
		}
		else
		{
			System.out.println("Reprovou");
			if(nota >= 6)
			{
				System.out.println("Tem a chance de recuperacao");
			}
			else
			{
				System.out.println("Se fodeu de vez :3");
			}
		}
	}
}