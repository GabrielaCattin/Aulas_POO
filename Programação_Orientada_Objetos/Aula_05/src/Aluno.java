public class Aluno {
	// Atributos
	String nome;
	String matricula;
	private Double nota1;
	private Double nota2;
	private Double notaReavaliacao;
	private boolean aprovado;
	
	// Construtor vazio
	Aluno(){
		}
	// Construtor com parametros
	Aluno(String nome, String matricula, 
			Double nota1, Double nota2, 
			Double notaReavaliacao) {
		this.nome = nome;
		this.matricula = matricula;
		setNota1(nota1);
		setNota2(nota2);
		setNotaReavaliacao(notaReavaliacao);
		aprovado = (calcularMediaFinal() >= 6);
	}
	
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", matricula=" + matricula + ", nota1=" + nota1 + ", nota2=" + nota2
				+ ", notaReavaliacao=" + notaReavaliacao + ", Media()=" + calcularMedia()
				+ ", MediaFinal()=" + calcularMediaFinal() + ", Aprovado="+aprovado+ "]";
	}
	
	public double calcularMedia() {
		return ( nota1 + nota2 ) / 2;
	}
	
	public double calcularMediaFinal() {
		if (calcularMedia() >= 6)
			return calcularMedia();
		else
			return (calcularMedia() + notaReavaliacao)/2;
	}
	
	public boolean getAprovado() {
		return aprovado;
	}
	
	public void setNota1 (double n1) {
		if(n1 >= 0 || n1 <= 10) {
		nota1 = n1;
		aprovado = (calcularMediaFinal() >= 6);
		} else {
			System.out.println("Nota 1="+n1+ " - Valor Inválido!!!");
		}
	}
	
	public void setNota2 (double n2) {
		if( n2 >=0 || n2 <=10) {
		nota2 = n2;
		aprovado = (calcularMediaFinal() >= 6);
		} else {
			System.out.println("Nota 2="+n2+ " - Valor Inválido!!!");
		}
	}
	
	public void setNotaReavaliacao (double n) {
		if( n >=0 || n <= 10) {
		notaReavaliacao = n;
		aprovado = (calcularMediaFinal() >= 6);
		} else {
			System.out.println("Nota Reavaliacao="+n+ " - Valor Inválido!!!");
		}
	}
	public Double getNota1() {
		return nota1;
	}
	
	public Double getNota2() {
		return nota2;
	}
	
	public Double getNotaReavaliacao() {
		return notaReavaliacao;
	}
	
}
