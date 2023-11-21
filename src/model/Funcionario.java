package model;

import enums.Cargo;
import repository.FuncionarioRepository;

abstract class Funcionario implements FuncionarioRepository {

	private String nome;
	private Cargo cargo;
	private String dataContratacao;
	private double salario = 0.0;

	public Funcionario(String nome, Cargo cargo, String dataContratacao, double salario) {
		this.nome = nome;
		this.cargo = cargo;
		this.setSalario(salario);
		this.setDataContratacao(dataContratacao);
	}

	public abstract double calcularSalario();

	public abstract double calcularBeneficio();

	public abstract int calcularAnosServico(String dataContratacao);

	public abstract String formatarSalario();

	public String getNome() {
		return nome;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public String getDataContratacao() {
		return dataContratacao;
	}

	public void setDataContratacao(String dataContratacao) {
		this.dataContratacao = dataContratacao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Funcionario{" + "nome='" + nome + '\'' + ", dataContratacao='" + dataContratacao + '\'' + ", salario="
				+ salario + '}';
	}

}
