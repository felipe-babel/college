package Lista7;

public class NoArvoreBinaria <T> {
	 private T info;
	 private NoArvoreBinaria<T> direita;
	 private NoArvoreBinaria<T> esquerda;
	 
	 public NoArvoreBinaria(T info) {
		 this.info = info;
		 this.direita = null;
		 this.esquerda = null;
	 }
	 
	 public NoArvoreBinaria(T info, NoArvoreBinaria<T> esq, NoArvoreBinaria<T> dir) {
		 this.info = info;
		 this.esquerda = esq;
		 this.direita = dir;
	 }
	 
	 public void setInfo(T info) {
		 this.info = info;
	 }
	 
	 public T getInfo() {
		 return info;
	 }

	public NoArvoreBinaria<T> getDireita() {
		return direita;
	}
	
	public NoArvoreBinaria<T> getEsquerda() {
		return esquerda;
	}

	public void setDireita(NoArvoreBinaria<T> direita) {
		this.direita = direita;
	}

	public void setEsquerda(NoArvoreBinaria<T> esquerda) {
		this.esquerda = esquerda;
	}
	 
	 
	 
	 
	 
}
