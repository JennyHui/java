package T3;

class CB implements videocard {
	
	String name;

	public CB()
	{
		name="JennyHui's videocard";
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public void display(){
		System.out.println("HelloJenny");
	}
	
	public String getName() {
		return name;
	}
	

}
