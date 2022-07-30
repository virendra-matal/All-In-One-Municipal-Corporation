package com.MunicipalCorporation.Model;


public class user {
    
    private  String U_Name, Username, Password, Mobile_Number, City, State, Area, Municipal_corp_name;
    private int Age , UserID, MCId;

    public user() {
    }

//    public user(String U_Name, String Username, String Password, String Mobile_Number, String City, String State, String Area, int Age) {
//        this.U_Name = U_Name;
//        this.Username = Username;
//        this.Password = Password;
//        this.Mobile_Number = Mobile_Number;
//        this.City = City;
//        this.State = State;
//        this.Area = Area;
//        this.Age = Age;
//    }

    public user(String U_Name, String Username, String Password, String Mobile_Number, String City, String State, String Area, String Municipal_corp_name, int Age, int MCId) {
        this.U_Name = U_Name;
        this.Username = Username;
        this.Password = Password;
        this.Mobile_Number = Mobile_Number;
        this.City = City;
        this.State = State;
        this.Area = Area;
        this.Municipal_corp_name = Municipal_corp_name;
        this.Age = Age;
        this.MCId = MCId;
    }
    
    

    public user(String U_Name, String Username, String Password, String Mobile_Number, String City, String State, String Area, int Age, int UserID) {
        this.U_Name = U_Name;
        this.Username = Username;
        this.Password = Password;
        this.Mobile_Number = Mobile_Number;
        this.City = City;
        this.State = State;
        this.Area = Area;
        this.Age = Age;
        this.UserID = UserID;
    }
    

    public String getU_Name() {
        return U_Name;
    }

    public void setU_Name(String U_Name) {
        this.U_Name = U_Name;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getMobile_Number() {
        return Mobile_Number;
    }

    public void setMobile_Number(String Mobile_Number) {
        this.Mobile_Number = Mobile_Number;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int UserID) {
        this.UserID = UserID;
    }

    public String getMunicipal_corp_name() {
        return Municipal_corp_name;
    }

    public void setMunicipal_corp_name(String Municipal_corp_name) {
        this.Municipal_corp_name = Municipal_corp_name;
    }

    public int getMCId() {
        return MCId;
    }

    public void setMCId(int MCId) {
        this.MCId = MCId;
    }
    
    
   
}
