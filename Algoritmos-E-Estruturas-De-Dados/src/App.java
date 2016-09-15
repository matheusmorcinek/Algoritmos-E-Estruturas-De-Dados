
public class App {

	public static void main(String[] args) {
		
		
		ListArrayOfInteger lista = new ListArrayOfInteger(5);
		
		System.out.println("Tamanho da lista" + lista.size());
		
		
		System.out.println("\nPreenche lista com 10 elementos: ");

		for(int x = 0; x <=100; x++){
			lista.add(x);
		}
	
		System.out.println("\nLista todos elementos: ");
		
		
		System.out.print("\nLista - { ");
		for(int z = 0; z <=10; z++){
			
			if(z < 10){
				System.out.print(z +", ");
					
			} else {
				System.out.print(z +" ");
				
			}
			
		}
		System.out.println("}");
		
		
		
		
	}

}
