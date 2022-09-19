package Lista6;

import java.util.Iterator;

import Lista5.PilhaVaziaException;

public class FilaVetor <T> implements Fila <T> {
	private T info[];
	private int limite;
	private int tamanho;
	private int inicio;
	
	public FilaVetor(int limite) {
		this.limite = limite;
		this.inicio = 0;
		this.tamanho = 0;
		this.info = (T[]) new Object[limite];
	}
	
	@Override
	public void inserir(T valor) {
		if(tamanho == limite) {
			throw new FilaCheiaException();
		}
		int posicaoInserir;
		posicaoInserir = (inicio + tamanho) % limite;
		info[posicaoInserir] = valor;
		tamanho++;
	}
	
	@Override
	public boolean estaVazia() {
		if(tamanho == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public T peek() {
		if(estaVazia()) {
			throw new FilaVaziaException();
		}
		return info[inicio];
	}
	
	@Override
	public T retirar() {
		if(estaVazia()) {
			throw new FilaVaziaException();
		}
		T valor = peek();
		inicio = (inicio + 1) % limite;
		tamanho--;
		return valor;
	}
	
	@Override
	public void liberar() {
		while(tamanho != 0) {
			retirar();
		}
	}
	
	public FilaVetor<T> criarFilaConcatenada(FilaVetor<T> f2) {
		FilaVetor<T> novo = new FilaVetor<T>(this.limite + f2.limite);
		for (int i = 0; i < this.tamanho;i++) {
			novo.inserir(this.info[i]);
		}
		for (int i = 0; i < f2.tamanho;i++) {
			novo.inserir(f2.info[i]);
		}
		return novo;
	}
	
	public String toString() {
		String str = "";
		
		for (int i =0; i < tamanho; i++) {
			str += info[i].toString();
			if (i <tamanho -1) {
				str = str + ",";
			}
			
		}
		return str;
	}

	public int getLimite() {
		return limite;
	}
	
	
}
