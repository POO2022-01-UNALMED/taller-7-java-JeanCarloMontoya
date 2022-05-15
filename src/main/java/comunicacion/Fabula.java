package comunicacion;

public class Fabula extends Escrito {
	private String enseñanza;
	private String interpretacion;
	
	public Fabula(String origen, String titulo, String autor, int paginas,String e,String i){
		super(origen,titulo,autor,paginas);
		enseñanza=e;
		interpretacion=i;}
	
	public int palabrasTotales(int i) {
		return this.getPaginas()*i;
	}
	public String interpretacion() {
		return interpretacion;
	}
	public String toString() {
		String c=this.resumen()+"\n"
				+enseñanza;
		return c;}

	public String getEnsenanza() {
		return enseñanza;
	}

	public void setEnsenanza(String enseñanza) {
		this.enseñanza = enseñanza;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}


}
