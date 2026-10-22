package deep;

public class Counter {
	
	int count;
	
	public Counter() {
		count=0;
	}
	
	public void increase() {
		count+=1;
	}
	
	public void reset() {
		count= 0;
	}
	
	public void show() {
		System.out.println(count);
	}

	
}
