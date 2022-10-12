class RiceTester{
	
	public static void main (String []a){
	
	
	Rice rice = new Rice();
	rice.riceName="Asian rice";
	rice.ricePriceperKg="Rs 65 per/Kg";
	rice.whereWeGrow="Cambodia, Lao People's Democratic Republic (PDR), Myanmar, Thailand, and Vietnam";
	rice.life();
	System.out.println(rice.riceName+"\n"+rice.ricePriceperKg+"\n"+rice.whereWeGrow);
	
	Rice rice1 = new Rice();
	rice1.riceName="African rice";
	rice1.ricePriceperKg="Rs 79.16 per/Kg";
	rice1.whereWeGrow="Ghana and Nigeria";
	rice1.life();
	System.out.println(rice1.riceName+"\n"+rice1.ricePriceperKg+"\n"+rice1.whereWeGrow);
	
	Rice rice2 = new Rice();
	rice2.riceName="Basmati Rice";
	rice2.ricePriceperKg="Rs 99 per/Kg";
	rice2.whereWeGrow="Himachal Pradesh, Punjab, Haryana, Delhi, Uttarakhand and western Uttar Pradesh";
	rice2.life();
	System.out.println(rice2.riceName+"\n"+rice2.ricePriceperKg+"\n"+rice2.whereWeGrow);
	
	Rice rice3 = new Rice();
	rice3.riceName="Wild Rice";
	rice3.ricePriceperKg="Rs 81 per/Kg";
	rice3.whereWeGrow= "California,Great Lakes region of the United States.";
	rice3.life();
	System.out.println(rice3.riceName+"\n"+rice3.ricePriceperKg+"\n"+rice3.whereWeGrow);
	
	Rice rice4 = new Rice();
	rice4.riceName="Sushi Rice";
	rice4.ricePriceperKg="Rs 575 per/Kg";
	rice4.whereWeGrow="Japan,India.";
	rice4.life();
	System.out.println(rice4.riceName+"\n"+rice4.ricePriceperKg+"\n"+rice4.whereWeGrow);
	
	
	
	
	
	
	
	
	
	
	
	}



}