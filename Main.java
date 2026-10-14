package practica;

public class Main {

	public static void main(String[] args) {
		
		int[] myNumbers= {12,32,21,16,18};
		
		Selection sorter= new Selection(myNumbers); 
		
		System.out.println("Before sorting:");
		
		sorter.printArray();
		
		sorter.SelectionSort();
		
		System.out.println("After sorting: ");
		
		sorter.printArray();
	}
}
