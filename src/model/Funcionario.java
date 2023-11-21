package model;

import java.io.Serializable;
import java.math.BigDecimal;

public class Funcionario implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String nome;
	
	private String cargo;
	
	private String dataContratacao;
	
	private Double mesesServico = 0.0;
	
	private Double salario = 0.0;
	
	
	
	public Funcionario(Double mesesServico ,String nome, String cargo, String dataContratacao, Double salario) {
		super();
		this.nome = nome;
		this.cargo = cargo;
		this.dataContratacao = dataContratacao;
		this.salario = salario;
		this.mesesServico = mesesServico;
	}
	
	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public Double getMesesServico() {
		return mesesServico;
	}
	
	public void setMesesServico(Double mesesServico) {
		this.mesesServico = mesesServico;
	}

	public Funcionario() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getDataContratacao() {
		return dataContratacao;
	}

	public void setDataContratacao(String dataContratacao) {
		this.dataContratacao = dataContratacao;
	}
	
	
	
}
