package heranca4;

public class main {

	public static void main(String[] args) {

		Vendedor cv = new Vendedor("Danilo", 1000, 100);

		Funcionario f = new Funcionario("Roberto", 650);
		System.out.println(cv.getSalario()  + " " + cv.getNome());
		System.out.println(f.getNome() + " " + f.getSalario());

	}
}
