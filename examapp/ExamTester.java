package com.xworkz.examapp;
	
	public class ExamTester {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			 
			String subjectNames[] = {"m1","os","vlsi","DME1"};	
			HallTicket hallTicket = new  HallTicket("Vishak", subjectNames , "1ER5690902","dabbha");
			
			Exam exam = new Exam();
			exam.fees= 1200;
			exam.allow(hallTicket);
			
			Supplementry exam1=new Supplementry(2);
			exam1.fees=1200;
			exam1.allow(hallTicket);

		}

	}


