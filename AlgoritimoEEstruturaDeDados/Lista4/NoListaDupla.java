package Lista4;

public class NoListaDupla <GenericClass>{
	GenericClass info;
	NoListaDupla<GenericClass> proximo;
	NoListaDupla<GenericClass> anterior;
	
	public GenericClass getInfo() {
		return info;
	}
	public void setInfo(GenericClass info) {
		this.info = info;
	}
	public NoListaDupla<GenericClass> getProximo() {
		return proximo;
	}
	public void setProximo(NoListaDupla<GenericClass> proximo) {
		this.proximo = proximo;
	}
	public NoListaDupla<GenericClass> getAnterior() {
		return anterior;
	}
	public void setAnterior(NoListaDupla<GenericClass> anterior) {
		this.anterior = anterior;
	}
	
	
}
