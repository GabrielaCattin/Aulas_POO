package Exercicio_02;

public class Veiculo {
 private String placa;
 private int ano;
 
 public Veiculo() {
	 
 }
 public Veiculo(String placa, int ano) {
	 this.placa = placa;
	 this.ano = ano;
 }
private String getPlaca() {
	return placa;
}
private void setPlaca(String placa) {
	this.placa = placa;
}
private int getAno() {
	return ano;
}
private void setAno(int ano) {
	this.ano = ano;
}
@Override
public String toString() {
	return "Veiculo [placa=" + placa + ", ano=" + ano + "]";
}
}
