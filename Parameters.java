public class Parameters {
    public static void main(String[] args) {
        
        String emailId = "vishwa@gmail.com";
        String content = "Hi, this is Vishwas learning java in Xworkz";
        long mobNum = 1899654258;
        String name = "Vishwas";
        String countryCode = "+91";
        String password = "vishwa@123";

        email(emailId,content);
        System.out.println("\n");
        phoneCall(mobNum,name,countryCode);
        System.out.println("\n");
        login(emailId,password);
    }
    public static void email(String emailId,String content){
        
        System.out.println("From : "+ emailId + "\n" + content);

    }
    public static void phoneCall(long mobNum, String name, String countryCode){

        System.out.println("Details of person : " + name + " : " + countryCode+mobNum);

    }
    public static void login(String emailId, String password){

        System.out.println("Login Details : \n emailId :" + emailId + "\n" + " password :" + password );

    }
}
