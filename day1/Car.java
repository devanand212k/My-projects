package week1.day1;

public class Car {
	private void applyBreak() {
		System.out.println("Applied break");

	}
	private void soundHorn() {
		System.out.println("Sound horn");
		
	}
	public static void main(String[] args) {
		Car System = new Car();
		System.applyBreak();
		System.soundHorn();
		Car Bike = new Car();
		System.applyBreak();
		System.soundHorn();
	}

}
