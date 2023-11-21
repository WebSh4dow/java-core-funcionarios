import java.util.ArrayList;
import java.util.List;
import implementation.FinanceiroSecretario;
import implementation.FinanceiroVendedor;
import model.Gerente;
import model.Secretario;
import model.Venda;
import model.Vendedor;

public class Runner {

	public static void main(String[] args) {

		// criando os objetos secretarios
		Secretario secretario1 = new Secretario("Jorge Carvalho", "2018/01", 7000);
		Secretario secretario2 = new Secretario("Maria Souza", "2015/01", 7000);

		// criando os objetos vendedores
		Vendedor vendedor1 = new Vendedor("Ana Silva", "12/2021", 1200);
		Vendedor vendedor2 = new Vendedor("João Mendes", "12/2021", 1200);

		// criando os objetos gerentes
		Gerente gerente1 = new Gerente("Juliana Alves", "07/2017", 2000);
		Gerente gerente2 = new Gerente("Bento Albino", "03/2014", 2000);

		// criando os objetos de teste usando secreteario e vendedor
		FinanceiroSecretario financeiroSecretario = new FinanceiroSecretario();
		FinanceiroVendedor financeiroVendedor = new FinanceiroVendedor();

		// Criar vendas
		Venda vendaAnaSilva = new Venda(vendedor1);
		Venda vendaJoaoMendes = new Venda(vendedor2);

		// Adicionar vendas aos vendedores
		vendaAnaSilva.adicionarVenda(1200);
		vendaAnaSilva.adicionarVenda(1200);
		vendaAnaSilva.adicionarVenda(1200);

		// Adicionar vendas aos vendedores
		vendaJoaoMendes.adicionarVenda(200);
		vendaJoaoMendes.adicionarVenda(200);
		vendaJoaoMendes.adicionarVenda(200);
		vendaJoaoMendes.adicionarVenda(200);

		// Criar lista de funcionários Secretarios
		List<Secretario> funcionariosSecretarios = new ArrayList<Secretario>();
		funcionariosSecretarios.add(secretario1);

		// Criar lista de funcionários Vendedores
		List<Vendedor> funcionariosVendedores = new ArrayList<Vendedor>();
		funcionariosVendedores.add(vendedor1);
		funcionariosVendedores.add(vendedor2);

		// Criar lista de funcionários Gerentes
		List<Gerente> funcionariosGerentes = new ArrayList<Gerente>();

		funcionariosGerentes.add(gerente1);
		funcionariosGerentes.add(gerente2);

		// Criar lista de vendas
		List<Venda> vendas = new ArrayList<Venda>();
		vendas.add(vendaAnaSilva);
		vendas.add(vendaJoaoMendes);

	    // Testar os métodos
	    System.out.println("Total Pago (Salário + Benefício): " + financeiroSecretario.calcularTotalSalarios(funcionariosSecretarios));
	        
	    System.out.println("Total Salários: " + financeiroSecretario.calcularTotalSalarios(funcionariosSecretarios));
	        
	    System.out.println("Total Benefícios: " + financeiroSecretario.calcularTotalBeneficios(funcionariosSecretarios));
	        
	    System.out.println("Funcionário com Maior Valor: " + financeiroSecretario.obterFuncionarioMaiorValor(funcionariosSecretarios));
	        
	    System.out.println("Funcionário com Maior Benefício: " + financeiroSecretario.obterFuncionarioMaiorBeneficio(funcionariosSecretarios));
	        
	    System.out.println("Vendedor com Maior Venda: " + financeiroVendedor.obterVendedorMaiorVenda(funcionariosVendedores, vendas));
	    
	}
}
