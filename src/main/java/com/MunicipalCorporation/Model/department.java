package com.MunicipalCorporation.Model;

public class department {

    private String Dept_Name, Dept_Description, Head_Of_Dept, Designation, Email_Id;
    private int Dept_Id, MCId;

    public department() {
    }

    public department(String Dept_Name, String Dept_Description, String Head_Of_Dept, String Designation, String Email_Id, int Dept_Id) {
        this.Dept_Name = Dept_Name;
        this.Dept_Description = Dept_Description;
        this.Head_Of_Dept = Head_Of_Dept;
        this.Designation = Designation;
        this.Email_Id = Email_Id;
        this.Dept_Id = Dept_Id;
    }

    public String getDept_Name() {
        return Dept_Name;
    }

    public void setDept_Name(String Dept_Name) {
        this.Dept_Name = Dept_Name;
    }

    public String getDept_Description() {
        return Dept_Description;
    }

    public void setDept_Description(String Dept_Description) {
        this.Dept_Description = Dept_Description;
    }

    public String getHead_Of_Dept() {
        return Head_Of_Dept;
    }

    public void setHead_Of_Dept(String Head_Of_Dept) {
        this.Head_Of_Dept = Head_Of_Dept;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String Designation) {
        this.Designation = Designation;
    }

    public String getEmail_Id() {
        return Email_Id;
    }

    public void setEmail_Id(String Email_Id) {
        this.Email_Id = Email_Id;
    }

    public int getDept_Id() {
        return Dept_Id;
    }

    public void setDept_Id(int Dept_Id) {
        this.Dept_Id = Dept_Id;
    }

    public int getMCId() {
        return MCId;
    }

    public void setMCId(int MCId) {
        this.MCId = MCId;
    }

}
