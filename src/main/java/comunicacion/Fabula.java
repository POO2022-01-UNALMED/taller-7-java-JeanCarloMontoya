package comunicacion;

public class Fabula extends Escrito {
	private String ensenanza;
	private String interpretacion;
	
	public Fabula(String origen, String titulo, String autor, int paginas,String e,String i){
		super(origen,titulo,autor,paginas);
		ensenanza=e;
		interpretacion=i;}
	
	public int palabrasTotales(int i) {
		return this.getPaginas()*i;
	}
	public String interpretacion() {
		return interpretacion;
	}
	public String toString() {
		String c=this.resumen()+"\n"
				+ensenanza;
		return c;}

	public String getEnsenanza() {
		return ensenanza;
	}

	public void setEnsenanza(String ensenanza) {
		this.ensenanza = ensenanza;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}


}
