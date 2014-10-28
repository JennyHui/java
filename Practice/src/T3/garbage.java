package T3;

public class garbage {
	int index; //回收对象
	static int count; //记录当前产生多少个对象
	garbage(){
		count++;
		System.out.println("This is the "+ count +" object");
		setId(count);
	}
	
	void setId(int id){
		index=id;
		
	}
	
	protected void finalize(){
		System.out.println("This is the "+ index +" garbage");
	}
	
	public static void main(String[] args){
		new garbage();
		new garbage();
		new garbage();
		new garbage();
		System.gc();
	}
	

}
