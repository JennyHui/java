package T1;

public class Point {
	static int x,y,z;
	final double pie;
	
	Point(int a,int b){
		pie=3.12444;
		x=a;
		y=b;
	}
	Point(){
		this(10,23);
		//pie = 3.14;
	}
	static void output(){
		System.out.println("blahblah");
		System.out.println(x);
		//System.out.println(y);
	}
	/*void output(int x,int y){
		this.x=x;
		this.y=y;
	}*/

	public static void main(String[] args){
		//Point pt;
		//pt = new Point();
		//pt.output(2, 110);
		//pt.x=10;
		//pt.y=10;
		//pt.output();
		//Point.output();
		Point pt1 = new Point();
		Point pt2 = new Point();
		pt1.z=1;
		pt2.z=2;
		System.out.println(pt1.z);
		System.out.println(pt2.z);
		
	}
		
}
