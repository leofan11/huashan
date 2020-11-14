package demo01;

public class RepairWoman {

	public String name;
	
	public RepairWoman(String name) {
		
		this.name=name;
	}
	
	public void repair(OilAble oil) {
		oil.change();
		
	}
	
	public void repair(Motor moto) {
		moto.changeTire();
	}
	
	public void repair(TireAble tire) {
		tire.changeTire();
	}
	public void repair(EngineAble engine) {
		engine.changeEngine();
	}
	
	public void repair(TechnologyAble t) {
		t.change();
		t.changeTire();
	}
	
}
