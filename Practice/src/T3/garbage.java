package T3;

public class garbage {
	int index; //���ն���
	static int count; //��¼��ǰ�������ٸ�����
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
