
public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lista<Double> l = new Lista<Double>();
		No<Double> n = new No<Double>();
		No<Double> n1 = new No<Double>();
		No<Double> n2 = new No<Double>();
		n.setnumero(0.10);
		n1.setnumero(1.3);
		n2.setnumero(1.4);
		l.inserir(n);
		l.inserir(n1);
		l.imprimirLista();
		System.out.println("Separa");
		l.inserir(n2);
		l.imprimirLista();
		l.imprimirNelementos();
		
		System.out.println(l.obterNo(1.4));
		l.remover(1.0);
		l.remover(3.0);
		l.encontrarElemento(1.4);
		l.imprimirLista();
	}

}
