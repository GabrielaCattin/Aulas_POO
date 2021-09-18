package Exercicio_02;

public class Caminhao extends Veiculo {
	private int eixos; 
	
	public Caminhao() {
		
	}
	public Caminhao(String p, int a, int eixos) {
		super(p, a);
		this.eixos = eixos;
	}
	private int getEixos() {
		return eixos;
	}
	private void setEixos(int eixos) {
		this.eixos = eixos;
	}
	@Override
	public String toString() {
		return "Caminhao [eixos=" + eixos + " - ]"+ super.toString();
	}
	
}
