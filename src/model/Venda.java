package model;

import java.util.ArrayList;
import java.util.List;

public class Venda {

	private Vendedor vendedor;
	private List<Double> vendas;

	public Venda(Vendedor vendedor) {
		this.vendedor = vendedor;
		this.vendas = new ArrayList<>();
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public List<Double> getVendas() {
		return vendas;
	}

	public boolean removerVenda(double valorVenda) {
		return vendas.remove(valorVenda);
	}

	public boolean adicionarVenda(double valorVenda) {
		return vendas.add(valorVenda);
	}

	public double calcularTotalVendas() {
		return vendas.stream().mapToDouble(Double::doubleValue).sum();
	}
}