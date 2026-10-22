package deep;

public class Hello {
	
	public static void main(String[] args) {
	
	Car car1= new Car("Nissan", 120);
	Car car2= new Car("Audi", 100);

	car1.show();
	car2.show();
	
	Rectangle r= new Rectangle(4.0, 3.0);
	System.out.println(r.area());
	System.out.println(r.perimeter());
	
	Counter c = new Counter();

	c.increase();
	c.increase();
	c.increase();
	c.show();
	c.reset();
	c.show();
	

	Player p1= new Player("Max",2);
	p1.introduce();
	System.out.println(p1.points());	
	
	}
}
