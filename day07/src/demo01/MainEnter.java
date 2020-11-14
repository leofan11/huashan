package demo01;

import demo.Bike;

public class MainEnter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RepairWoman woman=new RepairWoman("lucy");
		Car car=new Car();
		Tank tank=new Tank();
		Bus bus=new Bus();
		Bike bike=new Bike();
		
		//TireAble t=motor;
		
		woman.repair(tank);
		woman.repair(bus);
		woman.repair(car);
		woman.repair(bike);
	}
	
	public static void oil(OilAble oil) {
		
		oil.change();
	}
}
