
public class App {

	public static void main(String[] args) {

		ListArrayOfInteger lista = new ListArrayOfInteger(5);
		lista.listaTodos();

		System.out.println("Tamanho da lista :" + lista.size());

		System.out.println("\nPreenche lista com elementos: ");

		for (int x = 0; x <= 5; x++) {
			lista.add(x);
		}


		
		  System.out.println("\nLista todos elementos: "); lista.listaTodos();
		  System.out.println("Tamanho da lista :" + lista.size());
		  
		  lista.teste();
		  
		  lista.add(0,17); 
		  
		  lista.listaTodos();
		 
		  System.out.println("Tamanho da lista :" + lista.size());
		  
		  
		  System.out.println(lista.get(6));
		  //arrumar retorno maior que count atual
		  
		  System.out.println(lista.isEmpty());
		  
		
	}

}
