package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
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
        int anosServico = calcularAnosServico(getDataContratacao());
        return anosServico * getSalario();
    }

    @Override
    public int calcularAnosServico(String dataContratacao) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/yyyy");
        LocalDate dataContratacaoFormatada = LocalDate.parse("01/" + dataContratacao, formatter);

        LocalDate hoje = LocalDate.now();

        long anos = ChronoUnit.YEARS.between(dataContratacaoFormatada, hoje);
        return (int) anos;
    }
}
