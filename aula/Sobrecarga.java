public class Sobrecarga
{
	/*
		Metodos sobrecarregados
		Tem o mesmo nome
		Com assinaturas diferentes
	*/
	public static void main(String[] args)
	{

	}
	
	double media(int x,int y)
	{
		int total = x + y;
		System.out.println("Total = bla bla bla");
	}

	double media(int x)
	{
		return x;
	}	
	double media(String x,String y)
	{
		int ix = Integer.parseInt(x);
		int iy = Integer.parseInt(y);

		return (ix + iy) / 2;
	}
	//Var Args
	double media(int ... numeros) 
	{
		double tt = 0;
		for(double m : numeros)
		{
			tt += m;
		}
		return m / numeros.length;
	}
}