public class Raiz
{
	/*
		maior(um : int,dois : int) : int
		raiz(numero : int) : int
		romanos(numero : int) : String
		soma() : double 

		raiz de 16 é 4
		porque 4x4 é 16 (4²)

		Baseado na equação de pell's este é o método para obter a raiz quadrada simplesmente subtraindo números
		ímpares.

		Ex: Para obter Raiz de 27 nós começamos com a seguinte sequência:

		1. 27 - 1 =26
		2. 26 - 3 = 23
		3. 23 - 5 = 18
		4. 11 - 9 = 2

		5 passos foram tomados e isso nos leva que a parte inteira da raiz quadrada de 27 é 5

	*/
	public static void main(String[] args)
	{
		int raz = raiz(16);
		System.out.println(raz);
	}
	/** @return a raiz quadrada no numero segundo a raiz de pell' */
	static int raiz(int numero)
	{
		int raiz = 0, impar = 1;
		
		while(numero >= impar)
		{
			numero -= impar;
			impar += 2;
			++raiz;
		}

		return raiz;
	}
	int maior(int um, int dois)
	{
		if(um > dois)
			return um;
		return dois;
	}
}