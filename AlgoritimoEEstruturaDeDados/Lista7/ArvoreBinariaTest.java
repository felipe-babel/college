package Lista7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArvoreBinariaTest {

	@Test
	void test1() {
		ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();
		assertEquals(true, arvore.estaVazia());
	}
	
	@Test
	void test2() {
		ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();
		NoArvoreBinaria<Integer> no = new NoArvoreBinaria<>(5);
		arvore.setRaiz(no);
		assertEquals(false, arvore.estaVazia());
	}
	
	@Test
	void test3() {
		ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();
		
		NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<>(4);
		NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<>(2,null,no4);
		
		NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<>(5);
		NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria<>(6);
		NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<>(3,no5,no6);
		
		NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria<>(1,no2,no3);
		
		arvore.setRaiz(no1);
		assertEquals("<1<2<><4<><>>><3<5<><>><6<><>>>>", arvore.toString());
	}
	
	@Test
	void test4() {
		ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();
		
		NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<>(4);
		NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<>(2,null,no4);
		
		NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<>(5);
		NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria<>(6);
		NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<>(3,no5,no6);
		
		NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria<>(1,no2,no3);
		
		arvore.setRaiz(no1);
		assertEquals(true, arvore.pertence(2));
	}
	
	@Test
	void test5() {
		ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();
		
		NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<>(4);
		NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<>(2,null,no4);
		
		NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<>(5);
		NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria<>(6);
		NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<>(3,no5,no6);
		
		NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria<>(1,no2,no3);
		
		arvore.setRaiz(no1);
		assertEquals(true, arvore.pertence(3));
	}
	
	@Test
	void test6() {
		ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();
		
		NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<>(4);
		NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<>(2,null,no4);
		
		NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<>(5);
		NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria<>(6);
		NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<>(3,no5,no6);
		
		NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria<>(1,no2,no3);
		
		arvore.setRaiz(no1);
		assertEquals(true, arvore.pertence(6));
	}
	
	@Test
	void test7() {
		ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();
		
		NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<>(4);
		NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<>(2,null,no4);
		
		NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<>(5);
		NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria<>(6);
		NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<>(3,no5,no6);
		
		NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria<>(1,no2,no3);
		
		arvore.setRaiz(no1);
		assertEquals(false, arvore.pertence(10));
	}
	
	@Test
	void test8() {
ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();
		
		NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<>(4);
		NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<>(2,null,no4);
		
		NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<>(5);
		NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria<>(6);
		NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<>(3,no5,no6);
		
		NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria<>(1,no2,no3);
		
		arvore.setRaiz(no1);
		assertEquals(6, arvore.contarNos());
	}

}
