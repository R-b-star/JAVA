package deep;

public class Car {

	String brand;
	int speed;
	
	public Car(String brand, int speed) {
		this.brand=brand;
		this.speed=speed;
	}
	
	public void show() {
		//"BRAND is going SPEED km/h"
		System.out.println(brand + " is going " + speed + "km/h");
	}
}
