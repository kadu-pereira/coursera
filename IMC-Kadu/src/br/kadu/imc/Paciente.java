package br.kadu.imc;

public class Paciente {

	double peso;
	double altura;
	double imc;
	String diagnostico;

	public Paciente(double peso, double altura) {
		this.peso = peso;
		this.altura = altura;
	}

	public double getImc() {
		return imc;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void calcularIMC() {

		imc = peso / (altura * altura);

	}

	public void diagnostico() {

		if (imc < 16) {
			diagnostico = "Baixo peso muito grave";
		}
		if (imc <= 16 && imc < 16.99) {
			diagnostico = "Baixo peso grave";
		}
		if (imc >= 17 && imc <= 18.49) {
			diagnostico = "Baixo peso";
		}
		if (imc >= 18.50 && imc < 24.99) {
			diagnostico = "Peso normal";
		}
		if (imc >= 25 && imc < 29.99) {
			diagnostico = "Sobrepeso";
		}
		if (imc >= 30 && imc < 34.99) {
			diagnostico = "Obesidade grau I";
		}
		if (imc >= 35 && imc < 39.99) {
			diagnostico = "Obesidade grau II";
		}
		if (imc >= 40) {
			diagnostico = "Obesidade grau III";
		}

	}

}
