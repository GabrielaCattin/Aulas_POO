package Exercicio_ContaCorrente;

public class TesteConta {

	public static void main(String[] args) {
		ContaCorrente banco1 = new ContaCorrente("xxx", "xx", 00, "bancox", 00, 1);
		
		banco1.Creditar(2000);
		banco1.Debitar(350);
		banco1.getSaldo();
		banco1.setTipo(1);
		
		System.out.println(banco1);

	}

}
