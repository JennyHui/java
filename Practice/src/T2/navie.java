package T2;

public class navie {
	
	public native void displaynavie(); 
	static{
		System.out.println("navie mean~");
	}
	public static void main(String[] args){
		new navie().displaynavie();
	}

}
