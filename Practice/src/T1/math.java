package T1;

public class math {
	static int length,width;
	void girth(){
		System.out.println(length+width);
	}
	
	void area(){
		System.out.println(length*width);
	}
	
	public static void main(String[] args){
		length=0;
		width=100;
		math m = new math();
		m.girth();
		m.area();
	}
}
