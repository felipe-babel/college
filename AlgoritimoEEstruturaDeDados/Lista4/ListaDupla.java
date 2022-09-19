package Lista4;

public class ListaDupla <GenericClass>{
	
	NoListaDupla<GenericClass> primeiro;
	
	public ListaDupla() {
		primeiro = null;
	}
	
	public NoListaDupla<GenericClass> getPrimeiro() {
		return primeiro;
	}
	
	public void inserir(GenericClass valor) {
		NoListaDupla<GenericClass> novo = new NoListaDupla<GenericClass>();
		novo.setInfo(valor);
		novo.setAnterior(null);
		novo.setProximo(primeiro);
		if(primeiro != null ) {
			primeiro.anterior = novo;
		}
		primeiro = novo;
	}
	
	public NoListaDupla<GenericClass> buscar(GenericClass valor) {
		NoListaDupla<GenericClass> p = primeiro;
		while(p !=null) {
			if (p.getInfo().equals(valor)) {
				return p;
			}
			p = p.getProximo();
			
		}
		return null;
		
	}
	
	public void retirar(GenericClass valor) {
		NoListaDupla<GenericClass> p = buscar(valor);
		if (p != null) {
			
			if (primeiro == p) {
				primeiro = p.getProximo();
			} else {
				p.getAnterior().setProximo(p.getProximo());
			}
			
			if (p.getProximo() != null) {
				p.getProximo().setAnterior(p.getAnterior());
			}
			
			
		}
	}
	
	public void exibirOrdemInversa() {
		NoListaDupla<GenericClass> p = primeiro;
		while(p !=null) {
			if (p.getProximo() ==null) {
				break;
			}
		}
		primeiro = p;
		while(p!= null) {
			if (primeiro != p && p.getAnterior() !=null) {
				p.setProximo(p.getAnterior());
				p.setAnterior(p.getProximo());
			} 
			
			if (primeiro != p) {
				p.setAnterior(p.getProximo());
			}
			
			if (p.getAnterior() !=null) {
				p.setProximo(p.getAnterior());
			}
		}

	}
	
	public void liberar() {
		NoListaDupla<GenericClass> proximo = primeiro;
		NoListaDupla<GenericClass> anterior = null;
		
		while(proximo !=null) {
			if(proximo.getProximo() != null && !proximo.equals(primeiro)) {
				anterior = proximo.getAnterior();
				anterior.setAnterior(null);
				anterior.setProximo(null);
				proximo = proximo.getProximo();
			} else {
				anterior = proximo.getAnterior();
				anterior.setProximo(null);
				anterior.setAnterior(null);
			}
			
		}
		proximo = anterior;
	}

	@Override
	public String toString() {
		NoListaDupla<GenericClass> p = primeiro;
		String str = "";
		while(p !=null) {
			if (p.getProximo() != null) {
				str+= p.getInfo().toString() + ",";
			} else {
				str+= p.getInfo().toString();	
			}
			p = p.getProximo();
		}
		return str;
	}
	
	

}
