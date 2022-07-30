
package com.MunicipalCorporation.Model;



public class chatbox {
    
    private int Chat_Id,Sender_Id, Receiver_Id, UserID, MCId;
    private String  Message, Date,U_Name;
//    private string ;
    public chatbox() {
    }

//    public chatbox(int Chat_Id, int Sender_Id, int Receiver_Id, String Message) {
//        this.Chat_Id = Chat_Id;
//        this.Sender_Id = Sender_Id;
//        this.Receiver_Id = Receiver_Id;
//        this.Message = Message;
//    }

    public chatbox(int Sender_Id, int Receiver_Id, int MCId, String Message) {
        this.Sender_Id = Sender_Id;
        this.Receiver_Id = Receiver_Id;
        this.MCId = MCId;
        this.Message = Message;
    }
    
    

    public chatbox(int Sender_Id, int Receiver_Id, String Message) {
        this.Sender_Id = Sender_Id;
        this.Receiver_Id = Receiver_Id;
        this.Message = Message;
    }

    public chatbox(int Chat_Id, int Sender_Id, int Receiver_Id, String Message, String Date) {
        this.Chat_Id = Chat_Id;
        this.Sender_Id = Sender_Id;
        this.Receiver_Id = Receiver_Id;
        this.Message = Message;
        this.Date = Date;
    }

    public chatbox(int UserID, String Date, String U_Name) {
        this.UserID = UserID;
        this.Date = Date;
        this.U_Name = U_Name;
    }
    
    
    
    public int getChat_Id() {
        return Chat_Id;
    }

    public void setChat_Id(int Chat_Id) {
        this.Chat_Id = Chat_Id;
    }

    public int getSender_Id() {
        return Sender_Id;
    }

    public void setSender_Id(int Sender_Id) {
        this.Sender_Id = Sender_Id;
    }

    public int getReceiver_Id() {
        return Receiver_Id;
    }

    public void setReceiver_Id(int Receiver_Id) {
        this.Receiver_Id = Receiver_Id;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String Message) {
        this.Message = Message;
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int UserID) {
        this.UserID = UserID;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getU_Name() {
        return U_Name;
    }

    public void setU_Name(String U_Name) {
        this.U_Name = U_Name;
    }

    public int getMCId() {
        return MCId;
    }

    public void setMCId(int MCId) {
        this.MCId = MCId;
    }
    
    
    
}
