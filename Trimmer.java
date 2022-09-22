class Trimmer{
	static String brand   ="PHILIPS";          //implicit
	static String color   ="BLUE";
	static double price   =849.25;
	static String working ="on/off";
	static String warrenty="1 year ";
	static String settings[]={"1mm","2mm","3mm","4mm"};

	public static void main(String[] args){
		
	System.out.println("brand       :" +brand );
	System.out.println("color       :" +color);
	System.out.println("price       :" +price);
	System.out.println("working     :" +working);
	System.out.println("warrenty    :" +warrenty);	
	System.out.println("settings    :" +"\n"+settings[0]+"\n"+settings[1]+"\n"+settings[2]+"\n"+settings[3]);
	
	}
}