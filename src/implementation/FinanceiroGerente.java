package implementation;

import java.util.List;
import model.Gerente;

public class FinanceiroGerente {
	
	public double calcularTotalSalarios(List<Gerente> funcionarios) {
		double totalSalarios = 0.0;
		for (Gerente funcionario : funcionarios) {
			totalSalarios += funcionario.calcularSalario();
		}
		return totalSalarios;
	}

}
