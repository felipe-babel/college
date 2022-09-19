package Lista5;

public interface Pilha <T> {
	public T pop();
	public T peek();
	public boolean estaVazia();
	public void liberar();
	public void push(T info);
}

