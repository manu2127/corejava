class SportsMania{
	static String iplTeamNames[] = {"Chennai super kings","Delhi capitals","Gujarat titans","Kolkata knight riders","Lucknow super giants","Mumbai indians","Punjab kings","Rajasthan royals","Royal challengers bengaluru","Sunrisers hyderbad"};
	static String top10Batsman[] = {"Virat kohli","Ruturaj gaikwad","Riyan parag","Travis head","Sanju samson","KL Rahul","Sunil narine","Abhishek sharma","Rishabh pant","Shubman gill"};
	static String top10Bowlers[] = {"HV Patel","CV Varun","JJ Bumrah","AD Russell","Harshit Rana","T Natarajan","Arshdeep singh","Avesh khan","YS Chahal","PJ Cummins"};
	static String top10IccTeamNames[] ={"Australia","South Africa","Pakistan","New zealand","England","Sri lanka","Bangladesh","Afghanistan","West indies"};
	
public static void main(String[] cricket){
	System.out.println("THE IPL TEAM NAMES ARE ":+iplTeamNames.length);
	for(String iplTeamNames:iplTeamNames){
	System.out.println(iplTeamNames);
	}
	
	System.out.println("THE TOP 10 BATSMAN ARE :" +top10Batsman[0]+"\n"+top10Batsman[1]+"\n"+top10Batsman[2]+"\n"+top10Batsman[3]+"\n"+top10Batsman[4]+"\n"+top10Batsman[5]+"\n"+top10Batsman[6]+"\n"+top10Batsman[7]+"\n"+top10Batsman[8]+"\n"+top10Batsman[9]);
	System.out.println("\n");
	System.out.println("\n");
	System.out.println("THE TOP 10 BOWLERS ARE :" +top10Bowlers[0]+"\n"+top10Bowlers[1]+"\n"+top10Bowlers[2]+"\n"+top10Bowlers[3]+"\n"+top10Bowlers[4]+"\n"+top10Bowlers[5]+"\n"+top10Bowlers[6]+"\n"+top10Bowlers[7]+"\n"+top10Bowlers[8]+"\n"+top10Bowlers[9]);
	System.out.println("\n");
	System.out.println("\n");
	System.out.println("THE TOP 10 ICC TEAM NAMES :" +top10IccTeamNames[0]+ "\n"+top10IccTeamNames[1]+ "\n"+top10IccTeamNames[2]+ "\n"+top10IccTeamNames[3]+ "\n"+top10IccTeamNames[4]+ "\n"+top10IccTeamNames[5]+ "\n"+top10IccTeamNames[6]+ "\n"+top10IccTeamNames[7]+ "\n"+top10IccTeamNames[8]+ "\n"+top10IccTeamNames[9]);
}
}