class Passport{
static String cprLoc;
static int dcdrloc;
static String given;
static String sur;
static String db;
static String emails;
static boolean isemailLoginSame;
static String loginId;
static String pwd;
static String confirmpwd;
static String hintques;
static String hintans;
static String captcha;

public static boolean createPassport(String cprLocation,int dcdrlocation,String givenName,String surname,String dob,String email,boolean isemailLoginSame, String loginId, String pwd, String confirmpwd, String hintques, String hintans, String captcha) {
boolean ispassportDataCreated = false;
cprLoc=cprLocation;
dcdrloc=dcdrlocation;
given=givenName;
sur=surname;
db=dob;
emails=email;
return ispassportDataCreated;

}
public static void getpassportDetails(){
System.out.println("cprLocation:" +cprLoc);
System.out.println("dcdrlocation:" +dcdrloc);
System.out.println("givenName:" +given);
System.out.println("surname:" +sur);
System.out.println("date of birth :" +db);
System.out.println("email:" +emails);
System.out.println("Email id is same as login id :" +isemailLoginSame);
System.out.println("loginId:" +loginId);
System.out.println("password:" +pwd);
System.out.println("confirmed password:" +confirmpwd);
System.out.println("hint quetion:" +hintques);
System.out.println("hint answer:" +hintans);
System.out.println("captcha:" +captcha);

}
}