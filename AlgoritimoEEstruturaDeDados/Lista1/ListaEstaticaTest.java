package Lista1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ListaEstaticaTest {

	@Test
	void test1() {
		ListaEstatica lista = new ListaEstatica();
		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(15);
		lista.inserir(20);
		assertEquals("5,10,15,20", lista.toString());
	}

	@Test
	void test2() {
		ListaEstatica lista = new ListaEstatica();
		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(15);
		lista.inserir(20);
		assertEquals(4, lista.getTamanho());
	}
	
	@Test
	void test3() {
		ListaEstatica lista = new ListaEstatica();
		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(15);
		lista.inserir(20);
		assertEquals(2, lista.buscar(15));
	}
	
	@Test
	void test4() {
		ListaEstatica lista = new ListaEstatica();
		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(15);
		lista.inserir(20);
		assertEquals(-1, lista.buscar(30));
	}
	
	@Test
	void test5() {
		ListaEstatica lista = new ListaEstatica();
		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(15);
		lista.inserir(20);
		lista.retirar(10);
		assertEquals(3, lista.getTamanho());
		assertEquals("5,15,20", lista.toString());
	}
	@Test
	void test6() {
		ListaEstatica lista = new ListaEstatica();
		for (int i = 1; i <=15; i++) {
			lista.inserir(i);
		}
		assertEquals("1,2,3,4,5,6,7,8,9,10,11,12,13,14,15", lista.toString());
		assertEquals(15, lista.getTamanho());
	}
	@Test
	void test7() {
		ListaEstatica lista = new ListaEstatica();
		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(15);
		lista.inserir(20);
		assertEquals(20, lista.obterElemento(3));
	}
	@Test
	void test8() {
		ListaEstatica lista = new ListaEstatica();
		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(15);
		lista.inserir(20);
		
		try {
			lista.obterElemento(5);
			fail();
		} catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
		}
	}
	@Test
	void test9() {
		ListaEstatica lista = new ListaEstatica();
		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(15);
		lista.inserir(20);
		lista.liberar();
		assertEquals(true, lista.estaVazia());
	}	
}
