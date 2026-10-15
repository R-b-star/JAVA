package practica;

public class QuickSort {
	
	private int[] lista;
	
	public QuickSort(int[] lista) {
		this.lista=lista;
	}

	public void sortQuick() {
		int n=lista.length;
		int low=0;
		int high=n-1;
		int median=lista[0];
		int r=low;
		int l=high;
		
		while(r<=l) {
			
			while(lista[r]<median) {
				r++;
			}
				while(lista[l]>median) {
					l--;
				}
					if(r<=l) {
						int temp=lista[r];
						lista[r]=lista[l];
						lista[l]=temp;
						r++;
						l--;
					
					}
		}
		
	}
	public void printArray(){
		for(int num:lista) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
}
