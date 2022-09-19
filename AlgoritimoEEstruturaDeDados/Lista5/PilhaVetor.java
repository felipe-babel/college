package Lista5;

import java.util.Arrays;

public class PilhaVetor <T> implements Pilha <T>{
	private T info[];
	private int limite;
	private int tamanho;
	
	public PilhaVetor(int limite) {
		this.tamanho = 0;
		this.limite = limite;
		info = (T[]) new Object[limite];
	}
	
	@Override
	public void push(T info) {
		if (limite == tamanho) {
			throw new PilhaCheiaException();
		}
		
		this.info[tamanho] = info;
		tamanho++;
	}
	
	@Override
	public T pop() {
		T valor;
		valor = peek();
		tamanho--;
		return valor;
	}
	
	@Override
	public T peek() {
		if (estaVazia()) {
			throw new PilhaVaziaException();
		}
		return info[tamanho-1];
	}
	
	@Override
	public boolean estaVazia() {
		if (tamanho ==0) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public void liberar() {
		while(tamanho != 0) {
			pop();
			
		}
	}


	@Override
	public String toString() {
		String str = "";
		
		for (int i = tamanho -1; i >= 0; i--) {
			str += info[i].toString();
			if (i >0) {
				str = str + ",";
			}
			
		}
		return str;
	}
	
	public void concatenar(PilhaVetor<T> p) {
		for(int i=0;i<p.tamanho;i++) {
			this.push(p.info[i]);
		}	
	}	
}
