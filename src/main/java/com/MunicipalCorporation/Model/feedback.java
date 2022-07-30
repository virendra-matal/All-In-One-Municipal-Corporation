
package com.MunicipalCorporation.Model;


public class feedback {
    private  String Complainant_name, Email, Feedback, Mobile_number,Feedback_date;
    private int F_Id, MCId;

    public feedback() {
    }

    public feedback(String Complainant_name, String Email, String Feedback, String Mobile_number, int MCId) {
        this.Complainant_name = Complainant_name;
        this.Email = Email;
        this.Feedback = Feedback;
        this.Mobile_number = Mobile_number;
        this.MCId = MCId;
    }
    
   

    public feedback(String Complainant_name, String Email, String Feedback, String Mobile_number, String Feedback_date, int F_Id) {
        this.Complainant_name = Complainant_name;
        this.Email = Email;
        this.Feedback = Feedback;
        this.Mobile_number = Mobile_number;
        this.Feedback_date = Feedback_date;
        this.F_Id = F_Id;
    }

    
    public String getComplainant_name() {
        return Complainant_name;
    }

    public void setComplainant_name(String Complainant_name) {
        this.Complainant_name = Complainant_name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getFeedback() {
        return Feedback;
    }

    public void setFeedback(String Feedback) {
        this.Feedback = Feedback;
    }

    public String getMobile_number() {
        return Mobile_number;
    }

    public void setMobile_number(String Mobile_number) {
        this.Mobile_number = Mobile_number;
    }

    public int getF_Id() {
        return F_Id;
    }

    public void setF_Id(int F_Id) {
        this.F_Id = F_Id;
    }

    public String getFeedback_date() {
        return Feedback_date;
    }

    public void setFeedback_date(String Feedback_date) {
        this.Feedback_date = Feedback_date;
    }

    public int getMCId() {
        return MCId;
    }

    public void setMCId(int MCId) {
        this.MCId = MCId;
    }

    

   
    
}
