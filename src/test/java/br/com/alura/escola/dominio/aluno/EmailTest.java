package br.com.alura.escola.dominio.aluno;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import br.com.alura.escola.dominio.aluno.Email;

class EmailTest {

	void naoDeveriaCriarEmailsComEnderecosInvalidos() {
		assertThrows(IllegalArgumentException.class, new Executable() {
			public void execute() throws Throwable {
				new Email(null);
			}
		});
		
		assertThrows(IllegalArgumentException.class, new Executable() {
			public void execute() throws Throwable {
				new Email("");
			}
		});
		
		assertThrows(IllegalArgumentException.class, new Executable() {
			public void execute() throws Throwable {
				new Email("emailinvalido");
			}
		});
	}
}
