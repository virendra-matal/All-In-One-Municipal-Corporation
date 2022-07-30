
package com.MunicipalCorporation.Model;


public class Birth_Registration {
    
    private String Date, Address, Mother_Name, Father_Name, Residential_Place, Hospital_Name, Date_Of_Birth, Sex, Child_Name, Applicant_Name, Relation_with_Child, Id_proof, Parent_Marriage_Certificate, Letter_from_Hospital, Parent_Birth_Certificate, Signature,Status;
    private int MCId, Birth_Registration_Id;

    public Birth_Registration() {
    }

    
    public Birth_Registration(String Date, String Address, String Mother_Name, String Father_Name, String Residential_Place, String Hospital_Name, String Date_Of_Birth, String Sex, String Child_Name, String Applicant_Name, String Relation_with_Child, String Id_proof, String Parent_Marriage_Certificate, String Letter_from_Hospital, String Parent_Birth_Certificate, String Signature) {
        this.Date = Date;
        this.Address = Address;
        this.Mother_Name = Mother_Name;
        this.Father_Name = Father_Name;
        this.Residential_Place = Residential_Place;
        this.Hospital_Name = Hospital_Name;
        this.Date_Of_Birth = Date_Of_Birth;
        this.Sex = Sex;
        this.Child_Name = Child_Name;
        this.Applicant_Name = Applicant_Name;
        this.Relation_with_Child = Relation_with_Child;
        this.Id_proof = Id_proof;
        this.Parent_Marriage_Certificate = Parent_Marriage_Certificate;
        this.Letter_from_Hospital = Letter_from_Hospital;
        this.Parent_Birth_Certificate = Parent_Birth_Certificate;
        this.Signature = Signature;
    }

    public Birth_Registration(String Date, String Address, String Mother_Name, String Father_Name, String Residential_Place, String Hospital_Name, String Date_Of_Birth, String Sex, String Child_Name, String Applicant_Name, String Relation_with_Child, String Id_proof, String Parent_Marriage_Certificate, String Letter_from_Hospital, String Parent_Birth_Certificate, String Signature, int MCId) {
        this.Date = Date;
        this.Address = Address;
        this.Mother_Name = Mother_Name;
        this.Father_Name = Father_Name;
        this.Residential_Place = Residential_Place;
        this.Hospital_Name = Hospital_Name;
        this.Date_Of_Birth = Date_Of_Birth;
        this.Sex = Sex;
        this.Child_Name = Child_Name;
        this.Applicant_Name = Applicant_Name;
        this.Relation_with_Child = Relation_with_Child;
        this.Id_proof = Id_proof;
        this.Parent_Marriage_Certificate = Parent_Marriage_Certificate;
        this.Letter_from_Hospital = Letter_from_Hospital;
        this.Parent_Birth_Certificate = Parent_Birth_Certificate;
        this.Signature = Signature;
        this.MCId = MCId;
    }

    public Birth_Registration(String Date, String Address, String Mother_Name, String Father_Name, String Residential_Place, String Hospital_Name, String Date_Of_Birth, String Sex, String Child_Name, String Applicant_Name, String Relation_with_Child, String Id_proof, String Parent_Marriage_Certificate, String Letter_from_Hospital, String Parent_Birth_Certificate, String Signature, int MCId, int Birth_Registration_Id) {
        this.Date = Date;
        this.Address = Address;
        this.Mother_Name = Mother_Name;
        this.Father_Name = Father_Name;
        this.Residential_Place = Residential_Place;
        this.Hospital_Name = Hospital_Name;
        this.Date_Of_Birth = Date_Of_Birth;
        this.Sex = Sex;
        this.Child_Name = Child_Name;
        this.Applicant_Name = Applicant_Name;
        this.Relation_with_Child = Relation_with_Child;
        this.Id_proof = Id_proof;
        this.Parent_Marriage_Certificate = Parent_Marriage_Certificate;
        this.Letter_from_Hospital = Letter_from_Hospital;
        this.Parent_Birth_Certificate = Parent_Birth_Certificate;
        this.Signature = Signature;
        this.MCId = MCId;
        this.Birth_Registration_Id = Birth_Registration_Id;
    }

