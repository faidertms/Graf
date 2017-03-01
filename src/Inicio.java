
public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lista<No> l = new Lista<No>();
		No<Integer> t = new No<Integer>(1);
		No<Integer> t2 = new No<Integer>(2);
		No<Integer> t3 = new No<Integer>(3);
		l.inserir(t);
		l.inserir(t2);
		l.inserir(t3);
		l.imprimirLista();
		
		System.out.println("Separa");
		
		l.imprimirLista();
		l.imprimirNelementos();
		
		System.out.println(l.obterNo(t2).getnumero().getnumero());
		
		l.remover(t);
		l.remover(t3);
		
		l.encontrarElemento(t2);
		l.imprimirLista();
	}

}
