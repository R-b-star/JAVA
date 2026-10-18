package deep;

public class Hello {
	
	public static void main(String[] args) {
	
		int[] numbers = {4, 8, 15, 16, 23, 42};
		int n = numbers.length;
		int sum=0;
		
		for(int i=0; i<n; i++) {
			System.out.println(numbers[i]);
		
			 sum+=numbers[i];
		}
		
		System.out.print(sum);
	}

}
