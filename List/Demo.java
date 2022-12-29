package com.xworkz.Collection.List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Demo {
	
	public static void main(String[] args) {
		List<Integer> ref=new ArrayList<Integer>();
		ref.add(12);
		ref.add(13);
		ref.add(14);
		ref.add(15);
		ref.add(16);
		
		System.out.println("--------------ALL  ELEMENT--------------");

		
		for(int i:ref) {
			System.out.println(i);
		}
		System.out.println("--------------ADD ELEMENT--------------");
		
	   ref.add(17);
	   ref.add(18);
	   
	   for(int i:ref) {
			System.out.println(i);
		}
	   
		System.out.println("--------------ADD ELEMENT INDEX BASE--------------");


		ref.add(0, 11);
		ref.add(2, 2);
		ref.add(3, 3);
		
		 for(int i:ref) {
				System.out.println(i);
			}
			System.out.println("--------------SET ELEMENT INDEX BASE--------------");

			ref.set(0, 21);
			ref.set(5, 25);
			ref.set(6, 30);
			
			 for(int i:ref) {
					System.out.println(i);
				}
			 
			 
		System.out.println("--------------REMOVE ELEMENT INDEX BASE--------------");

		ref.remove(0);
		ref.remove(2);
		ref.remove(4);
		
		 for(int i:ref) {
				System.out.println(i);
				
		
			}
		 
			System.out.println("--------------GET ELEMENT INDEX BASE--------------");
			
             System.out.println(ref.get(0));
             System.out.println(ref.get(2));

		 
			System.out.println("--------------REMOVE All --------------");

		 ref.removeAll(ref);
		 

		 for(int i:ref) {
				System.out.println(i);
			}

		 System.out.println("Size List After Removing : "+ref.size());
		 
		 
	}

}
