package Lista3;

import java.awt.geom.GeneralPath;
import java.util.Iterator;

public class ListaEncadeada <GenericClass>{
	
	private NoLista<GenericClass> primeiro;
	
	public ListaEncadeada() {
		this.primeiro = null;
	}

	public NoLista getPrimeiro() {
		return this.primeiro;
	}
	
	public void inserir(GenericClass info) {
		NoLista<GenericClass> novo = new NoLista<GenericClass>();
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
	
	public NoLista<GenericClass> buscar(GenericClass info) {
		NoLista<GenericClass> p = this.primeiro;
		while(p != null) {
			if (p.getInfo().equals(info)) {
				return p;
			}
			p = p.getProximo();
		}
		return null;
	}
	
	public void retirar(GenericClass info) {
		NoLista<GenericClass> p = this.primeiro;
		NoLista<GenericClass> anterior = null;
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
		NoLista<GenericClass> p = this.primeiro;
		int var = 0;
		while(p != null) {
			p = p.getProximo();
			var++;
		}
		return var;
	}
	
	public NoLista<GenericClass> obterNo(int idx) {
		if(idx <0) {
			throw new IndexOutOfBoundsException();
		}
		NoLista<GenericClass> p = this.primeiro;
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
