package implementation;

import java.util.List;
import model.Secretario;

public class FinanceiroSecretario {

	public double calcularTotalSalarios(List<Secretario> funcionarios) {
		double totalSalarios = 0.0;
		for (Secretario funcionario : funcionarios) {
			totalSalarios += funcionario.calcularSalario();
		}
		return totalSalarios;
	}

	public double calcularTotalBeneficios(List<Secretario> funcionarios) {
		double totalBeneficios = 0.0;
		for (Secretario funcionario : funcionarios) {
			totalBeneficios += funcionario.calcularBeneficio();
		}
		return totalBeneficios;
	}

	public Secretario obterFuncionarioMaiorValor(List<Secretario> funcionarios) {
		Secretario funcionarioMaiorValor = null;
		double maiorValor = 0.0;
		for (Secretario funcionario : funcionarios) {

			double valorRecebido = funcionario.calcularSalario();

			if (valorRecebido > maiorValor) {
				maiorValor = valorRecebido;
				funcionarioMaiorValor = funcionario;
			}
		}
		return funcionarioMaiorValor;
	}

	public Secretario obterFuncionarioMaiorBeneficio(List<Secretario> funcionarios) {
		Secretario funcionarioMaiorBeneficio = null;
		double maiorBeneficio = 0.0;
		for (Secretario funcionario : funcionarios) {
			double beneficio = funcionario.calcularBeneficio();

			if (beneficio > maiorBeneficio) {
				maiorBeneficio = beneficio;
				funcionarioMaiorBeneficio = funcionario;
			}
		}
		return funcionarioMaiorBeneficio;
	}

}
