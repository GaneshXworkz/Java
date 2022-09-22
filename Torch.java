class Torch{
	static int isConncted=1;
	public static int onOrOff(){
	if(isConncted==1){
		System.out.println("on...");
		isConncted++;
	}else if(isConncted==2){
		System.out.println("britness..");
		isConncted++;
	}else if(isConncted==3){
		System.out.println("off...");
		isConncted=1;
	}return isConncted;	
			
		
	}
	
	
	
	
}