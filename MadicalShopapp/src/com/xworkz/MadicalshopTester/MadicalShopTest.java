package com.xworkz.MadicalshopTester;

import com.xworkz.app.MadicalShop;

public class MadicalShopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 long staffcontectNo[]=new long[3];
		 staffcontectNo[0]=7895465322L;
		 staffcontectNo[1]=9845613723L;
		 staffcontectNo[2]=8561234745L;
		 
		 String staffnames[]=new String[3];
		 staffnames[0]="manu";
		 staffnames[1]="raju";
		 staffnames[2]="rana";
		 
		 String cosmatics[]=new String[3];
		 cosmatics[0]="Himalya FaceWash";
		 cosmatics[1]="pond,s Cream";
		 cosmatics[2]="sun Screen";
		 
		 String billingMethod[]=new String[2];
		 billingMethod[0]="scan";
		 billingMethod[1]="debit";
		 
		 
		 MadicalShop med =new MadicalShop("GST4567989","MED PLUS","RAJAJINAGRA",staffcontectNo, staffnames,cosmatics,billingMethod);
		 med.displayInfo();
		 
		      	
	}

}
