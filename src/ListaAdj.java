
public class ListaAdj {
	
    private Lista<Vertice> vertices = new Lista<Vertice>();
    private Lista<Aresta> arestas = new Lista<Aresta>();

	 public void adicionarVertice(String nome) {
	        Vertice v = new Vertice(nome);
	        vertices.inserir(v);
	    }

	 public void inserirAresta (Vertice origem, Vertice destino) {
	        Aresta e = new Aresta(origem, destino);
	        origem.inserirAresta(e);
	        arestas.inserir(e);
	    }
	 
	public void imprimirArestas(){
			arestas.imprimirLista();
	}

	   
}
