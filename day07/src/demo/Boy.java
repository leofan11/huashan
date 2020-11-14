package demo;

public class Boy {

	public void xiangQin(Girl girl) {
		
		if(girl instanceof GentleGirl) {
			GentleGirl gg=(GentleGirl)girl;
			gg.introduce();
			gg.sing();
		}else if(girl instanceof BoldGirl) {	
			BoldGirl bg=(BoldGirl)girl;
			bg.introduce();
			bg.kongfu();
		}else if(girl instanceof LivelyGirl){
			LivelyGirl lg=(LivelyGirl)girl;
			lg.introduce();
			lg.dance();
			lg.sing();
		
			
		}
		
	}
	
	
}
