package comunicacion;

public class Tesis extends Escrito{
	public String idea;
	public String[] argumentos;
	public String conclusion;
	public String referencias;
	public String interpretacion;
	
	public Tesis(String origen, String titulo, String autor, int paginas,String i,String[] a,String c,String r,String in) {
		super(origen,titulo,autor,paginas);
		idea=i;
		argumentos=a;
		conclusion=c;
		referencias=r;
		interpretacion=in;
		}
	
	public int palabrasTotales(int i) {
		return this.getPaginas()*i*5;}
	public String interpretacion() {
		return interpretacion;
	}
	public String toString() {
		String c=this.resumen()+"\n"+idea+"\n"+argumentos.length+"\n"+conclusion+"\n"+referencias;
		return c;
		}

	public String getIdea() {
		return idea;
	}

	public void setIdea(String idea) {
		this.idea = idea;
	}

	public String[] getArgumentos() {
		return argumentos;
	}

	public void setArgumentos(String[] argumentos) {
		this.argumentos = argumentos;
	}

	public String getConclusion() {
		return conclusion;
	}

	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}

	public String getReferencias() {
		return referencias;
	}

	public void setReferencias(String referencias) {
		this.referencias = referencias;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	

}
