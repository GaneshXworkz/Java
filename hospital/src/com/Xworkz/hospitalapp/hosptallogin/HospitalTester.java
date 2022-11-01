package com.Xworkz.hospitalapp.hosptallogin;

public class HospitalTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hospital hospital =new Hospital();
		hospital.savePatientName("hkjk");
		hospital.savePatientName("gjhk");
		hospital.savePatientName("gjhkj");
		hospital.savePatientName("bkjhjk");
		hospital.savePatientName("hjkjk");
		hospital.savePatientName("hjkjk");
		hospital.savePatientName("hjkjk");
		
		hospital.getPatientName();
		
		hospital.updatePatientNames("gjhk" ,"gani");
		
		hospital.getPatientName();
		
		
	}

}
