package T2a;
import T2.*;
public class same_class extends mean {
	
	public void pro(){
		System.out.println("This is a new protevted mean");
	}

	public static void main(String[] args){
		same_class  sc = new same_class();
		sc.pub();
		sc.pro();
		//sc.def();
		//sc.pri();
	}

}
