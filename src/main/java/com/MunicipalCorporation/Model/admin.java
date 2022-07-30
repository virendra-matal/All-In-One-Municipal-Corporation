
package com.MunicipalCorporation.Model;


public class admin {
    private String Admin_Name, Admin_Username, Admin_Password, Municipal_Corporation, Mobile_Number, Admin_Email, Admin_fax, Admin_Gender;
    private int Admin_Id, Admin_Age;

    public admin() {
    }

    public admin(String Admin_Name, String Admin_Username, String Admin_Password, String Municipal_Corporation, String Mobile_Number, String Admin_Email, String Admin_fax, String Admin_Gender, int Admin_Id, int Admin_Age) {
        this.Admin_Name = Admin_Name;
        this.Admin_Username = Admin_Username;
        this.Admin_Password = Admin_Password;
        this.Municipal_Corporation = Municipal_Corporation;
        this.Mobile_Number = Mobile_Number;
        this.Admin_Email = Admin_Email;
        this.Admin_fax = Admin_fax;
        this.Admin_Gender = Admin_Gender;
        this.Admin_Id = Admin_Id;
        this.Admin_Age = Admin_Age;
    }

    public String getAdmin_Name() {
        return Admin_Name;
    }

    public void setAdmin_Name(String Admin_Name) {
        this.Admin_Name = Admin_Name;
    }

    public String getAdmin_Username() {
        return Admin_Username;
    }

    public void setAdmin_Username(String Admin_Username) {
        this.Admin_Username = Admin_Username;
    }

    public String getAdmin_Password() {
        return Admin_Password;
    }

    public void setAdmin_Password(String Admin_Password) {
        this.Admin_Password = Admin_Password;
    }

    public String getMunicipal_Corporation() {
        return Municipal_Corporation;
    }

    public void setMunicipal_Corporation(String Municipal_Corporation) {
        this.Municipal_Corporation = Municipal_Corporation;
    }

    public String getMobile_Number() {
        return Mobile_Number;
    }

    public void setMobile_Number(String Mobile_Number) {
        this.Mobile_Number = Mobile_Number;
    }

    public String getAdmin_Email() {
        return Admin_Email;
    }

    public void setAdmin_Email(String Admin_Email) {
        this.Admin_Email = Admin_Email;
    }

    public String getAdmin_fax() {
        return Admin_fax;
    }

    public void setAdmin_fax(String Admin_fax) {
        this.Admin_fax = Admin_fax;
    }

    public String getAdmin_Gender() {
        return Admin_Gender;
    }

    public void setAdmin_Gender(String Admin_Gender) {
        this.Admin_Gender = Admin_Gender;
    }

    public int getAdmin_Id() {
        return Admin_Id;
    }

    public void setAdmin_Id(int Admin_Id) {
        this.Admin_Id = Admin_Id;
    }

    public int getAdmin_Age() {
        return Admin_Age;
    }

    public void setAdmin_Age(int Admin_Age) {
        this.Admin_Age = Admin_Age;
    }
    
    
}
