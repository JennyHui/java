package T4;

class Outer {
	
	private static int index=50;
	//InnerΪ�ڲ���
	static class Inner{
		private static int index=100;

		static void print(){
			int index=20;
			System.out.println(index);
			System.out.println(Inner.index);
			System.out.println(Outer.index);
		}
	}

	void print(){
		Inner in=new Inner();
		in.print();
	}
	
	Inner getInner(){
		return new Inner();
	}
	
	/*public static void main(String[] args){
		Outer ou = new Outer();
		Inner in = ou.getInner();
		in.print();
	}*/
}

class Test{

	public static void main(String[] args){
		Outer ou = new Outer();
		ou.print();
		//Outer.Inner in = ou.getInner();
		//in.print();
		//Outer.Inner in = ou.new Inner();
	}
}
