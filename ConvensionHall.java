class ConvensionHall{
	
	ConvensionHall(){
		System.out.println("ConvensionHall Constructor calling");
	}
	
	String name;
	String location;
	int price;
	String type;
	
	
	public static void main(String[] args){
		
		ConvensionHall conv=new ConvensionHall();
		conv.name="Sri Rajhans Convention hall";
		conv.location="Rajajinagara";
		conv.price=60000;
		conv.type="min and large hall avaliable";
		
		System.out.println(conv.name+" "+conv.location+" "+conv.price+" "+conv.type);
		
		ConvensionHall conv1=new ConvensionHall();
		conv1.name="Sri shuba Convention hall";
		conv1.location="Rajajinagara";
		conv1.price=55000;
		conv1.type="min and large hall avaliable";
		
		System.out.println(conv1.name+" "+conv1.location+" "+conv1.price+" "+conv1.type);
		
		ConvensionHall conv2=new ConvensionHall();
		conv2.name="Sri Ashoka Convention hall";
		conv2.location="Rajajinagara";
		conv2.price=65000;
		conv2.type="min and large hall avaliable";
		
		System.out.println(conv2.name+" "+conv2.location+" "+conv2.price+" "+conv2.type);
		
		ConvensionHall conv3=new ConvensionHall();
		conv3.name="Sri Vasavi Convention hall";
		conv3.location="Rajajinagara";
		conv3.price=63000;
		conv3.type="min and large hall avaliable";
		
		System.out.println(conv3.name+" "+conv3.location+" "+conv3.price+" "+conv3.type);
		
		ConvensionHall conv4=new ConvensionHall();
		conv4.name="Sri Gaman Convention hall";
		conv4.location="Rajajinagara";
		conv4.price=70000;
		conv4.type="min and large hall avaliable";
		
		System.out.println(conv4.name+" "+conv4.location+" "+conv4.price+" "+conv4.type);
		
	}
	
	
}