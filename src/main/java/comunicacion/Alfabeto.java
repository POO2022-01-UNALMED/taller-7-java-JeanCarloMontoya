package comunicacion;

public class Alfabeto extends Pictograma{
	private String interpretacion;
	private String[] letras;
	
	public Alfabeto(String s,String[] l,String i) {
		super(s);
		interpretacion=i;
		letras=l;}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}

	public String[] getLetras() {
		return letras;
	}

	public void setLetras(String[] letras) {
		this.letras = letras;
	}
	public int cantidadLetras() {
		return letras.length;			
	}
	public String toString() {
		String c="";
		for(int i=0;i<=letras.length-2;i++) {
			c+=letras[i]+", ";	
		}
		c=c+letras[letras.length-1];
		return c;}
	public String interpretacion() {
		return interpretacion;}

}
