package week1.day1;

public class Mobile {
	public void sendSms() {
		System.out.println("Hi I'm Dev Anand");
	}
	public void takeSnapShot() {
		System.out.println("Take snapshot ");		
	}
	public static void main(String[] args) {
		Mobile sms = new Mobile();
		sms.sendSms();
		sms.takeSnapShot();
		
	}
}
