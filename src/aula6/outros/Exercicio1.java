package aula6.outros;

public class Exercicio1 {
	public static void main(String[] args) {
		for (DiaSemanaEnum d: DiaSemanaEnum.values()) {
			System.out.println(d.getCod() + " - " + d.getNome() + (d.isFimDeSemana() ? " -> FINAL DE SEMANA" : ""));
		}
	}
}
