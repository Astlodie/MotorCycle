public class MotorCycle {
	private static String String;
	String color;
	int speed;
	int gear;		 
	public MotorCycle(String c, int s, int g) {
		this.color=c;
		this.speed =s;
		this.gear = g;
	}
	public MotorCycle() {
		// TODO Auto-generated constructor stub
	}
	void applyBrake(int decrement) {
		MotorCycle speed = new MotorCycle();
		System.out.println("The speed is:" +speed);}
	void speedUp(int increment) {
		MotorCycle speed = new MotorCycle();
		System.out.println("The speed is:" +speed);}
	public String getInfo() {
		return ("The color is: "+color+" The speed is:"+speed+" The gear is:"+gear);
	}
	public static void main(String[] args) {
		MotorCycle obj1 = new  MotorCycle(String c, int s, int g);
		MotorCycle obj2 = new  MotorCycle(String c, int s, int g);	
		System.out.println(obj1.color);
		System.out.println(obj1.speed);
		System.out.println(obj1.gear);
		System.out.println(obj2.color);
		System.out.println(obj2.speed);
		System.out.println(obj2.gear);	
	}
}
class PilotClass{
	static String pilotName;
	static int pilotAge1;
	MotorCycle pilotAge;					//Creating HAS-A relationship with MotorCycle class
	PilotClass(String name, int age){
		PilotClass.pilotName=name;
		this.pilotAge1=age; }
public static void main(String[] args) {
	PilotClass obj3 = new  PilotClass(pilotName, pilotAge1);
	PilotClass obj4 = new  PilotClass(pilotName, pilotAge1);	
	System.out.println(obj3.pilotName);
	System.out.println(obj3.pilotAge1);
	System.out.println(obj4.pilotName);
	System.out.println(obj4.pilotAge1);}
	public String getInfo() {
		return ("The pilot name is: "+pilotName+" The pilot age is:"+pilotAge1);
	}
}
class MountainMotorCycle extends MotorCycle{
	int gear;
	int speed;
	int seatHeight;
	MountainMotorCycle(int g, int s, int sthght){
		this.gear=g;
		this.speed=s;
		this.seatHeight=sthght;}
	public MountainMotorCycle() {
		// TODO Auto-generated constructor stub
	}
	void seatHeight (int newValue) {
	}
	public String getInfo() {
		return ("The seat height is: "+seatHeight);
	}
	public static void main(int args[]){
		MountainMotorCycle obj = new MountainMotorCycle();
		System.out.println(obj.gear);
		System.out.println(obj.speed);
		System.out.println(obj.seatHeight);
		obj.does();
	}
	private void does() {
		// TODO Auto-generated method stub	
	}
}
