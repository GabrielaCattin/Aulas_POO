package Exercicio_02;

public class Onibus extends Veiculo {
 private int assentos;
 
 public Onibus() {
	 
 }
 public Onibus(String p, int a, int assentos) {
	 super(p, a);
	 this.assentos = assentos;
 }
private int getAssentos() {
	return assentos;
}
private void setAssentos(int assentos) {
	this.assentos = assentos;
}
@Override
public String toString() {
	return "Onibus [assentos=" + assentos + " - ]" + super.toString();
}
}
