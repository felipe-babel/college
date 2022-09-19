package Lista2;

public class ListaEstaticaGenerica <T> {
	private T[] info;
	private int tamanho;
	
	public ListaEstaticaGenerica() {
		this.info = (T[])new Object[10];
		this.tamanho = 0;
	}
	
	private void redimensionar() {
		T[] novo = (T[]) new Object[tamanho+10];
		for (int i = 0; i < info.length; i++) {
			novo[i] = info[i];
		}
		info = novo;
		
	}
	
	public void inserir(T valor) {
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
	
	public int buscar(T valor) {
	for(int i =0;i<info.length;i++) {
		if(info[i].equals(valor)) {
			return i; 
		}
	}
	return -1;
	}
	
	public void retirar(T valor) {
			
		for (int i = 0; i < info.length; i++) {
			if (info[i].equals(valor)) {		
				for (int j = i; j < info.length; j++) {
					if (j == info.length -1) {
						tamanho--;
						//info[tamanho] = null;
					} else {
						info[j]= info[j+1];
					}
				}
				break;
			}
		}
	}
	
	public void liberar() {
		info = (T[])new Object[10];
		tamanho = 0;
	}
	
	public Object obterElemento(int posicao)  {
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
	
	public void inverter() {
		
		int esquerda = 0;
		int direita = tamanho -1;
		
		int qtdTrocas = tamanho /2;
		T backup;
		while(qtdTrocas > 0) {
			backup = info[esquerda];
			info[esquerda] = info[direita];
			info[direita] = backup;
			
			esquerda++;
			direita--;
			qtdTrocas--;
		}
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

