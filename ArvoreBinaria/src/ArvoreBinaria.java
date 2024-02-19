public class ArvoreBinaria {
	private No raiz;
	
	public ArvoreBinaria()
	{
		this.raiz = null;
	}
	
	public void inserir(long id)
	{
		raiz = inserirNo(raiz, id);
	}
	
	private No inserirNo(No raiz, long id)
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
    
    public long esquerdaFestiva() {
    	return esquerdaFestivaRecursivo(raiz);
    }
        
    private long esquerdaFestivaRecursivo(No no) {
    	if (no == null)
            return 0;

        int contador = 0;
        if (no.getEsq() != null)
            contador = 1;

        contador += esquerdaFestivaRecursivo(no.getEsq());
        contador += esquerdaFestivaRecursivo(no.getDir());

        return contador;
    }

    public void imprimirEstruturaComRecuo() {
    	System.out.println("Árvore Binária:");
        imprimirEstruturaRecursivo(raiz, 0);
    }
    
    private void imprimirEstruturaRecursivo(No no, int nivel) {        
        for (int i = 0; i < nivel; i++) {
            System.out.print("  ");
        }
        if (no != null) {
            System.out.println(no.getId());
        } else {
        	System.out.println("-");
        	return;
        }
        
        imprimirEstruturaRecursivo(no.getEsq(), nivel + 1);
        imprimirEstruturaRecursivo(no.getDir(), nivel + 1);
    }
}

