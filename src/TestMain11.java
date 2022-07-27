public class TestMain11 {
	public static void main(String[] args) {
		Car c1 = new Car("MaruthiSuzuki-1");
		Car c2 = new Car("Hyundai-1");
		
		Bus b1 = new Bus("VOLVO-1");
		Bus b2 = new Bus("TATA-1");
		
		Cycle cy1 = new Cycle("HERO-1");
		Cycle cy2 = new Cycle("ATLAS-1");
		
		ElectricalGenSet eg1 = new ElectricalGenSet("HONDA-1");
		ElectricalGenSet eg2 = new ElectricalGenSet("YAMAHA-1");
		
		Fillable fillQ[] = new Fillable[6];
		Serviceable serviceQ[] = new Serviceable[6];
		fillQ[0] = c2;
		fillQ[1] = eg1;
		fillQ[2] = b2;
		fillQ[3] = c1;
		fillQ[4] = eg1;
		fillQ[5] = b1;

		serviceQ[0] = b1;
		serviceQ[1] = c1;
		serviceQ[2] = b2;
		serviceQ[3] = cy1;
		serviceQ[4] = cy2;
		serviceQ[5] = c2;
		
		FuelStation fuelStation = new FuelStation();
		ServiceStation serviceStation = new ServiceStation();
		
		fuelStation.doFillFuel(fillQ);
		serviceStation.doServicing(serviceQ);
	}
}
class FuelStation{
	public void doFillFuel(Fillable fQueue[]) {
		for(int i = 0; i < fQueue.length; i++) {
			fQueue[i].fillFuel();
		}
	}
}
class ServiceStation{
	public void doServicing(Serviceable sQueue[]) {
		for(int i = 0; i < sQueue.length; i++) {
			sQueue[i].serviceVehicle();
		}
	}
}
interface Fillable{
	void fillFuel();
}
interface Serviceable{
	void serviceVehicle();
}
class Cycle implements Serviceable{
	String name;
	public Cycle(String name) {
		this.name = name;
	}
	public void serviceVehicle() {
		System.out.println(name + " : Serviceing Cycle");
	}
}
class ElectricalGenSet implements Fillable{
	String name;
	public ElectricalGenSet(String name) {
		this.name = name;
	}
	public void fillFuel() {
		System.out.println(name + " : Filling Fuel to ElectricalGenSet");
	}
}
class Car implements Fillable, Serviceable{
	String name;
	public Car(String name) {
		this.name = name;
	}
	public void serviceVehicle() {
		System.out.println(name + " : Serviceing Car");
	}
	public void fillFuel() {
		System.out.println(name + " : Filling Fuel to Car");
	}
}
class Bus implements Fillable, Serviceable{
	String name;
	public Bus(String name) {
		this.name = name;
	}
	public void serviceVehicle() {
		System.out.println(name + " : Serviceing Bus");
	}
	public void fillFuel() {
		System.out.println(name + " : Filling Fuel to Bus");
	}
}
