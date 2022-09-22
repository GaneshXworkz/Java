class Swiggy{
	String [] item={"pizza","burger","southindian","mosruanna","pastries"};
	public static double takeOrder(String item,double quantity){     //public static string takeOrder(){} ---> when  we dont using void
		if(item == "pizza"){
			System.out.println("thank you for ordering "+item);
		 return 135.00*quantity;
		}if(item== "burger"){
			System.out.println("thank you for ordering " +item);
		return 150.00*quantity;	
		}if(item=="southindian"){
		  System.out.println("thank you for ordering "+item);
		return 80.00*quantity;	
		}if(item=="mosruanna"){
			System.out.println("thank you for ordering " + item);
		return 50.00*quantity;	
		}if(item=="pastries"){
			System.out.println("thank you for ordering "+item);
		return 170.00*quantity;	
		}
		return 0.00;	
			
	}
	
	public static double takeOrder(String item){     //public static string takeOrder(){} ---> when  we dont using void
		if(item == "pizzA"){
			System.out.println("thank you for ordering "+item);
		 return 135.00;
		}if(item== "burger"){
			System.out.println("thank you for ordering " +item);
		return 150.00;	
		}if(item=="southindian"){
		  System.out.println("thank you for ordering "+item);
		return 80.00;	
		}if(item=="mosruanna"){
			System.out.println("thank you for ordering " + item);
		return 50.00;	
		}if(item=="pastries"){
			System.out.println("thank you for ordering "+item);
		return 170.00;	
		}
		return 0.00;	
			
	}
	
	
	
	
}