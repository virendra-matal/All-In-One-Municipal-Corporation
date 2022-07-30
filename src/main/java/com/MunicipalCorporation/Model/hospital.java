
package com.MunicipalCorporation.Model;


public class hospital {
    private String Name_Address_Hospital, Contact_No;
    private int Hospital_Id ,MCId;

    public hospital() {
    }

    
    
    public hospital(String Name_Address_Hospital, String Contact_No, int Hospital_Id) {
        this.Name_Address_Hospital = Name_Address_Hospital;
        this.Contact_No = Contact_No;
        this.Hospital_Id = Hospital_Id;
    }

    public String getName_Address_Hospital() {
        return Name_Address_Hospital;
    }

    public void setName_Address_Hospital(String Name_Address_Hospital) {
        this.Name_Address_Hospital = Name_Address_Hospital;
    }

    public String getContact_No() {
        return Contact_No;
    }

    public void setContact_No(String Contact_No) {
        this.Contact_No = Contact_No;
    }

    public int getHospital_Id() {
        return Hospital_Id;
    }

    public void setHospital_Id(int Hospital_Id) {
        this.Hospital_Id = Hospital_Id;
    }

    public int getMCId() {
        return MCId;
    }

    public void setMCId(int MCId) {
        this.MCId = MCId;
    }
    
    
    
    
}
