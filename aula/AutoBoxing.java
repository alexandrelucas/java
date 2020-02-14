public class AutoBoxing
{
	public static void main(String[] args)
	{
		//Antiga
		Integer x = new Integer(555); // empacotar
		int a = x.intValue(); //desempacotar
		a++; // incrementa
		x = new Integer(a); // re-empacotar

		//Nova 
		Integer x = 555;
		x++; //Desempacotando, incrementando, reempacotando
		System.out.println(x);
	}
}