
public class Program {

	public static void main(String[] args) {
		ArvoreBinaria arvore1 = new ArvoreBinaria();
		
		arvore1.inserir(555);
		arvore1.inserir(333);
		arvore1.inserir(888);
		arvore1.inserir(111);
		arvore1.inserir(444);
		arvore1.inserir(999);
		arvore1.imprimirEstruturaComRecuo();
		System.out.print("\nNós da esquerda festiva: " + arvore1.esquerdaFestiva());
	}

}
