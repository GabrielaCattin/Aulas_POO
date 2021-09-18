package Exercicio_01;

public class Funcionario {
 private String nome;
 private String cpf;
 private double salario;
 
 public Funcionario() {}
 
	 public Funcionario(String nome, String cpf, double salario) {
	 this.nome= nome;
	 this.cpf = cpf;
	 this.salario = salario;
 }

	
	private String getNome() {
		return nome;
	}

	private void setNome(String nome) {
		this.nome = nome;
	}

	private String getCpf() {
		return cpf;
	}

	private void setCpf(String cpf) {
		this.cpf = cpf;
	}

	private double getSalario() {
		return salario;
	}

	private void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", cpf=" + cpf + ", salario=" + salario + "]";
	}
}

	