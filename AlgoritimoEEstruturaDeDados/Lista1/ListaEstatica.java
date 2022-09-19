package Lista1;

public class ListaEstatica {
	private int[] info;
	private int tamanho;
	
	public ListaEstatica() {
		this.info = new int[10];
		this.tamanho = 0;
	}
	
	private void redimensionar() {
		int[] novo = new int[tamanho+10];
		for (int i = 0; i < info.length; i++) {
			novo[i] = info[i];
		}
		info = novo;
		
	}
	
	public void inserir(int valor) {
		if(tamanho == info.length) {
			redimensionar();
		}
		info[tamanho] = valor;
		tamanho++;
	}
	
	public void exibir() {
		for(int i =0;i<info.length;i++) {
			System.out.println(info[i]);
		}
	}
	
	public int buscar(int valor) {
	for(int i =0;i<info.length;i++) {
		if(info[i]==valor) {
			return i; 
		}
	}
	return -1;
	}
	
	public void retirar(int valor) {
		int var;
				
		for (int i = 0; i < info.length; i++) {
			if (info[i]==valor) {		
				for (int j = i; j < info.length; j++) {
					if (j == info.length -1) {
						tamanho--;
					} else {
						info[j]= info[j+1];
					}
				}
				break;
			}
		}
	}
	
	public void liberar() {
		info = new int[10];
		tamanho = 0;
	}
	
	public int obterElemento(int posicao)  {
		if (posicao > tamanho || posicao < 0) {
			throw new IndexOutOfBoundsException();
		}
		return info[posicao];
	}
	
	public Boolean estaVazia() {
		if (tamanho == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public int getTamanho() {
		return this.tamanho;
	}
	
	@Override
	public String toString() {
		String str = "";
		for (int i = 0; i < tamanho; i++) {
			if(i == tamanho-1) {
				str+= info[i];
			} else {
				str+= info[i] + ",";
			}
			
		}
		return str;
	}
	
}
