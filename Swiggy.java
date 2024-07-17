class Swiggy{
public static double takeOrder(String foodName){
if(foodName=="palav"){
   return 100.00;
}
if(foodName=="savige uppit"){
   return 80.00;
}
if(foodName=="veg combo"){
   return 290.00;
}
if(foodName=="masala dosa"){
   return 60.00;
}
if(foodName=="jamoon"){
    return 20.00;
}
if(foodName=="kesari bath"){
   return 50.00;
}
if(foodName=="Matter paneer"){
   return 169.00;
}
if(foodName=="paneer korma"){
  return 170.00;
}
if(foodName=="egg bhurji"){
  return 115.00;
}
if(foodName=="chicken curry"){
  return 180.00;
}
if(foodName=="Mutton Korma"){
return 220.00;
}
if(foodName=="fish Curry"){
return 180.00;
}
if(foodName=="tawa Roti"){
return 20.00;
}
if(foodName==" Plain Rice"){
return 65.00;
}
if(foodName=="veg pulao"){
return 115.00;
}
if(foodName=="veg biryani"){
return 120.00;
}
if(foodName=="veg manchow soup"){
return 99.00;
}
if(foodName=="ChillinPaneer"){
return 169.00;
}
else{
System.out.println(foodName+"Not found");
}
return 0.00;
}
}
