class MotorCycle {
	String color;
	int speed;
	int gear;
	String pilotName;
	int pilotAge;
	public MotorCycle(String c, int s, int g, String n, int a) {
		this.color=c;
		this.speed =s;
		this.gear = g;
		this.pilotName = n;
		this.pilotAge = a;
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
	}
class PilotClass{
	String pilotName;
	int pilotAge;
		MotorCycle pilotAge;					//Creating HAS-A relationship with MotorCycle class
	PilotClass(String n, int a){
		this.pilotName=n;
		this.pilotAge=a; }
void main(String[] args) {
	PilotClass obj3 = new PilotClass(pilotName, pilotAge);
	System.out.println(obj3.pilotName);
	System.out.println(obj3.pilotAge);}
	public String getInfo() {
		return ("The pilot name is: "+pilotName+" The pilot age is:"+pilotAge);
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
