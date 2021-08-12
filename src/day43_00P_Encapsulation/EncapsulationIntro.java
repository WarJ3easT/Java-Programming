package day43_00P_Encapsulation;

public class EncapsulationIntro {

    private String username = "Cybertek",
    password = "Cybertek123";

    public String getUsername(){ return username; }

    public String getPassword(){ return password; }

    public void setUsername(String username){
        if(username.length()< 5){
            System.out.println("User name at least 5 characters");
        }
        this.username = username;
    }
    public void setPassword(String password){
        if (password.length()<8){
            System.out.println("Password at least 8 characters");
        }
        this.password = password;
    }



}
