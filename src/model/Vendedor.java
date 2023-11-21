package model;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import enums.Cargo;

public class Vendedor extends Funcionario {
	private double valorVendido;

	public Vendedor(String nome, String dataContratacao, double valorVendido) {
		super(nome, Cargo.VENDEDOR, dataContratacao, valorVendido);
		this.valorVendido = valorVendido;
	}

	@Override
	public double calcularSalario() {
		return getSalario() + calcularBeneficio();
	}

	@Override
	public double calcularBeneficio() {
		int anosServico = calcularAnosServico(getDataContratacao());
		return anosServico * getSalario() + 0.3 * getSalario();
	}

	@Override
	public int calcularAnosServico(String dataContratacao) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate dataContratacaoFormatada = LocalDate.parse(dataContratacao + "/01", formatter);
		LocalDate hoje = LocalDate.now();

		long anos = ChronoUnit.YEARS.between(dataContratacaoFormatada, hoje);
		return (int) anos;
	}

	@Override
	public String formatarSalario() {
		return NumberFormat.getCurrencyInstance(Locale.getDefault()).format(getSalario());
	}

}
