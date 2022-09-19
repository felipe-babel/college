package Lista6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Lista5.PilhaCheiaException;

class FilaVetorTest {

	@Test
	void test1() {
		FilaVetor<Integer> fila = new FilaVetor<Integer>(5);
		assertEquals(true, fila.estaVazia());
	}
	
	@Test
	void test2() {
		FilaVetor<Integer> fila = new FilaVetor<Integer>(5);
		fila.inserir(10);
		assertEquals(false, fila.estaVazia());
	}
	
	@Test
	void test3() {
		FilaVetor<Integer> fila = new FilaVetor<Integer>(10);
		fila.inserir(10);
		fila.inserir(20);
		fila.inserir(30);
		assertEquals(10, fila.retirar());
		assertEquals(20, fila.retirar());
		assertEquals(30, fila.retirar());
		assertEquals(true, fila.estaVazia());
	}
	
	@Test
	void test4() {
		FilaVetor<Integer> fila = new FilaVetor<Integer>(3);
		fila.inserir(10);
		fila.inserir(20);
		fila.inserir(30);
		try {
			fila.inserir(40);
			fail();
		} catch (FilaCheiaException e) {
			// TODO: handle exception
		}
		
	}
	
	@Test
	void test5() {
		FilaVetor<Integer> fila = new FilaVetor<Integer>(5);
		try {
			fila.retirar();
			fail();
		} catch (FilaVaziaException e) {
			// TODO: handle exception
		}
	}
	
	@Test
	void test6() {
		FilaVetor<Integer> fila = new FilaVetor<Integer>(5);
		fila.inserir(10);
		fila.inserir(20);
		fila.inserir(30);
		assertEquals(10, fila.peek());
		assertEquals(10, fila.retirar());
	}
	
	@Test
	void test7() {
		FilaVetor<Integer> fila = new FilaVetor<Integer>(5);
		fila.inserir(10);
		fila.inserir(20);
		fila.inserir(30);
		fila.liberar();
		assertEquals(true, fila.estaVazia());
	}
	
	@Test
	void test8() {
		FilaVetor<Integer> fila = new FilaVetor<Integer>(5);
		fila.inserir(10);
		fila.inserir(20);
		fila.inserir(30);
		FilaVetor<Integer> fila2 = new FilaVetor<Integer>(3);
		fila2.inserir(40);
		fila2.inserir(50);
		FilaVetor<Integer> f3 = fila.criarFilaConcatenada(fila2);
		assertEquals("10,20,30,40,50", f3.toString());
		assertEquals("10,20,30", fila.toString());
		assertEquals("40,50", fila2.toString());
		assertEquals(8, f3.getLimite());
	}

}
