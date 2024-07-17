class Aeroplane{
	static int flightNumber = 535;
	static String flightName = "AirIndia";
	static String sourcePoint = "Mysore";
	static String destinationPoint = "Mumbai";
	static String price = "75,000/-";
	static String departureTime = "10:50 AM";
	static String arrivedTime = "02:50 PM";
	static boolean isflightArrivedCorrectTime = true; 
	public static void main (String watch[]){
	System.out.println("WELCOME TO THE AEROPLANE PAGE" );
	System.out.println("---------------------------------------");
	System.out.println("The flight number is : " +flightNumber);
	System.out.println("The Name of the flight is : " +flightName);
	System.out.println("The starting point of the flight is : " +sourcePoint);
	System.out.println("The destinations point of the flight is : " +destinationPoint);
	System.out.println("The price of the journey is  : " +price);
	System.out.println("The departural time of the flight at the sourcePoint is : " +departureTime);
	System.out.println("The arrival time at the Destination is : " +arrivedTime);
	System.out.println("Is flight arrived at the destination at prefered time : " +isflightArrivedCorrectTime);
	System.out.println("--------------------------------------------------------");
}
}