package T1;

public class Animal {
	public static Animal an;
	int weight,height=10;
	/*Animal(int weight,int height){
		System.out.println("blah1");
	}*/
	void eat(){
		System.out.println("animal is eating~");
	}
	void sleep(){
		System.out.println("animal is sleep");
	}
}

class Fish extends Animal{
	int height=40;
	/*Fish(){
		super();
		System.out.println("blah2");
	}*/
	void et(){
		//super.sleep();
		//System.out.println(height);
		//System.out.println(super.height);
		System.out.println("fish is eating~");
	}

}

class T{
	static void fa(Animal an){
		an.eat();
	}
	public static void main(String[] args){
		Fish an = new Fish();
		Animal anl = new Animal();
		anl=an;
		if(anl instanceof Animal){
			System.out.println("yes~");
		}
		else{
				System.out.println("no~");
		}
		//an.eat();
		//fh.eat();
	}
}