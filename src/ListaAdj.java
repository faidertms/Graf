
public class ListaAdj {

	private Lista<Vertice> vertices = new Lista<Vertice>();
	private Lista<Aresta> arestas = new Lista<Aresta>();

	public void inserirVertice(String nome) {
		Vertice v = new Vertice(nome);
		vertices.inserir(v);
		vertices.imprimirLista();
	}

	public void inserirAresta(String origem, String destino) {
		Vertice v = vertices.obter(new Vertice(origem));
		Vertice v1 = vertices.obter(new Vertice(destino));
		if (v != null && v1 != null) {
			Aresta e = new Aresta(v, v1);
			v.inserirAresta(e);
			arestas.inserir(e);
		} else {
			System.out.println("Vertice não existe");
		}
	}

	public void removerAresta(String origem, String destino) {
		Vertice v = vertices.obter(new Vertice(origem));
		Vertice v1 = vertices.obter(new Vertice(destino));
		if (v != null && v1 != null) {
			arestas.remover(new Aresta(v, v1));
			v.removerAresta(new Aresta(v, v1));
		} else {
			System.out.println("Vertice não existe, logo a Aresta não existe");
		}
	}

	public void imprimirGrafo() {
		Vertice aux;
		for (int i = 1; i <= vertices.getNelementos(); i++) {
			aux = vertices.obterPosição(i);
			System.out.println(aux.getNome() + "-->");
			for (int z = 1; i <= vertices.getNelementos(); i++) {
				// System.out.println();
			}
		}
	}

}
