public class OpMath
{
	public static void main(String[] args)
	{
		/*
			Op Bits (BitWise)
			& | ^ ~ <<=
			&= |= ^| >>= >>>=

			Op Especiais
			?: 		Operador Ternário
			, 		Separação de expressões
			()		Chamada de método
			(cast)	Coerção unária

		*/		
		int idade = 6;
		String id = (idade >= 18) ? "> de idade" : "< de idade";

		//Calcular diametro de um circulo
		//Diâmetro = 2 * r (raios)
		double raio = 10;
		double diametro = 2 * raio;
		//Circuferência = 2 * PI * r
		double pi = Math.PI;
		double circuferencia = 2 * pi * raio;
		//Área = PI * r²
		double area = pi * (raio * raio);

	}
}