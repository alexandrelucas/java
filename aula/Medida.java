public enum Medida {
	MM("Milímitro"), CM("Centimetro"),M("Metro");

	public String titulo;
	Medida(String titulo){
		this.titulo = titulo;
	}
}
public class Test
{
	for(Medida m : Medida.values())
	{
		System.out.println(m + " : " + m.titulo);
	}
}