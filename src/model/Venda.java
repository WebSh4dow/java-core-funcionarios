package model;

public class Venda {
	private Vendedor vendedor;
	private double valor = 0.0;

	public Venda(Vendedor vendedor, double valor) {
		this.setVendedor(vendedor);
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
}