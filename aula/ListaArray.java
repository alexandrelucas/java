import java.util.ArrayList;

public class ListaArray
{
	public static void main(String[] args)
	{
		ArrayList<String> cores = new ArrayList<String>();
		cores.add("Branco");
		cores.add(0,"Vermelho"); // Adiciona na posição 0 forçando o indice que está em 0 ser empurrado para a proxima ou ultima

		int arrayLength = cores.size();
		String recuperarElemento = cores.get(0);
		int pegarPosicao = cores.indexOf("Branco");

		cores.remove("Branco");
		cores.contains("Amarelo");

	}
}