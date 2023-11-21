package service;

import java.math.BigDecimal;
import java.util.List;
import model.Funcionario;
import repository.PagamentoRepository;

public class PagamentoService  {
	
	private static final String TIPO_SECRETARIO = "Secretário";
	private static final String TIPO_GERENTE = "Gerente";
	private static final String TIPO_VENDEDOR = "Vendedor";


	public double calcularTotalPago(List<Funcionario> funcionarios, String mes, String ano) {
		if (!funcionarios.isEmpty()) {
			for (Funcionario funcionario : funcionarios) {
				validarSalarioBeneficiadoFuncionario(funcionario.getMesesServico(), funcionario);
			}
		}
		return 0;
	}

	

	private Double validarSalarioBeneficiadoFuncionario(Double meses, Funcionario funcionario) {

		if (funcionario.getCargo() == TIPO_SECRETARIO)
			return funcionario.getSalario() + (meses / 12) * 1000.0 + 0.2 * funcionario.getSalario();

		if (funcionario.getCargo() == TIPO_VENDEDOR)
			return funcionario.getSalario() + (meses / 12) * 1800.0 + 0.3 * funcionario.getSalario();


		 return funcionario.getSalario();
	}



}
