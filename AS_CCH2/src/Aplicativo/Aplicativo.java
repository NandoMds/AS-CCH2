package Aplicativo;

public abstract class Aplicativo {
	String funcionalidades;

	public Aplicativo(String funcionalidades) {
		this.funcionalidades = funcionalidades;
	}
	
	public String getFuncionalidades() {
		return funcionalidades;
	}

	public void setFuncionalidades(String funcionalidades) {
		this.funcionalidades = funcionalidades;
	}
	
}