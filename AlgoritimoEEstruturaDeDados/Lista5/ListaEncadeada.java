package Lista5;

import java.awt.geom.GeneralPath;
import java.util.Iterator;

public class ListaEncadeada <T>{
	
	private NoLista<T> primeiro;
	
	public ListaEncadeada() {
		this.primeiro = null;
	}

	public NoLista<T> getPrimeiro() {
		return this.primeiro;
	}
	
	public void inserir(T info) {
		NoLista<T> novo = new NoLista<T>();
		novo.setInfo(info);
		novo.setProximo(getPrimeiro());
		this.primeiro = novo;
	}
	
	public boolean estaVazia() {
		if (primeiro == null) {
			return true;
		}
		return false;
	}
	
	public NoLista<T> buscar(T info) {
		NoLista<T> p = this.primeiro;
		while(p != null) {
			if (p.getInfo().equals(info)) {
				return p;
			}
			p = p.getProximo();
		}
		return null;
	}
	
	public void retirar(T info) {
		NoLista<T> p = this.primeiro;
		NoLista<T> anterior = null;
		while(p != null) {
			if (p.getInfo().equals(info)) {
				if(p==primeiro) {
					primeiro = p.getProximo();
				} else {
					anterior.setProximo(p.getProximo());
				}
			}
			anterior = p;
			p = p.getProximo();
		}
	}
	
	public int obterComprimento() {
		NoLista<T> p = this.primeiro;
		int var = 0;
		while(p != null) {
			p = p.getProximo();
			var++;
		}
		return var;
	}
	
	public NoLista<T> obterNo(int idx) {
		if(idx <0) {
			throw new IndexOutOfBoundsException();
		}
		NoLista<T> p = this.primeiro;
		while((p != null)&&(idx>0)) {		
			idx--;
			p = p.getProximo();
		}
		if (p ==null) {
			throw new IndexOutOfBoundsException();
		}
		return p;
	}
	
	
	
	
	
	
}
