
package com.MunicipalCorporation.Model;

public class Ganpati_Visarjan {
    
    private String Type_of_Registration, Name, Mobile_Number, Address, Ward, Place, Date_and_Time, Signature,Status;
    private int Ganapati_Visarjan_Id, MCId;

    public Ganpati_Visarjan() {
    }

    public Ganpati_Visarjan(String Type_of_Registration, String Name, String Mobile_Number, String Address, String Ward, String Place, String Date_and_Time, String Signature) {
        this.Type_of_Registration = Type_of_Registration;
        this.Name = Name;
        this.Mobile_Number = Mobile_Number;
        this.Address = Address;
        this.Ward = Ward;
        this.Place = Place;
        this.Date_and_Time = Date_and_Time;
        this.Signature = Signature;
    }

    public Ganpati_Visarjan(String Type_of_Registration, String Name, String Mobile_Number, String Address, String Ward, String Place, String Date_and_Time, String Signature, int MCId) {
        this.Type_of_Registration = Type_of_Registration;
        this.Name = Name;
        this.Mobile_Number = Mobile_Number;
        this.Address = Address;
        this.Ward = Ward;
        this.Place = Place;
        this.Date_and_Time = Date_and_Time;
        this.Signature = Signature;
        this.MCId = MCId;
    }

    public Ganpati_Visarjan(String Type_of_Registration, String Name, String Mobile_Number, String Address, String Ward, String Place, String Date_and_Time, String Signature, int Ganapati_Visarjan_Id, int MCId) {
        this.Type_of_Registration = Type_of_Registration;
        this.Name = Name;
        this.Mobile_Number = Mobile_Number;
        this.Address = Address;
        this.Ward = Ward;
        this.Place = Place;
        this.Date_and_Time = Date_and_Time;
        this.Signature = Signature;
        this.Ganapati_Visarjan_Id = Ganapati_Visarjan_Id;
        this.MCId = MCId;
    }

    public Ganpati_Visarjan(String Type_of_Registration, String Name, String Mobile_Number, String Address, String Ward, String Place, String Date_and_Time, String Signature, String Status, int Ganapati_Visarjan_Id, int MCId) {
        this.Type_of_Registration = Type_of_Registration;
        this.Name = Name;
        this.Mobile_Number = Mobile_Number;
        this.Address = Address;
        this.Ward = Ward;
        this.Place = Place;
        this.Date_and_Time = Date_and_Time;
        this.Signature = Signature;
        this.Status = Status;
        this.Ganapati_Visarjan_Id = Ganapati_Visarjan_Id;
        this.MCId = MCId;
    }

    
    

    public String getType_of_Registration() {
        return Type_of_Registration;
    }

    public void setType_of_Registration(String Type_of_Registration) {
        this.Type_of_Registration = Type_of_Registration;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getMobile_Number() {
        return Mobile_Number;
    }

    public void setMobile_Number(String Mobile_Number) {
        this.Mobile_Number = Mobile_Number;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getWard() {
        return Ward;
    }

    public void setWard(String Ward) {
        this.Ward = Ward;
    }

    public String getPlace() {
        return Place;
    }

    public void setPlace(String Place) {
        this.Place = Place;
    }

    public String getDate_and_Time() {
        return Date_and_Time;
    }

    public void setDate_and_Time(String Date_and_Time) {
        this.Date_and_Time = Date_and_Time;
    }

    public String getSignature() {
        return Signature;
    }

    public void setSignature(String Signature) {
        this.Signature = Signature;
    }

    public int getGanapati_Visarjan_Id() {
        return Ganapati_Visarjan_Id;
    }

    public void setGanapati_Visarjan_Id(int Ganapati_Visarjan_Id) {
        this.Ganapati_Visarjan_Id = Ganapati_Visarjan_Id;
    }

    public int getMCId() {
        return MCId;
    }

    public void setMCId(int MCId) {
        this.MCId = MCId;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
    
    
}
