
public class Aresta {
	private Vertice origem;
	private Vertice destino;

	Aresta(Vertice origem, Vertice destino) {
		this.origem = origem;
		this.destino = destino;
	}

	public Vertice getOrigem() {
		return origem;
	}

	public void setOrigem(Vertice origem) {
		this.origem = origem;
	}

	public Vertice getDestino() {
		return destino;
	}
	
	public String destino(){
		return destino.getNome();
	}

	public void setDestino(Vertice destino) {
		this.destino = destino;
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof Aresta) {
			return ((origem == ((Aresta) obj).origem) && (destino == ((Aresta) obj).destino));
		}
		return false;
	}
}
