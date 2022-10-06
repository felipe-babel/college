package Lista2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ListaEstaticaGenericaTest {

	@Test
	void test10() {
		ListaEstaticaGenerica<Integer> list = new ListaEstaticaGenerica<Integer>();
		list.inserir(5);
		list.inserir(10);
		list.inserir(15);
		list.inserir(20);
		list.inverter();
		assertEquals("20,15,10,5", list.toString());
	}
	
	@Test
	void test11() {
		ListaEstaticaGenerica<Integer> list = new ListaEstaticaGenerica<Integer>();
		list.inserir(5);
		list.inserir(10);
		list.inserir(15);
		list.inserir(20);
		list.inserir(25);
		list.inverter();
		assertEquals("25,20,15,10,5", list.toString());
	}

}
