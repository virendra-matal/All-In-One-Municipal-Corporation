

package com.MunicipalCorporation.Model;



public class Municipal_Corporation {
    
    private int MCId;
    private String Mc_name, Commissioner_name, Area, Address, Contact, Gmail;

    public Municipal_Corporation() {
    }

    public Municipal_Corporation(int MCId, String Mc_name, String Commissioner_name, String Area, String Address, String Contact, String Gmail) {
        this.MCId = MCId;
        this.Mc_name = Mc_name;
        this.Commissioner_name = Commissioner_name;
        this.Area = Area;
        this.Address = Address;
        this.Contact = Contact;
        this.Gmail = Gmail;
    }
    
    

    public int getMCId() {
        return MCId;
    }

    public void setMCId(int MCId) {
        this.MCId = MCId;
    }

    public String getMc_name() {
        return Mc_name;
    }

    public void setMc_name(String Mc_name) {
        this.Mc_name = Mc_name;
    }

    public String getCommissioner_name() {
        return Commissioner_name;
    }

    public void setCommissioner_name(String Commissioner_name) {
        this.Commissioner_name = Commissioner_name;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String Contact) {
        this.Contact = Contact;
    }

    public String getGmail() {
        return Gmail;
    }

    public void setGmail(String Gmail) {
        this.Gmail = Gmail;
    }
    
    
}
