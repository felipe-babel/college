package Lista4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ListaDuplaTest {
	
	ListaDupla<Integer> lista = new ListaDupla<Integer>();

	@Test
	void test1() { // falta inverter
		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(15);
		lista.inserir(20);
		NoListaDupla<Integer> no;
		no = lista.getPrimeiro();
		assertEquals(20, lista.getPrimeiro().getInfo());
		no = no.getProximo();
		assertEquals(15, no.getInfo().intValue());
		no = no.getProximo();
		assertEquals(10, no.getInfo().intValue());
		no = no.getProximo();
		assertEquals(5, no.getInfo().intValue());
		no = no.getProximo();
		assertEquals(null, no);
	}
	
	@Test
	void test2() { //ok
		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(15);
		lista.inserir(20);
		assertEquals(20, lista.buscar(20).getInfo());
	}
	
	@Test
	void test3() { //ok
		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(15);
		lista.inserir(20);
		assertEquals(10, lista.buscar(10).getInfo());
	}
	
	@Test
	void test4() { // falta inverter
		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(15);
		lista.inserir(20);
		lista.retirar(20);
		NoListaDupla<Integer> no;
		no = lista.getPrimeiro();
		assertEquals(15, lista.getPrimeiro().getInfo());
		no = no.getProximo();
		assertEquals(10, no.getInfo().intValue());
		no = no.getProximo();
		assertEquals(5, no.getInfo().intValue());
		no = no.getProximo();
		assertEquals(null, no);
	}
	
	@Test
	void test5() {// falta inverter
		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(15);
		lista.inserir(20);
		lista.retirar(10);
		NoListaDupla<Integer> no;
		no = lista.getPrimeiro();
		assertEquals(20, lista.getPrimeiro().getInfo());
		no = no.getProximo();
		assertEquals(15, no.getInfo().intValue());
		no = no.getProximo();
		assertEquals(5, no.getInfo().intValue());
		no = no.getProximo();
		assertEquals(null, no);
	}
	
	@Test
	void test6() {// falta inverter
		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(15);
		lista.inserir(20);
		lista.retirar(5);
		NoListaDupla<Integer> no;
		no = lista.getPrimeiro();
		assertEquals(20, lista.getPrimeiro().getInfo());
		no = no.getProximo();
		assertEquals(15, no.getInfo().intValue());
		no = no.getProximo();
		assertEquals(10, no.getInfo().intValue());
		no = no.getProximo();
		assertEquals(null, no);
		lista.exibirOrdemInversa();
		assertEquals("dsa", lista.toString());
		
	}
	
	@Test
	void test7() { // falta referencia anterior e proximo null
		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(15);
		lista.inserir(20);
		NoListaDupla<Integer> no;
		no = lista.getPrimeiro();
		assertEquals(20, lista.getPrimeiro().getInfo());
		no = no.getProximo();
		assertEquals(15, no.getInfo().intValue());
		no = no.getProximo();
		assertEquals(10, no.getInfo().intValue());
		no = no.getProximo();
		assertEquals(5, no.getInfo().intValue());
		no = no.getProximo();
		assertEquals(null, no);
		lista.liberar();
		assertEquals(null, lista.buscar(20).getInfo());
		assertEquals(null, lista.buscar(15).getInfo());
		assertEquals(null, lista.buscar(10).getInfo());
		assertEquals(null, lista.buscar(5).getInfo());
	}

}
