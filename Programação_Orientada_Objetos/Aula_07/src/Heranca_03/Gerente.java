package Heranca_03;

public class Gerente extends Funcionario{
	private String departamento;
	private Data inicioGerencia;
	public Gerente(String nome, String identidade, Data dtnascimento, Data dtAdmissao, float salario, String departamento, Data inicioGerencia) {
		super(nome, identidade, dtnascimento, dtAdmissao, salario);
		this.departamento = departamento;
		this.inicioGerencia = inicioGerencia;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public Data getInicioGerencia() {
		return inicioGerencia;
	}
	public void setInicioGerencia(Data inicioGerencia) {
		this.inicioGerencia = inicioGerencia;
	}
	@Override
	public String toString() {
		return "Gerente [departamento=" + departamento + ", inicioGerencia=" + inicioGerencia +""+super.toString()+ "]";
	}
	
	
	
}
