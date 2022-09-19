package Lista5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PilhaListaTest {

	@Test
	void test1() {
		PilhaLista<Integer> pilha = new PilhaLista<Integer>();
		assertEquals(true, pilha.estaVazia());
	}
	
	@Test
	void test2() {
		PilhaLista<Integer> pilha = new PilhaLista<Integer>();
		pilha.push(10);
		assertEquals(false, pilha.estaVazia());
	}
	
	@Test
	void test3() {
		PilhaLista<Integer> pilha = new PilhaLista<Integer>();
		pilha.push(10);
		pilha.push(20);
		pilha.push(30);
		Integer trinta = pilha.pop();
		assertEquals(30, trinta);
		Integer vinte = pilha.pop();
		assertEquals(20, vinte);
		Integer dez = pilha.pop();
		assertEquals(10, dez);
		assertEquals(true, pilha.estaVazia());
	}
	
	@Test
	void test4() {
		PilhaLista<Integer> pilha = new PilhaLista<Integer>();
		pilha.push(10);
		pilha.push(20);
		pilha.push(30);
		assertEquals(30, pilha.peek());
		assertEquals(30, pilha.pop());
	}
	
	@Test
	void test5() {
		PilhaLista<Integer> pilha = new PilhaLista<Integer>();
		pilha.push(10);
		pilha.push(20);
		pilha.push(30);
		pilha.liberar();
		assertEquals(true, pilha.estaVazia());
	}

}
