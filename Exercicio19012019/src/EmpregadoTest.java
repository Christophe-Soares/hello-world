
public class EmpregadoTest {

	public static void main(String[] args) {

		Empregado empregado = new Empregado("Christophe", 'M', 1000, 14);
		
		Empregado empregado2 = new Empregado("Andre", 'M', 800, 10);

		System.out.println(empregado.getNome() + ": " + empregado.calcularSalario());
		
		System.out.println(empregado2.getNome() + ": " + empregado2.calcularSalario());

	}

}
