public class Fibonacci
{
	public static void main(String[] args)
	{
		int anterior = 0;
		int proximo = 1;
		while(proximo < 50)
		{
		System.out.println(proximo);
		proximo = proximo + anterior; //Proximo numero fibonacci;
		anterior = proximo - anterior; //atualiza o fibonacci anterior.
		}
	}
}