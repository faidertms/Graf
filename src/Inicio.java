
public class Inicio {

	public static void main(String[] args) {
		
		/*ListaAdj graf = new ListaAdj();
		graf.inserirVertice("Thiago");
		graf.inserirVertice("Sales");
		graf.imprimirArestas();*/
		
		// Teste
		Lista<No> l = new Lista<No>();
		No<Integer> t = new No<Integer>(1);
		No<Integer> t2 = new No<Integer>(2);
		No<Integer> t3 = new No<Integer>(3);
		No<Integer> t5 = new No<Integer>(3);
		l.inserir(t);
		l.inserir(t2);
		l.inserir(t3);
		l.imprimirLista();
		System.out.println("Separa");
		
		l.imprimirLista();
		l.imprimirNelementos();
		System.out.println("Separa");
		System.out.println(t5.equals(t3));
		System.out.println("Separa");
		l.remover(t);
		l.remover(t5);
		
		l.encontrarElemento(t3);
		l.imprimirLista();
	}

}
