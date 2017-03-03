
public class Vertice {
	private String nome;
	private Lista<Aresta> adj;

	Vertice(String nome) {
		this.nome = nome;
		this.adj = new Lista<Aresta>();
	}

	public void inserirAresta(Aresta p) {
		adj.inserir(p);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Lista<Aresta> getAdj() {
		return adj;
	}

	public void setAdj(Lista<Aresta> adj) {
		this.adj = adj;
	}

	public void removerAresta(Aresta p) {
		this.adj.remover(p);
	}

	// remover aresta recebe aresta
	public void imprimirArestas() {
		String aux = nome + " --> ";
		for (int z = 1; z <= adj.getNelementos(); z++) {
			aux = aux + adj.obterPosição(z).getDestino().getNome() + " , ";
		}
		System.out.println(aux);
	}

	public boolean equals(Object obj) {
		if (obj instanceof Vertice) {
			return nome.equals(((Vertice) obj).nome);
		}
		return false;
	}
}
