
public class Lista<T> {
	private No<T> inicial = null;
	private int nelementos = 0;
	public void inserir(No<T> p){
		if(inicial == null){
			inicial = p;
			nelementos++;
		}else{
			No<T> aux = inicial;
			while(aux != null){
				if(aux.getproximo() == null){
					aux.setproximo(p);
					nelementos++;
					break;
				}else{
					aux = aux.getproximo();
				}
			}
		}
	}
	public void imprimirLista(){
		No<T> aux = inicial;
		while(aux!=null){
			System.out.println("Numero:" + aux.getnumero());
			aux = aux.getproximo();
		}
	}
	
	public void encontrarElemento(T p){
		No<T> aux = inicial;
		while(aux!=null){
			if(aux.getnumero() == p){
				System.out.println("Elemento Encontrado");
				break;
			}
			if(aux.getproximo() == null){
				System.out.println("Elemento N�o Encontrado");
				break;
			}
			aux = aux.getproximo();
		}
	}
	
	public void imprimirNelementos(){
		System.out.println(nelementos);
	}
	public No<T> obterNo(T p){
		No<T> aux = inicial;
		while(aux!=null){
			if(aux.getnumero() == p){
				break;
			}else if(aux.getproximo() == null){
				System.out.println("Elemento n�o existe");
				aux = null; // faz o tratamento no programa
				break;
				
			}else{
				aux = aux.getproximo();
			}
		
		}
		return aux;
	}
	public void remover(T p){
		No<T> aux = inicial;
		No<T> aux2 = null;
		if(inicial.getnumero() == p){
			inicial = inicial.getproximo();
			nelementos--;
		}else{
			while(aux!=null){
				if(aux.getnumero() == p){
					if(aux.getproximo() == null){	
						nelementos--;
						aux2.setproximo(null);
						break;
					}else{
						aux2.setproximo(aux.getproximo());
						nelementos--;
						break;
					}
					}else{
						aux2 = aux;
						aux = aux.getproximo();
			}
		}
	}
	}

}
