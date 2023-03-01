package week1.day1;

public class Mobile01 {
	public void makeCall() {
		String mobileModel = "Samsung";
		float mobileWeight = 200;
		System.out.println("This is my Mobile");
	}
	public void sendSms() {
		boolean isFullyCharged;
		int mobileCost = 17000;
		System.out.println(mobileCost);
		
	}
	public static void main(String[] args) {
		Mobile01 mob = new Mobile01();
		mob.makeCall();
		Mobile01 sms = new Mobile01();
		sms.sendSms();
		
		
	}
	
}
