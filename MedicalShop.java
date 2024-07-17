class MedicalShop{
	//Datatypes ref = value;
	static String name = "Sri Venkateshwara chemist and drugist";
	static String tabletsNames[] = {"Dolowin plus" , "Aspirine","Haloset","Eye drops ","Capsules"};
	public static void main(String medi[]){
		System.out.println("-------------MAIN STARTED-----------");
		System.out.println("Welcome to" +name);
		System.out.println("The Available tablets are");
		for(int index = 0; index<=tabletsNames.length-1;index++)
		{
			System.out.println("tabletsNames[index]");
		}
		for(String tablet:tabletsNames){
			System.out.println(tablet);
		}
		System.out.println("-------------MAIN ENDED-----------");
		
	}
}