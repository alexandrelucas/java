public class FluxoRepeticao
{
	public static void main(String[] args)
	{
		String texto = "";
		/*for(int i=10; i > 0; --i) //Decremente
		{
			texto += i; 
		}
		for(int i=0;i < 20; i++) //de 2 em 2
		{
			if(i % 2 == 0)
			{
				texto += i;
			}
		}*/ 
		int tamanho = 5;
		for(int i=0;i < tamanho; i++)
		{
			for(int x = 0; x < tamanho; x++)
			{
			System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println(texto);
	}
}