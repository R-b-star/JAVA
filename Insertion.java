package practica;

public class Insertion {
	private int[] lista;
	
	public Insertion(int[] lista) {
		this.lista=lista;
	}
	
	public void insertionSort() {
		int n=lista.length;
		
		for(int i=1; i<n; i++) {
			int j=i-1;
			int key=lista[i];
			while(j>=0 && lista[j]>key) {
				lista[j+1]=lista[j];
				j--;
			}
			lista[j+1]=key;//Drop the card I'm holding (actual) into the empty slot right next to where I stopped (j + 1).
			
		}
	}
	
	public void printArray(){
		for(int num:lista) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
	
}
