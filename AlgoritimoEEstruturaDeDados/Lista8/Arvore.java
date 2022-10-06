package Lista8;

public class Arvore <T> {
	private NoArvore<T> raiz;
	
	public Arvore() {
		this.raiz = null;
	}

	public NoArvore<T> getRaiz() {
		return raiz;
	}

	public void setRaiz(NoArvore<T> raiz) {
		this.raiz = raiz;
	}

	@Override
	public String toString() {
		return obterRepresentacaoTextual(raiz);
	}
	
	private String obterRepresentacaoTextual(NoArvore<T> no) {
		String s = "<";
		s = s + no.getInfo();
		NoArvore<T> p = no.getPrimeiro();
		while(p!=null) {
			s = s + obterRepresentacaoTextual(p);
			p = p.getProximo();
		}
		s = s + ">";
		return s;
	}
	
	public boolean pertence(T info) {
		if (raiz == null) {
			return false;
		} else {
			return pertence(raiz,info);
		}
	}
	
	private boolean pertence(NoArvore<T> no,T info) {
		if(no.getInfo() == info) {
			return true;
		} else {
			NoArvore<T> p;
			p = no.getPrimeiro();
			while(p!=null) {
				if(pertence(p,info)) {
					return true;
				}
				p = p.getProximo();
			}
			return false;
		}
	}
	
	public int contarNos() {
		if(raiz ==null) {
			return 0;
		} else {
			return contarNos(raiz);
		}
	}
	
	public int contarNos(NoArvore<T> no) {
		int i = 1;
		NoArvore<T> p = no.getPrimeiro();
		while(p!= null) {
			i = i + contarNos(p);
			p = p.getProximo();
		}
		return i;
	}
	
	
}
