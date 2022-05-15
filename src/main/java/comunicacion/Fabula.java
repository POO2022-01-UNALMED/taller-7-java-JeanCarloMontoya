package comunicacion;

public class Fabula extends Escrito {
	private String ense�anza;
	private String interpretacion;
	
	public Fabula(String origen, String titulo, String autor, int paginas,String e,String i){
		super(origen,titulo,autor,paginas);
		ense�anza=e;
		interpretacion=i;}
	
	public int palabrasTotales(int i) {
		return this.getPaginas()*i;
	}
	public String interpretacion() {
		return interpretacion;
	}
	public String toString() {
		String c=this.resumen()+"\n"
				+ense�anza;
		return c;}

	public String getEnsenanza() {
		return ense�anza;
	}

	public void setEnsenanza(String ense�anza) {
		this.ense�anza = ense�anza;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}


}
