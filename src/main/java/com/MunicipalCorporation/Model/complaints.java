
package com.MunicipalCorporation.Model;


public class complaints {
    private String Type_Of_Complaint, Ward, Complainant_Name, Complaint_Description, Location, Complaint_date, Response_date, Mobile_number, Image, Status, Admin_responce; 
    private int Complaint_Id,complaintby, MCId;

    public complaints() {
    }
    

    public complaints(String Type_Of_Complaint, int complaintby, String Ward, String Complainant_Name, String Complaint_Description, String Location, String Complaint_date, String Mobile_number, String Image, String Status, int Complaint_Id) {
        this.Type_Of_Complaint = Type_Of_Complaint;
        this.complaintby = complaintby;
        this.Ward = Ward;
        this.Complainant_Name = Complainant_Name;
        this.Complaint_Description = Complaint_Description;
        this.Location = Location;
        this.Complaint_date = Complaint_date;
        this.Mobile_number = Mobile_number;
        this.Image = Image;
        this.Status = Status;
        this.Complaint_Id = Complaint_Id;
    }

    public complaints(String Type_Of_Complaint, String Ward, String Complainant_Name, String Complaint_Description, String Location, String Complaint_date, String Mobile_number, String Image, String Status, String Admin_responce, int Complaint_Id) {
        this.Type_Of_Complaint = Type_Of_Complaint;
        this.Ward = Ward;
        this.Complainant_Name = Complainant_Name;
        this.Complaint_Description = Complaint_Description;
        this.Location = Location;
        this.Complaint_date = Complaint_date;
        this.Mobile_number = Mobile_number;
        this.Image = Image;
        this.Status = Status;
        this.Admin_responce = Admin_responce;
        this.Complaint_Id = Complaint_Id;
    }
    
    

//    public complaints(String Type_Of_Complaint, int complaintby, String Ward, String Complainant_Name, String Complaint_Description, String Location, String Complaint_date, String Mobile_number, String Image, String Status) {
//        this.Type_Of_Complaint = Type_Of_Complaint;
//        this.complaintby = complaintby;
//        this.Ward = Ward;
//        this.Complainant_Name = Complainant_Name;
//        this.Complaint_Description = Complaint_Description;
//        this.Location = Location;
//        this.Complaint_date = Complaint_date;
//        this.Mobile_number = Mobile_number;
//        this.Image = Image;
//        this.Status = Status;
//    }

    public complaints(String Type_Of_Complaint, String Ward, String Complainant_Name, String Complaint_Description, String Location, String Complaint_date, String Mobile_number, String Image, String Status, int complaintby, int MCId) {
        this.Type_Of_Complaint = Type_Of_Complaint;
        this.Ward = Ward;
        this.Complainant_Name = Complainant_Name;
        this.Complaint_Description = Complaint_Description;
        this.Location = Location;
        this.Complaint_date = Complaint_date;
        this.Mobile_number = Mobile_number;
        this.Image = Image;
        this.Status = Status;
        this.complaintby = complaintby;
        this.MCId = MCId;
    }
    
    

    public complaints(String Mobile_number, int Complaint_Id) {
        this.Mobile_number = Mobile_number;
        this.Complaint_Id = Complaint_Id;
    }
    

    public complaints(String Type_Of_Complaint, int complaintby, String Ward, String Complainant_Name, String Complaint_Description, String Location, String Complaint_date, String Response_date, String Mobile_number, String Image, String Status, int Complaint_Id) {
        this.Type_Of_Complaint = Type_Of_Complaint;
        this.complaintby = complaintby;
        this.Ward = Ward;
        this.Complainant_Name = Complainant_Name;
        this.Complaint_Description = Complaint_Description;
        this.Location = Location;
        this.Complaint_date = Complaint_date;
        this.Response_date = Response_date;
        this.Mobile_number = Mobile_number;
        this.Image = Image;
        this.Status = Status;
        this.Complaint_Id = Complaint_Id;
    }

    public complaints(String Type_Of_Complaint, String Ward, String Complainant_Name, String Complaint_Description, String Location, String Complaint_date, String Response_date, String Mobile_number, String Image, String Status, String Admin_responce, int Complaint_Id, int complaintby) {
        this.Type_Of_Complaint = Type_Of_Complaint;
        this.Ward = Ward;
        this.Complainant_Name = Complainant_Name;
        this.Complaint_Description = Complaint_Description;
        this.Location = Location;
        this.Complaint_date = Complaint_date;
        this.Response_date = Response_date;
        this.Mobile_number = Mobile_number;
        this.Image = Image;
        this.Status = Status;
        this.Admin_responce = Admin_responce;
        this.Complaint_Id = Complaint_Id;
        this.complaintby = complaintby;
    }

    
    
    

    public int getComplaintby() {
        return complaintby;
    }

    public void setComplaintby(int complaintby) {
        this.complaintby = complaintby;
    }
   
    public String getType_Of_Complaint() {
        return Type_Of_Complaint;
    }

    public void setType_Of_Complaint(String Type_Of_Complaint) {
        this.Type_Of_Complaint = Type_Of_Complaint;
    }

    public String getWard() {
        return Ward;
    }

    public void setWard(String Ward) {
        this.Ward = Ward;
    }

    public String getComplainant_Name() {
        return Complainant_Name;
    }

    public void setComplainant_Name(String Complainant_Name) {
        this.Complainant_Name = Complainant_Name;
    }

    public String getComplaint_Description() {
        return Complaint_Description;
    }

    public void setComplaint_Description(String Complaint_Description) {
        this.Complaint_Description = Complaint_Description;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public String getComplaint_date() {
        return Complaint_date;
    }

    public void setComplaint_date(String Complaint_date) {
        this.Complaint_date = Complaint_date;
    }

    public String getResponse_date() {
        return Response_date;
    }

    public void setResponse_date(String Response_date) {
        this.Response_date = Response_date;
    }

    
    
    public String getMobile_number() {
        return Mobile_number;
    }

    public void setMobile_number(String Mobile_number) {
        this.Mobile_number = Mobile_number;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String Image) {
        this.Image = Image;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public int getComplaint_Id() {
        return Complaint_Id;
    }

    public void setComplaint_Id(int Complaint_Id) {
        this.Complaint_Id = Complaint_Id;
    }

    public String getAdmin_responce() {
        return Admin_responce;
    }

    public void setAdmin_responce(String Admin_responce) {
        this.Admin_responce = Admin_responce;
    }

    public int getMCId() {
        return MCId;
    }

    public void setMCId(int MCId) {
        this.MCId = MCId;
    }

   
    
}
