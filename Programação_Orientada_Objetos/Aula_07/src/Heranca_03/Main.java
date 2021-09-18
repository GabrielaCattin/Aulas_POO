package Heranca_03;

public class Main {

	public static void main(String[] args) {
		Data d1 = new Data(1,5,2010);
		Data d2 = new Data(28,03,1995);
		System.out.println(d1);
		System.out.println(d2);
		
		Pessoa p1 = new Pessoa("Gabriela", "424034530", d2); //ou
		Pessoa p2 = new Pessoa("Manuella", "123456789", new Data(13,04,2017));
		System.out.println(p1);
		System.out.println(p2);
		
		Professor prof1 = new Professor("2023","Joao", "123654987", new Data(15,05,1987));
		System.out.println(prof1);
		
		Aluno aln1 = new Aluno("204048", 0, "Gabi", "424034530", d2);
		System.out.println(aln1);
		
		Funcionario fun1 = new Funcionario( "Paulo", "09876523-11", new Data(1,1,2001), new Data(20, 3, 2020), 5932.76f);
		System.out.println(fun1);
		
		Gerente ger1 = new Gerente("Benicio", "2025896314-96", new Data(2,3,1995), new Data(25, 5, 2019),14369.98f, "TI", new Data(17,9,2020));
		System.out.println(ger1);
	}

}
