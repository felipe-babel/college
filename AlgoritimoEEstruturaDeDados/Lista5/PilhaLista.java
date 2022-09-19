package Lista5;

public class PilhaLista <T> implements Pilha <T> {
	private ListaEncadeada<T> lista = new ListaEncadeada<>();
	
	@Override
	public void push(T info) {
		lista.inserir(info);
	}
	
	@Override
	public T pop() {
		T valor;
		valor = peek();
		lista.retirar(valor);
		return valor;
	}
	
	@Override
	public T peek() {
		if (estaVazia()) {
			throw new PilhaVaziaException();
		}
		return lista.getPrimeiro().getInfo();
	}
	
	@Override
	public boolean estaVazia() {
		return lista.estaVazia();
	}
	
	@Override
	public void liberar() {
		try {
			while(true) {
				pop();
			}
		} catch (PilhaVaziaException e) {
			// TODO: handle exception
		}
	}
	
	@Override
	public String toString() {
		return lista.toString();
	}
	
}
