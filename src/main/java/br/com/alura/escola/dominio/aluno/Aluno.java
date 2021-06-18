package br.com.alura.escola.dominio.aluno;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	private CPF cpf;
	private String nome;
	private Email email;
	private List<Telefone> telefones = new ArrayList<>();
	
	private String senha;
	
	public Aluno(CPF cpf, String nome, Email email) {
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
	}

	public void AdicionarTelefone(String ddd, String numero) {
		this.telefones.add(new Telefone(ddd, numero));
	}

	public String getCpf() {
		return cpf.getNumero();
	}

	public String getNome() {
		return nome;
	}
	
	public String getEmail() {
		return email.getEndereco();
	}
	
//	public static void main(String[] args) {
//		Aluno a = new Aluno(
//		   new CPF("123"),
//		   "Fulano da Silva",
//		   new Email("email")
//		);
//	}

	public List<Telefone> getTelefones() {
		return telefones;
	}
}
