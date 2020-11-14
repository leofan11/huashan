package day07;

public class Girl {

	public String name;
	public char gender;
	public Boy bf;
	
	
	public Girl(String name,char gender) {
		this.name=name;
		this.gender=gender;
	}
	
	public void coquety(Boy boy) {
		System.out.println(this.name+"向"+boy.name+"撒娇");
		
	}

	public void smile(Boy boy) {
		System.out.println(this.name+"向"+boy.name+"微笑");
		
	}
	
	public void buildRelation(Boy boy) {
		
		this.bf=boy;
	}
}
