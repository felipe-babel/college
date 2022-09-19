package Lista3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ListaEncadeadaTest {
	ListaEncadeada<Integer> lista= new ListaEncadeada<Integer>();
	@Test
	void test1() {
		assertEquals(true, lista.estaVazia());
	}
	@Test
	void test2() {
		lista.inserir(5);
		assertEquals(false, lista.estaVazia());
	}

	@Test
	void test3() {
		lista.inserir(5);
		NoLista<Integer> no = lista.getPrimeiro();
		assertEquals(5, no.getInfo().intValue());
		assertEquals(null, no.getProximo());
	}

	@Test
	void test4() {
		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(15);
		NoLista<Integer> no;
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
	void test5() {
		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(15);
		lista.inserir(20);
		assertEquals(20, lista.buscar(20).getInfo());
	}

	@Test
	void test6() {
		
		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(15);
		lista.inserir(20);
		assertEquals(15, lista.buscar(15).getInfo());
	}

	@Test
	void test7() {
		
		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(15);
		lista.inserir(20);
		assertEquals(null, lista.buscar(50));
	}

	@Test
	void test8() {
		
		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(15);
		lista.inserir(20);
		lista.retirar(20);
		NoLista<Integer> no;
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
	void test9() {
		
		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(15);
		lista.inserir(20);
		lista.retirar(15);
		NoLista<Integer> no;
		no = lista.getPrimeiro();
		assertEquals(20, lista.getPrimeiro().getInfo());
		no = no.getProximo();
		assertEquals(10, no.getInfo().intValue());
		no = no.getProximo();
		assertEquals(5, no.getInfo().intValue());
		no = no.getProximo();
		assertEquals(null, no);
	}

	@Test
	void test10() {
		
		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(15);
		lista.inserir(20);
		assertEquals(20, lista.obterNo(0).getInfo());
	}

	@Test
	void test11() {
		
		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(15);
		lista.inserir(20);
		assertEquals(5, lista.obterNo(3).getInfo());
	}

	@Test
	void test12() {
		
		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(15);
		lista.inserir(20);
		lista.retirar(15);
		try {
			lista.obterNo(10).getInfo();
			fail();
		} catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
		}
	}

	@Test
	void test13() {
		
		assertEquals(0, lista.obterComprimento());
	}

	@Test
	void test14() {
	
		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(15);
		lista.inserir(20);
		
		assertEquals(4, lista.obterComprimento());
	}



}
