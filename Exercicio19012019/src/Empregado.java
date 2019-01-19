
public class Empregado {
	private String nome;
	private char sexo;
	private double salario;
	private int meses;


	public double calcularSalario() {
		
		double calcularSalario = getSalario() * getMeses();
		return calcularSalario;
	}

	public Empregado(String nome, char sexo, double salario, int meses) {
		this.nome = nome;
		this.sexo = sexo;
		this.salario = salario;
		this.meses = meses;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getMeses() {
		return meses;
	}
	
	public void setMeses(int meses) {
		this.meses = meses;
	}
}