package T3;

interface sport {
	public abstract void run();
	public abstract void jump();
}

class Jenny implements sport{
	public void run(){
		System.out.println("Jenny is running");
	}
	
	public void jump(){
		System.out.println("Jenny is jumping");
	}
	
	public static void main(String[] args){
		Jenny j = new Jenny();
		j.run();
		j.jump();
	}
}
