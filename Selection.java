package practica;


public class Selection {
	private int[] sele;
	
	public Selection(int[] sele) {
		this.sele= sele;
	}
	
	public void SelectionSort() {
		int n= sele.length;//It looks at how many items are in your array and stores that number in n
		for(int i=0; i<n; i++) {
			int minIndex= i; //Holds the position
			int minValue= sele[i];//Holds the value
			
			for(int j=i+1; j<n;j++ ) {//Its job is to hunt through the unsorted part to see if any number is smaller than the one we currently have
				
				if(sele[j]< minValue) {
					 minIndex=j;//If it is smaller, we update our minIndex to remember this new, better position.
					 minValue= sele[j];//We also update our minValue to this new, smaller number.
				}
			}
			
			int temp=sele[i];//We save the old value of sele[i] in a temporary box (temp) so we don't accidentally erase it.
			sele[i]=sele[minIndex];//We copy the smallest number we found into our target position i
			sele[minIndex]=temp;//We put the old number from sele[i] into the spot where the smallest number used to be, completing the swap
		}
	}

	public void printArray() {//Go through the sele array one by one, and for each round, temporarily call the current number num."
		for(int num : sele) {
			System.out.print(num + " ");		
		}
			System.out.println();	//new line lit 	
	}
}

