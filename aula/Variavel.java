public class Variavel
{
	public static void main(String[] args)
	{
		int idade = 15;
		double preco = 12.45;
		char sexo = 'M';
		boolean casado = true;

		//sufixos para números F,D,L
		//byte b = 127; //cem
		//short s = 3268; // 32mill
		//int i = 2.000.000.000; // 2Bi
		//long i = 9_000_000_000_000_000L; // 9 Quintilhoes
		//double d = 1.7976931348623157E+308D;  //Padrao IEEE 754

		//byte bb = 0b10000000; // 8 bits 1 byte
		//short ss = 0b1000000010000000; // 16 bits 2 bytes
		//int ii = 0b1000000010000000100000001000000010000000; // 32 bits 4 bytes

		short s = 10;
		int i = 20;

		//i = s; // Cast Implícito
		i = (int)s; // Cast Explícito


		System.out.println(i);
	}
}