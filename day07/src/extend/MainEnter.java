package extend;

public class MainEnter {

	public static void main(String[] args) {
		
		Man man=new Man("唐伯虎",20) ;
		Woman qiuxiang=new Woman("秋香",18,170,95);
		man.woman=qiuxiang;
		
		Woman xiaxiang=new Woman("夏香",16,170,95);
		Woman dongxiang=new Woman("东香",16,169,95);
		Woman xixiang=new Woman("西香",16,171,94);
		Woman yexiang=new Woman("夜香",16,169,94);
		
		man.findWoman(dongxiang,yexiang,xixiang,xiaxiang);
		
		
		System.out.println(qiuxiang.equals(dongxiang));
		System.out.println(qiuxiang.equals(xixiang));
		System.out.println(qiuxiang.equals(yexiang));
		System.out.println(qiuxiang.equals(xiaxiang));
		
		
		
		
		
		
		
		
		
		
		
		
		
//		// TODO Auto-generated method stub
//		Person person = new Person();
//		person.name = "张三";
//		person.dna = "A";
//		person.age = 18;
//		person.gender = 1;
//
//		Person person1 = new Person();
//		person1.name = "张三";
//		person1.dna = "A";
//		person1.age = 18;
//		person1.gender = 1;
//
//		Person person2=new Person();
//		person2.name="张三";
//		person2.dna="A";
//		person2.age=18;
//		person2.gender=1;
//		
//		System.out.println(person.equals(person2));
//		System.out.println(person.equals(person1));
	}

}
