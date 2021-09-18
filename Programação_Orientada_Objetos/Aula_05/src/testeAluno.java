
public class testeAluno {

	public static void main(String[] args) {
		Aluno aluno01 = new Aluno("Gabriela", "2040482023046", 10.0, 9.8, 0.0);
		Aluno aluno02 = new Aluno("Mateus", "2040482023043", 8.0, 0.0, 7.0 );
		
		System.out.println(aluno01.toString());
		System.out.println("Media: " + aluno01.calcularMedia());
		
		System.out.println(aluno02.toString());
		System.out.println("Media: " + aluno02.calcularMedia());
		System.out.println("Media Final: " + aluno02.calcularMediaFinal());
		System.out.println("Aprovado: "+aluno02.getAprovado());
		System.out.println(aluno02.getNota1());
		
	}
}
