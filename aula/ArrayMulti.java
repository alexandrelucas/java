import java.util.Random;

public class ArrayMulti
{
	public static void main(String[] args)
	{
		//Array de 1 dimensão
		String[] nomes = {"Lucas","Raissa","Pedro"};
		//Array de 2 dimensões
		String[][] infos = 
		{	
			{"Lucas","M","SP"},
			{"Raissa","F","RJ"},
			{"Pedro","M","RJ"}
		};

		//App de cartas
		String[] faces = {"As","2","3","4","5","6","7","8","9","10","Valete","Dama","Rei"};
		String[] nipes = {"Espadas","Copas","Paus","Ouros"};

		Random r = new Random();

		int indiceFace = r.nextInt(faces.length);
		String face = faces[indiceFace];

		int indiceNipe = r.nextInt(nipes.length);
		String nipe = nipes[indiceNipe];

		String carta = face + " de " + nipe;

		System.out.println(carta);
	}
}