package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import enums.Cargo;

public class Vendedor extends Funcionario {
    private double valorVendido;

    public Vendedor(String nome, String dataContratacao, double valorVendido) {
        super(nome, Cargo.VENDEDOR, dataContratacao,valorVendido);
        this.valorVendido = valorVendido;
    }

    @Override
    public double calcularSalario() {
        return getSalario() + calcularBeneficio();
    }

    @Override
    public double calcularBeneficio() {
        int anosServico = calcularAnosServico(getDataContratacao());
        return anosServico * getSalario() + 0.3 * valorVendido;
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
