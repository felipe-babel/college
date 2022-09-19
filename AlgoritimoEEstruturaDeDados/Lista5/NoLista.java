package Lista5;

public class NoLista<GenericClass> {
		private GenericClass info;
		private NoLista<GenericClass> proximo;
		
		public GenericClass getInfo() {
			return info;
		}
		public void setInfo(GenericClass info) {
			this.info = info;
		}
		public NoLista<GenericClass> getProximo() {
			return proximo;
		}
		public void setProximo(NoLista<GenericClass> proximo) {
			this.proximo = proximo;
		}
		
		

}
