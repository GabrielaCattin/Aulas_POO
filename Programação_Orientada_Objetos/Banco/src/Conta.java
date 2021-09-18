
public class Conta {

		Double numConta;
		Double agenciaNum;
		String agenciaNome;
		Double bancoNum;
		String bancoNome;
		Double tipo;

		
	Conta(Double numConta, Double agenciaNum, String agenciaNome, Double bancoNum, 
			String bancoNome, Double tipo){
		this.numConta = numConta;
		this.agenciaNum = agenciaNum;
		this.agenciaNome = agenciaNome;
		this.bancoNum = bancoNum;
		this.bancoNome = bancoNome;
		setTipo(tipo);
			
}

	
	@Override
	public String toString() {
		return "Conta [numConta=" + numConta + ", agenciaNum=" + agenciaNum + ", agenciaNome=" + agenciaNome
				+ ", bancoNum=" + bancoNum + ", bancoNome=" + bancoNome + ", tipo=" + tipo + "]";
	}


	public void setTipo(double n) {
		
		if (n == 1.0) {
			tipo = n;
			System.out.println("Conta Corrente");
		} else if(n == 2.0) {
			tipo = n;
			System.out.println("Conta Poupança");
		} else if(n == 3.0) {
			tipo = n;
			System.out.println("Conta Conjunta");
		} else if(n == 4.0) {
			tipo = n;
			System.out.println("Conta Encerrada");
		} else {
			System.out.println("Número"+n+ "Inválido!!!");
		}
		}
	}
	
	


