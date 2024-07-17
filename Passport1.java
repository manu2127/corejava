class Passport{

public static boolean createPassport(String cprLocation,int dcdrlocation,String givenName,String surname,String dob,String email,boolean isemailLoginSame, String loginId, String pwd, String confirmpwd, String hintques, String hintans, String captcha) {
boolean ispassportDataCreated = false;
System.out.println("cprLocation:" +cprLocation);
System.out.println("dcdrlocation:" +dcdrlocation);
System.out.println("givenName:" +givenName);
System.out.println("surname:" +surname);
System.out.println("date of birth :" +dob);
System.out.println("email:" +email);
System.out.println("Email id is same as login id :" +isemailLoginSame);
System.out.println("loginId:" +loginId);
System.out.println("password:" +pwd);
System.out.println("confirmed password:" +confirmpwd);
System.out.println("hint quetion:" +hintques);
System.out.println("hint answer:" +hintans);
System.out.println("captcha:" +captcha);

return ispassportDataCreated;
}
} 