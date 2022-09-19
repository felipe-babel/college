package Lista5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PilhaVetorTest {
	

	@Test
	void test1() {
		PilhaVetor<Integer> pilha = new PilhaVetor<Integer>(8);
		assertEquals(true, pilha.estaVazia());
	}
	
	@Test
	void test2() {
		PilhaVetor<Integer> pilha = new PilhaVetor<Integer>(5);
		pilha.push(10);
		assertEquals(false, pilha.estaVazia());
	}
	
	@Test
	void test3() {
		PilhaVetor<Integer> pilha = new PilhaVetor<Integer>(10);
		pilha.push(10);
		pilha.push(20);
		pilha.push(30);
		assertEquals(30, pilha.pop());
		assertEquals(20, pilha.pop());
		assertEquals(10, pilha.pop());
		assertEquals(true, pilha.estaVazia());
	}
	
	@Test
	void test4() {
		PilhaVetor<Integer> pilha = new PilhaVetor<Integer>(3);
		pilha.push(10);
		pilha.push(20);
		pilha.push(30);
		try {
			pilha.push(40);
			fail();
		} catch (PilhaCheiaException e) {
			// TODO: handle exception
		}
	}
	
	@Test
	void test5() {
		PilhaVetor<Integer> pilha = new PilhaVetor<Integer>(3);
		try {
			pilha.pop();
			fail();
		} catch (PilhaVaziaException e) {
			// TODO: handle exception
		}
	}
	
	@Test
	void test6() {
		PilhaVetor<Integer> pilha = new PilhaVetor<Integer>(5);
		pilha.push(10);
		pilha.push(20);
		pilha.push(30);
		assertEquals(30, pilha.peek());
		assertEquals(30, pilha.pop());
	}
	
	@Test
	void test7() {
		PilhaVetor<Integer> pilha = new PilhaVetor<Integer>(5);
		pilha.push(10);
		pilha.push(20);
		pilha.push(30);
		pilha.liberar();
		assertEquals(true, pilha.estaVazia());
	}
	
	@Test
	void test8() {
		PilhaVetor<Integer> pilha = new PilhaVetor<Integer>(5);
		pilha.push(10);
		pilha.push(20);
		pilha.push(30);
		PilhaVetor<Integer> pilha2 = new PilhaVetor<Integer>(5);
		pilha2.push(40);
		pilha2.push(50);
		pilha.concatenar(pilha2);
		assertEquals("50,40,30,20,10", pilha.toString());
	}

}
