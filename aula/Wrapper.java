public class Wrapper
{
	public static void main(String[] args)
	{
		/*
			Wrappers primitivos (Classes)

			Integer		Byte		Short
			Long		Float		Double
			Character	void 		Boolean

		*/
		Integer idade = new Integer(15);
		Double preco = new Double(12.45);
		Boolean v = new Boolean("true");
		
		//Conversão Estática
		double d1 = Double.parseDouble("123.45");
		int i1 = Integer.parseInt("123");
		float f1 = Float.parseFloat("3.14F");

		int i2 = Integer.valueOf("101011",2); // Converte Base binaria para int

		/*
		int i preco.intValue();
		byte b = preco.byteValue();*/


	}
}