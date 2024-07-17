class Metro{
	static int metroNumber = 635;
	static String metroLine = "Blue";
	static String city = "Bangalore";
	static String startingPoint = "challagatta";
	static String endPoint = "Whitefield";
	static String customerSource = "Kengeri";
	static String customerDestination = "Magadi Road";
	static String price = "15/-";
	static String time = "10:50 AM";
	static boolean ismetroArrivedCorrectTime = true; 
	public static void main (String watch[]){
	System.out.println("WELCOME TO THE METRO PAGE" );
	System.out.println("------------------------------);
	System.out.println("The metro number is : " +metroNumber);
	System.out.println("The metro line is : " +metroLine);
	System.out.println("Which city is chossen for the metro travel: " +city);
	System.out.println("Metro starting point is : " +startingPoint);
	System.out.println("Metro end point is : " +endPoint);
	System.out.println("Traveller source point is : " +customerSource);
	System.out.println("Traveller destination point is : " +customerDestination);
	System.out.println("The price of the journey is  : " +price);
	System.out.println("The time is : " +time);
	System.out.println("Is metro arrived at correct time at the station : " +ismetroArrivedCorrectTime);
	System.out.println("--------------------------------------------------------");
}
}