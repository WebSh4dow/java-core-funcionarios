package model;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import enums.Cargo;

public class Secretario extends Funcionario {
	
    public Secretario(String nome, String dataContratacao, double salario) {
        super(nome, Cargo.SECRETARIO, dataContratacao, salario);
    }

    @Override
    public double calcularSalario() {
    	return getSalario() + calcularBeneficio() + 0.2 * getSalario();
    }

    @Override
    public double calcularBeneficio() {
        int anosServico = calcularAnosServico(getDataContratacao().toString());
        return anosServico * getSalario();
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
