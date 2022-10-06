package Lista8;

public class NoArvore <T>{
	private T info;
	private NoArvore<T> primeiro;
	private NoArvore<T> proximo;
	
	public NoArvore(T info) {
		this.info = info;
		this.primeiro = null;
		this.proximo = null;
	}
	
	public T getInfo() {
		return info;
	}

	public void inserirFilho(NoArvore<T> sa) {
		sa.proximo = primeiro;
		this.primeiro = sa;
	}
	
	public NoArvore<T> getPrimeiro() {
		return this.primeiro;
	}
	
	public NoArvore<T> getProximo() {
		return this.proximo;
	}
}
