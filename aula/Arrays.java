import java.util.Arrays;

public class Arrays
{
	public static void main(String[] args)
	{
		String[] paises = {"Brasil","Russia","India","China"};
		int[] num = {0,1,2,3};

		/* Loop
		for(int i = 0; i < paises.length; i++)
		{
			System.out.println(paises[i]);
		}*/
		/* Loop ForEach
		for(String pais : paises)
		{
			System.out.println(pais);
		}*/

		//System.out.println(Arrays.toString(paises));
		
		int posicao = Arrays.binarySearch(paises,"Russia"); // Checa a posição no array pelo parametro do tipo string.
		Arrays.sort(paises,0,paises.length); // Ordenação por ordem alfabetica ou crescente

		//Array de objetos
		Double[] valores = {12.35,23.40};
		valores[0].doubleValue();
	}
}