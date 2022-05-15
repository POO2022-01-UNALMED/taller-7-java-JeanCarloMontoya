package comunicacion;

public class Periodico extends Escrito {
	private String fecha;
	private String primicia;
	private String interpretacion;
	
	public Periodico(String origen, String titulo, String autor, int paginas,String f,String p,String i) {
		super(origen,titulo,autor,paginas);
		fecha=f;
		primicia=p;
		interpretacion=i;
	}
	public int palabrasTotales(int i) {
		return this.getPaginas()*i*10;
	}
	public String toString() {
		String c=this.resumen()+"\n"+fecha+"\n"+primicia;
		return c;
		}	
	public String interpretacion() {
		return interpretacion;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getPrimicia() {
		return primicia;
	}
	public void setPrimicia(String primicia) {
		this.primicia = primicia;
	}
	public String getInterpretacion() {
		return interpretacion;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
}
