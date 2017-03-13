public class MatrizAdj {
	private int matrizAdj[][];
	private int numVertices;

	public MatrizAdj(int numVertices) {
		super();
		this.matrizAdj = new int[numVertices][numVertices];
		this.numVertices = numVertices;
		for (int i = 0; i < this.numVertices; i++) {
			for (int j = 0; j < this.numVertices; j++) {
				this.matrizAdj[i][j] = -1;
			}
		}
	}

	public void insereAresta(int p, int p2, int peso) {
		if (peso > -1) {
			this.matrizAdj[p][p2] = peso;
		} else {
			System.out.println("peso incorreto");
		}
	}

	public void removerAresta(int p, int p2) {
		this.matrizAdj[p][p2] = -1;
	}

	public int getAresta(int p, int p2) {
		return this.matrizAdj[p][p2];

	}

	public void imprimirGrafo() {
		String temp;
		System.out.println("Legenda: Não existe = -1 | Qualquer outro valor é o peso da Aresta");
		for (int i = 0; i < this.numVertices; i++) {
			temp = "Vertice " + i + ": ";
			for (int j = 0; j < this.numVertices; j++) {
				temp += this.matrizAdj[i][j] + " , ";
			}
			System.out.println(temp);
			temp = "";
		}
	}

}
