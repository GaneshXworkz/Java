class Degree{
	public static void main(String[] args){
	
	String []bachelorOfEngineering ={"Mechanical Engineering","Computerscience Engineering","Informationscience Engineering","Civil Engineering","Electronics and Communication Engineering","Electrical Engineering","aeronatical engineering",};
	String []bachelorOfScience={"BSc Agriculture","BSc Biotechnology","BSc Zoology","BSc Forestry","Bsc Nursing"};
	String []bachelorOfArts={"BA English","BA Fine Arts","BA Psychology","BA Social Work","BA Music"};
	String []bachelorOfLaw={"BA LLB","BBA LLB","BCA LLB","B.Com LLB","B.Tech LLB","B.Sc LLB"};
	
	System.out.println("\n"+"------------------------------------"+"\n"+"Branch's in Bachelor of Engineering" +"\n"+"-----------------------------");
	for(int i=0;i<6;i++){
		System.out.println(bachelorOfEngineering[i]);
	}
	System.out.println("\n"+"------------------------------------"+"\n"+"Braanch's in Bachelor of Science" +"\n"+"-----------------------------");
	for(int i=0;i<4;i++){
		System.out.println(bachelorOfScience[i]);
	}
	System.out.println("\n"+"------------------------------------"+"\n"+"Braanch's in Bachelor of Arts" +"\n"+"-----------------------------");
	for(int i=0;i<4;i++){
		System.out.println(bachelorOfArts[i]);
	}
	System.out.println("\n"+"------------------------------------"+"\n"+"Braanch's in Bchelor of Law" +"\n"+"-----------------------------");
	for(int i=0;i<5;i++){
		System.out.println(bachelorOfLaw[i]);
	}
}



}