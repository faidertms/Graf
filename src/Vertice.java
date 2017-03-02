
public class Vertice {
	private String nome;
	Lista<Aresta> adj;

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
		System.out.println(nome + " --> ");
	}

	public boolean equals(Object obj) {
		if (obj instanceof Vertice) {
			return nome.equals(((Vertice) obj).nome);
		}
		return false;
	}
}
