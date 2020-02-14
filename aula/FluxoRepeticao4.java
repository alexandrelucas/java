public class FluxoRepeticao4
{
	public static void main(String[] args)
	{
		/* Break e Continue
		for(int i=0; i < 10; i++)
		{
			if(i == 5)
			{
				break; //Quebra o loop inteiro
				continue; // Pula a interação atual e continua o loop
			}
			System.out.println(i);
		}*/
		/*
		//Rótulos
		um:
		for()
		{
			dois:
			for(int i=0; i < 10; i++)
			{
				if(i == 5)
				{
					break um;
				}
			}
		}*/




		//Matriz
		boolean[][] matriz = 
		{
			{false,true,false,false,false,false},
			{false,false,false,false,false,false}
		};
		busca:
		for(int a=0; a < matriz.length; a++)
		{
			System.out.print("A ");
			for(int b=0; b < matriz[a].length; b++)
			{
				if(matriz[a][b])
				{
					System.out.print("TRUE ");
					break busca;
				}
				System.out.print("B ");
			}
		}
	}
}