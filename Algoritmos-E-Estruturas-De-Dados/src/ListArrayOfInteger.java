
public class ListArrayOfInteger {

	private int[] data;
	private int count;

	public ListArrayOfInteger(int size) {
		this.data = new int[size];
		this.count = 0;
		}
	
	public void teste(){
		System.out.println("lenght "+data.length);
		System.out.println("count "+count );
	}
	
			/*
			 * // 	falta :
					
					int set (int index , int element)
					
					boolean remove (int element)
					int removeByIndex (int index )
					
					
					boolean contains (int element)
					
					void clear ( ) 
			 * */
		
	public int size(){
		return count;
	}
	
	private void increasesData(){
		
		int[] aux = new int[data.length+10];
		
		for(int x = 0; x < data.length; x++){
			
			aux[x] = data[x];
			
		}
		
		this.data = aux;
		
	}
	
	public void add(int element){
		
		if (count == data.length){
			increasesData();
		} else {
			data[count] = element;
			count++;
		}
	}
	
	public void add(int index, int element) {

		if (index < 0 || index >= count) {
			// erro!
			System.out.println("erro index");
		} else {

			if (count == data.length) {
				increasesData();
			} else {

				for (int i = count; i > index; i--) {
					data[i] = data[i - 1];

				}
				data[index] = element;
				count++;
			}

		}

	}

	public void listaTodos() {

		if (count == 0) {
			System.out.println("lista vazia");
		} else {
			System.out.print("\n{ ");
			for (int z = 0; z < count; z++) {

				if (z < count-1) {
					System.out.print(data[z] + ", ");

				} else {
					System.out.print(data[z] + " ");

				}

			}
			System.out.println("}");
		}
	}
	
	public int get(int index){
		
		if(index < 0 || index >= count){
			//erro
			System.out.println("erro");
			
		} 
		
		return data[index];
		
	}
	
	public boolean isEmpty(){
		return (count == 0);
	}
	
	
	public int indexOf(int element){
		
		for(int x = 0; x < count; x++){
			if(element == data[x]){
				return x;
			}
		}
		return -1;
		
	}
	
	
	
	

}