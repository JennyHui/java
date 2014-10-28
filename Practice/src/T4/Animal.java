package T4;

public interface Animal {
	
	void eat();
	void sleep();
}

class Zoo{
	private class Tiger implements Animal{
		public void eat(){
			System.out.println("The Tiger is eating");
		} 
		public void sleep(){
			System.out.println("The Tiger is sleeping");
		}
	}
	
	Animal getAnimal(){
		return new Tiger();
		}
}

class TestAn{
	public static void main(String[] args){
		Zoo zo = new Zoo();
		Animal an = zo.getAnimal();
		an.eat();
		an.sleep();
	}
}