    public Birth_Registration(String Date, String Address, String Mother_Name, String Father_Name, String Residential_Place, String Hospital_Name, String Date_Of_Birth, String Sex, String Child_Name, String Applicant_Name, String Relation_with_Child, String Id_proof, String Parent_Marriage_Certificate, String Letter_from_Hospital, String Parent_Birth_Certificate, String Signature, String Status, int MCId, int Birth_Registration_Id) {
        this.Date = Date;
        this.Address = Address;
        this.Mother_Name = Mother_Name;
        this.Father_Name = Father_Name;
        this.Residential_Place = Residential_Place;
        this.Hospital_Name = Hospital_Name;
        this.Date_Of_Birth = Date_Of_Birth;
        this.Sex = Sex;
        this.Child_Name = Child_Name;
        this.Applicant_Name = Applicant_Name;
        this.Relation_with_Child = Relation_with_Child;
        this.Id_proof = Id_proof;
        this.Parent_Marriage_Certificate = Parent_Marriage_Certificate;
        this.Letter_from_Hospital = Letter_from_Hospital;
        this.Parent_Birth_Certificate = Parent_Birth_Certificate;
        this.Signature = Signature;
        this.Status = Status;
        this.MCId = MCId;
        this.Birth_Registration_Id = Birth_Registration_Id;
    }
    
    
    
    
    


    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getMother_Name() {
        return Mother_Name;
    }

    public void setMother_Name(String Mother_Name) {
        this.Mother_Name = Mother_Name;
    }

    public String getFather_Name() {
        return Father_Name;
    }

    public void setFather_Name(String Father_Name) {
        this.Father_Name = Father_Name;
    }

    public String getResidential_Place() {
        return Residential_Place;
    }

    public void setResidential_Place(String Residential_Place) {
        this.Residential_Place = Residential_Place;
    }

    public String getHospital_Name() {
        return Hospital_Name;
    }

    public void setHospital_Name(String Hospital_Name) {
        this.Hospital_Name = Hospital_Name;
    }

    public String getDate_Of_Birth() {
        return Date_Of_Birth;
    }

    public void setDate_Of_Birth(String Date_Of_Birth) {
        this.Date_Of_Birth = Date_Of_Birth;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    public String getChild_Name() {
        return Child_Name;
    }

    public void setChild_Name(String Child_Name) {
        this.Child_Name = Child_Name;
    }

    public String getApplicant_Name() {
        return Applicant_Name;
    }

    public void setApplicant_Name(String Applicant_Name) {
        this.Applicant_Name = Applicant_Name;
    }

    public String getRelation_with_Child() {
        return Relation_with_Child;
    }

    public void setRelation_with_Child(String Relation_with_Child) {
        this.Relation_with_Child = Relation_with_Child;
    }

    public String getId_proof() {
        return Id_proof;
    }

    public void setId_proof(String Id_proof) {
        this.Id_proof = Id_proof;
    }

    public String getParent_Marriage_Certificate() {
        return Parent_Marriage_Certificate;
    }

    public void setParent_Marriage_Certificate(String Parent_Marriage_Certificate) {
        this.Parent_Marriage_Certificate = Parent_Marriage_Certificate;
    }

    public String getLetter_from_Hospital() {
        return Letter_from_Hospital;
    }

    public void setLetter_from_Hospital(String Letter_from_Hospital) {
        this.Letter_from_Hospital = Letter_from_Hospital;
    }

    public String getParent_Birth_Certificate() {
        return Parent_Birth_Certificate;
    }

    public void setParent_Birth_Certificate(String Parent_Birth_Certificate) {
        this.Parent_Birth_Certificate = Parent_Birth_Certificate;
    }

    public String getSignature() {
        return Signature;
    }

    public void setSignature(String Signature) {
        this.Signature = Signature;
    }

    public int getBirth_Registration_Id() {
        return Birth_Registration_Id;
    }

    public void setBirth_Registration_Id(int Birth_Registration_Id) {
        this.Birth_Registration_Id = Birth_Registration_Id;
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
