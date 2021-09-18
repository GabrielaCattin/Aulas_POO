package Exercicio_ContaCorrente;

public class ContaCorrente {

	private String nrConta;
	private String agencia;
	private int nrAgencia;
	private String banco;
	private int nrBanco;
	private int tipo;
	private float saldo;
	
	
	//Abrir Conta Corrente
	public ContaCorrente( String nrConta, String agencia, int nrAgencia, String banco, int nrBanco, int tipo) {
		
		this.nrConta = nrConta;
		this.agencia = agencia;
		this.nrAgencia = nrAgencia;
		this.banco = banco;
		this.nrBanco = nrBanco;
		this.tipo = tipo;
		this.saldo = 0;
	}
	
	//Encerrar 
	public void Encerrar() {
		if(getSaldo() >= 0 ) {
			this.tipo = 4;
			System.out.println("Saldo: "+getSaldo());
			this.saldo = 0;
		}
	}
	
	
	// Creditar
	public void Creditar(float valor) {
		if(this.tipo == 4 ) {
			System.out.println("Conta Encerrada!!!");
		} else {
			this.saldo += valor;
			System.out.println("Saldo Atualizado: "+getSaldo());
		}
		
	}
	
	// Debitar
	public void Debitar(float valor) {
		if(this.tipo == 4) {
			System.out.println("Conta Encerrada!!!");
		} else {
			this.saldo -= valor;
			System.out.println("Saldo Atualizado: "+getSaldo());
		}
	}

	// Consultar saldo
	public float getSaldo() {
		return saldo;
	}


	public String getNrConta() {
		return nrConta;
	}


	public String getAgencia() {
		return agencia;
	}


	public int getNrAgencia() {
		return nrAgencia;
	}


	public String getBanco() {
		return banco;
	}


	public int getNrBanco() {
		return nrBanco;
	}


	public int getTipo() {
		return tipo;
	}


	public void setNrConta(String nrConta) {
		this.nrConta = nrConta;
	}


	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}


	public void setNrAgencia(int nrAgencia) {
		this.nrAgencia = nrAgencia;
	}


	public void setBanco(String banco) {
		this.banco = banco;
	}


	public void setNrBanco(int nrBanco) {
		this.nrBanco = nrBanco;
	}


	public void setTipo(int tipo) {
		this.tipo = tipo;
		if(tipo == 1 ) {
			System.out.println("Conta Corrente");
		} else if (tipo == 2 ) {
			System.out.println("Conta Poupança");
		} else if (tipo == 3 ) {
			System.out.println("Conta Conjunta");
		} else {
			System.out.println("Conta Encerrada");
		}
		
	}


	@Override
	public String toString() {
		return "ContaCorrente [nrConta=" + nrConta + ", agencia=" + agencia + ", nrAgencia=" + nrAgencia + ", banco="
				+ banco + ", nrBanco=" + nrBanco + ", tipo=" + tipo + ", saldo=" + saldo + "]";
	}


	
	
}
