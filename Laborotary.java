class Laborotary{
static String name="NewLaborotary";
static String userName="Manu";
static String LaborotaryEquipments[]={null,null,null,null,null,null,null,null};
static int index;
public static boolean createLaborotaryEquipments(String gymEquipment){
 boolean isLaborotaryEquipmentsName=false;
 if(LaborotaryEquipments!=null){
 LaborotaryEquipments[index]=LaborotaryEquipment;
 index++;
 isLaborotaryEquipmentsNameEquipmentsName=true;
 }else{
 
 System.out.println("the given name is not equipments name ,give currect name");
 }
 return isLaborotaryEquipmentsName;
 
 }
 public static void getLaborotaryEquipments(){
	 for(String LaborotaryEquipments: LaborotaryEquipments){
		 System.out.println(LaborotaryEquipments);
	 }
	 return;
 }

}