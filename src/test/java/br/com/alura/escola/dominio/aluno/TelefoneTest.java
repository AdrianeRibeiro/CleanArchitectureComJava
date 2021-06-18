package br.com.alura.escola.dominio.aluno;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import br.com.alura.escola.dominio.aluno.Telefone;

class TelefoneTest {

	void naoDeveriaCriarTelefoneComDDDsInvalidos() {
		assertThrows(IllegalArgumentException.class, new Executable() {
			public void execute() throws Throwable {
				new Telefone(null, "123456789");
			}
		});
		
		assertThrows(IllegalArgumentException.class, new Executable() {
			public void execute() throws Throwable {
				new Telefone("", "123456789");
			}
		});
		
		assertThrows(IllegalArgumentException.class, new Executable() {
			public void execute() throws Throwable {
				new Telefone("1", "123456789");
			}
		});
	}
	
	void naoDeveriaCriarTelefoneComNumerosInvalidos() {
		assertThrows(IllegalArgumentException.class, new Executable() {
			public void execute() throws Throwable {
				new Telefone("11", null);
			}
		});
		
		assertThrows(IllegalArgumentException.class, new Executable() {
			public void execute() throws Throwable {
				new Telefone("11", "");
			}
		});
		
		assertThrows(IllegalArgumentException.class, new Executable() {
			public void execute() throws Throwable {
				new Telefone("111", "123");
			}
		});
	}
	
	void deveriaPermitirCriarTelefoneComDDDENumerosValidos() {
		String ddd = "11";
		String numero = "123456789";
		Telefone telefone = new Telefone(ddd, numero);
		assertEquals(ddd, telefone.getDdd());
		assertEquals(numero, telefone.getNumero());
	}
}
