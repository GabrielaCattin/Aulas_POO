package Exercicio_01;

public class Main {

		public static void main(String[] args) {
			Funcionario func01 = new Funcionario("Pedro", "123456789", 5364.00);
			System.out.println(func01);
			
			Gerente ger01 = new Gerente("Alex", "123654987", 10321.65, 321);
			System.out.println(ger01);
			System.out.println(ger01.autentica(0));

		}

}


