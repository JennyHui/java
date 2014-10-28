package T3;

class Andy {
	
	String CPU;
	videocard VC;
	void setCPU(String CPU){
		this.CPU = CPU;
	}
	
	void setVC(T3.videocard VC){
		
		this.VC=VC;
	}
	
	void run(){
		System.out.println(CPU);
		System.out.println(VC.getName());
		VC.display();
	}
}
