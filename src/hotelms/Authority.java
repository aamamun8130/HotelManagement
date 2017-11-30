
package hotelms;

public class Authority {
        private String First_Name;
        private String Last_Name;
        private String User_Name;
        private String Password;
        private String Re_Type_pass;

    public Authority(String First_Name, String Last_Name, String User_Name, String Password, String Re_Type_pass) {
        this.First_Name = First_Name;
        this.Last_Name = Last_Name;
        this.User_Name = User_Name;
        this.Password = Password;
        this.Re_Type_pass = Re_Type_pass;
    }

    public String getFirst_Name() {
        return First_Name;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public String getUser_Name() {
        return User_Name;
    }

    public String getPassword() {
        return Password;
    }

    public String getRe_Type_pass() {
        return Re_Type_pass;
    }
        
    
}
