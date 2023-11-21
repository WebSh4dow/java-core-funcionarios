package implementation;

import java.util.List;
import model.Venda;
import model.Vendedor;

public class FinanceiroVendedor {

	public Vendedor obterVendedorMaiorVenda(List<Vendedor> funcionarios, List<Venda> vendas) {
	    Vendedor vendedorMaiorVenda = null;
	    double maiorVenda = 0.0;

	    for (Vendedor vendedor : funcionarios) {
	        double vendaNoMes = calcularVendaDoVendedor(vendas, vendedor.getNome());

	        if (vendaNoMes > maiorVenda) {
	            maiorVenda = vendaNoMes;
	            vendedorMaiorVenda = vendedor;
	        }
	    }

	    return vendedorMaiorVenda;
	}

	private double calcularVendaDoVendedor(List<Venda> vendas, String nomeVendedor) {
	    double totalVenda = 0.0;

		for (Venda venda : vendas) {

			for (double valor : venda.getVendas()) {
				totalVenda += valor;
			}

		}

	    return totalVenda;
	}
	
	public double calcularTotalSalarios(List<Vendedor> funcionarios) {
		double totalSalarios = 0.0;
		for (Vendedor funcionario : funcionarios) {
			totalSalarios += funcionario.calcularSalario();
		}
		return totalSalarios;
	}

	
	public double calcularTotalBeneficios(List<Vendedor> funcionarios) {
		double totalBeneficios = 0.0;
		for (Vendedor funcionario : funcionarios) {
			totalBeneficios += funcionario.calcularBeneficio();
		}
		return totalBeneficios;
	}

	public Vendedor obterFuncionarioMaiorValor(List<Vendedor> funcionarios) {
		Vendedor funcionarioMaiorValor = null;
		double maiorValor = 0.0;
		for (Vendedor funcionario : funcionarios) {

			double valorRecebido = funcionario.calcularSalario();

			if (valorRecebido > maiorValor) {
				maiorValor = valorRecebido;
				funcionarioMaiorValor = funcionario;
			}
		}
		return funcionarioMaiorValor;
	}

	
	public Vendedor obterFuncionarioMaiorBeneficio(List<Vendedor> funcionarios) {
		Vendedor funcionarioMaiorBeneficio = null;
		double maiorBeneficio = 0.0;
		for (Vendedor funcionario : funcionarios) {
			double beneficio = funcionario.calcularBeneficio();

			if (beneficio > maiorBeneficio) {
				maiorBeneficio = beneficio;
				funcionarioMaiorBeneficio = funcionario;
			}
		}
		return funcionarioMaiorBeneficio;
	}

}
