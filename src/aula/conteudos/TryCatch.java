package aula.conteudos;

public class TryCatch {
	public static void main(String[] args) {
		try {
			String s = null;
			s.equals("abc");
			System.out.println("Sucesso");
		} catch (NullPointerException e) {
			System.out.println("Nullpointer");
		} catch (Exception e) {
			System.out.println("Outro erro");
		}
		System.out.println("Programa continuando...");
	}
}
