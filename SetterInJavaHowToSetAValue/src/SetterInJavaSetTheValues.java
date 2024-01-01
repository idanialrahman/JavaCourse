//In this is can set the Setter so i can set the Value in the main Method:


public class SetterInJavaSetTheValues {
    private String UserName;
    private String TPassword;
    private long MobileNumber;

    public void setUserName(String UName) {
        UserName = UName;
    }

    public void setTPassword(String Password) {
        TPassword = Password; // Corrected assignment
    }
    public String getTPassword() {
        return TPassword;
    }
    public void setMobileNumber(long mobileNumber) {
        MobileNumber = mobileNumber;
    }

    public String getUserName() {
        return UserName;
    }

    public long getMobileNumber() {
        return MobileNumber;
    }




    public static void main(String[] args) {
        SetterInJavaSetTheValues setValues = new SetterInJavaSetTheValues();
        setValues.setMobileNumber(8909989);
        setValues.setUserName("rdanial");
        setValues.setTPassword("ion90");

        System.out.println(setValues.getMobileNumber());
        System.out.println(setValues.getTPassword());
        System.out.println(setValues.getUserName());
    }
}
