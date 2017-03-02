
public class ListaAdj {

	private Lista<Vertice> vertices = new Lista<Vertice>();
	private Lista<Aresta> arestas = new Lista<Aresta>();

	public void inserirVertice(String nome) {
		Vertice v = new Vertice(nome);
		vertices.inserir(v);
	}

	public void inserirAresta(Vertice origem, Vertice destino) {
		Aresta e = new Aresta(origem, destino);
		origem.inserirAresta(e);
		arestas.inserir(e);
	}

	public void removerAresta(Vertice origem) {
		// origem.removerAresta(p);
	}

	public void imprimirArestas() {
		for (int i = 0; i < vertices.imprimirNelementos(); i++) {
			// System.out.println(models.get(i).getName());
		}
	}
	
}
