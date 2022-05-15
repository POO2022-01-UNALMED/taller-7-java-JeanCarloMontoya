package comunicacion;

public class Libro extends Escrito {
	private String co_autor;
	private String editorial;
	private String edicion;
	private String interpretacion;
	
	public Libro(String origen, String titulo, String autor, int paginas,String a,String ed,String edic,String i) {
		super(origen,titulo,autor,paginas);
		co_autor=a;
		editorial=ed;
		edicion=edic;
		interpretacion=i;}
	
	public String getCo_autor() {
		return co_autor;
	}
	public void setCo_autor(String co_autor) {
		this.co_autor = co_autor;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public String getEdicion() {
		return edicion;
	}
	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}
	public String getInterpretacion() {
		return interpretacion;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	public int palabrasTotales(int i) {
		return this.getPaginas()*i*2;
		}
	public String toString() {
		String c=this.resumen()+"\n"
				+co_autor+"\n"
				+editorial+"\n"+edicion;
		return c;}
	public String interpretacion() {
		return interpretacion;
	}



}
