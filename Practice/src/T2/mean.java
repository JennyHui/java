package T2;

public abstract class mean {
	
	final public void pub(){
		System.out.println("This is a public mean");
	}
	
	protected abstract void pro();/*{
		System.out.println("This is a protect mean");
	}*/

	void def(){
		System.out.println("This is a default mean");
	}
	
	private void pri(){
		System.out.println("This is a private mean");
	}
	
	public static void main(String[] args){
		/*mean m = new mean();
		m.pub();
		m.pro();
		m.def();
		m.pri();*/
	}
		
}

