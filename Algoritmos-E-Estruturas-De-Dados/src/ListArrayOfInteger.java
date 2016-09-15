
public class ListArrayOfInteger {

	private int[] data;
	private int count;

	

	public ListArrayOfInteger(int size) {
		this.data = new int[size];
		this.count = 0;
	}
	
			/*
			 * // 	Métodos
					ListArrayOfInteger (int size)
					void add (int element)
					void add (int index , int element)
					int get (int index)
					int set (int index , int element)
					boolean remove (int element)
					int removeByIndex (int index )
					boolean isEmpty ( )
					
					boolean contains (int element)
					int indexOf (int element)
					void clear ( ) 
			 * */
		
	public int size(){
		return count;
	}
	
	private void increasesData(){
		
		int[] aux = new int[data.length];
		
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
	
	public void add(int index, int element){
		
		if(index < 0 || index > count){
			//erro!
		} else {
		
		if(count == data.length){
			increasesData();
		} else{
			
			for(int i = count; i <= index; i--){
				data[i] = data[i-1];
				listaTodos();
			}
			data[index] = element;
			count++;
		}
		
	}
	
	}
	

	public void listaTodos(){
		for(int x = 0 ; x < data.length; x++){
			System.out.print(x + ",");
		}
	}

}