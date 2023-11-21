package repository;

import java.util.List;

import model.Funcionario;


public interface PagamentoRepository {
	
	 double calcularTotalPago(List<Funcionario> funcionarios, String mes, String ano);
	 
     double calcularTotalSalarios(List<Funcionario> funcionarios, String mes,String ano);
     
     double calcularTotalBeneficios(List<Funcionario> funcionarios, String mes,String ano);
     
     public List<Funcionario> obterFuncionariosComBeneficios(List<Funcionario> funcionarios);
     
     Funcionario obterFuncionarioMaiorBeneficio(List<Funcionario> funcionarios, String mes, String ano);
     
     Funcionario obterVendedorMaiorVenda(List<Funcionario> funcionarios, String mes,String ano);
     
     double calcularSalario(Funcionario funcionario, String mes, String ano);
     
}
