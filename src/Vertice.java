
public class Vertice {
	private String nome;
    private Lista<Aresta> adj;

    Vertice(String nome) {
        this.nome = nome;
        this.adj = new Lista<Aresta>();
    }

    void inserirAresta(Aresta p) {
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
}
