package br.kadu.imc;

public class Principal {

	public static void main(String[] args) {
		
		Paciente p1 = new Paciente(75, 1.80);
		Paciente p2 = new Paciente(85, 1.70);
		Paciente p3 = new Paciente(95, 1.60);
		
		p1.calcularIMC();
		p1.diagnostico();
		System.out.println("IMC do pacaiente 1 = "+p1.getImc()+". Diagnóstico do "
				+ "paciente 1 = "+p1.getDiagnostico());
		
		p2.calcularIMC();
		p2.diagnostico();
		System.out.println("IMC do pacaiente 2 = "+p2.getImc()+". Diagnóstico do "
				+ "paciente 1 = "+p2.getDiagnostico());
		
		p3.calcularIMC();
		p3.diagnostico();
		System.out.println("IMC do pacaiente 3 = "+p3.getImc()+". Diagnóstico do "
				+ "paciente 1 = "+p3.getDiagnostico());

	}

}
