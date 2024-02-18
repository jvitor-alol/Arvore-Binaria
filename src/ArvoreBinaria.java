public class ArvoreBinaria {
	private No raiz;
	
	public ArvoreBinaria()
	{
		this.raiz = null;
	}
	
	public No inserirNo(No raiz, long id)
	{
		if (raiz == null) {
			return new No(id, null, null);
		}
		
		if (id < raiz.getId()) {
			raiz.setEsq(inserirNo(raiz.getEsq(), id));
		} else if (id > raiz.getId()) {
			raiz.setDir(inserirNo(raiz.getDir(), id));
		}
		
		return raiz;
	}
	
	public void inserir(long id)
	{
		raiz = inserirNo(raiz, id);
	}
}
