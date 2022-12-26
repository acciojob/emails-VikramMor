package com.driver;

public class Email {

    private String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String oldPassword, String newPassword){

        String SPECIAL_CHARACTERS = "!,#,$,%,^,&,*,|,@";

        if (this.password.equals(oldPassword)  && password.length() >= 8)
        {
            for (int i = 0; i < password.length() - 1; i++)
            {
                if (Character.isUpperCase(password.charAt(i)) && Character.isLowerCase(password.charAt(i)) && Character.isDigit(password.charAt(i)) && SPECIAL_CHARACTERS.contains(password))
                {
                    this.password = newPassword;
                }
            }
        }
    }
}
