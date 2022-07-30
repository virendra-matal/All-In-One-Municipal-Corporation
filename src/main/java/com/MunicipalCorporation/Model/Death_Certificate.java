
package com.MunicipalCorporation.Model;

public class Death_Certificate {
   
    private String Date, Address, Name_Of_Deceased, Residential_Place, Hospital_Name, Date_Of_Death, Sex, Applicant_Name, Relation_with_Person, Id_proof, Birth_Certificate_Of_Deceased, Medical_certificate, Adhar_Card_Of_Deceased, Copy_of_Ration_Card, Residensial_proof, Signature, Status;
    private int Death_Registration_Id, MCId;

    public Death_Certificate() {
    }

    public Death_Certificate(String Date, String Address, String Name_Of_Deceased, String Residential_Place, String Hospital_Name, String Date_Of_Death, String Sex, String Applicant_Name, String Relation_with_Person, String Id_proof, String Birth_Certificate_Of_Deceased, String Medical_certificate, String Adhar_Card_Of_Deceased, String Copy_of_Ration_Card, String Residensial_proof, String Signature, int Death_Registration_Id, int MCId) {
        this.Date = Date;
        this.Address = Address;
        this.Name_Of_Deceased = Name_Of_Deceased;
        this.Residential_Place = Residential_Place;
        this.Hospital_Name = Hospital_Name;
        this.Date_Of_Death = Date_Of_Death;
        this.Sex = Sex;
        this.Applicant_Name = Applicant_Name;
        this.Relation_with_Person = Relation_with_Person;
        this.Id_proof = Id_proof;
        this.Birth_Certificate_Of_Deceased = Birth_Certificate_Of_Deceased;
        this.Medical_certificate = Medical_certificate;
        this.Adhar_Card_Of_Deceased = Adhar_Card_Of_Deceased;
        this.Copy_of_Ration_Card = Copy_of_Ration_Card;
        this.Residensial_proof = Residensial_proof;
        this.Signature = Signature;
        this.Death_Registration_Id = Death_Registration_Id;
        this.MCId = MCId;
    }

    public Death_Certificate(String Date, String Address, String Name_Of_Deceased, String Residential_Place, String Hospital_Name, String Date_Of_Death, String Sex, String Applicant_Name, String Relation_with_Person, String Id_proof, String Birth_Certificate_Of_Deceased, String Medical_certificate, String Adhar_Card_Of_Deceased, String Copy_of_Ration_Card, String Residensial_proof, String Signature, int MCId) {
        this.Date = Date;
        this.Address = Address;
        this.Name_Of_Deceased = Name_Of_Deceased;
        this.Residential_Place = Residential_Place;
        this.Hospital_Name = Hospital_Name;
        this.Date_Of_Death = Date_Of_Death;
        this.Sex = Sex;
        this.Applicant_Name = Applicant_Name;
        this.Relation_with_Person = Relation_with_Person;
        this.Id_proof = Id_proof;
        this.Birth_Certificate_Of_Deceased = Birth_Certificate_Of_Deceased;
        this.Medical_certificate = Medical_certificate;
        this.Adhar_Card_Of_Deceased = Adhar_Card_Of_Deceased;
        this.Copy_of_Ration_Card = Copy_of_Ration_Card;
        this.Residensial_proof = Residensial_proof;
        this.Signature = Signature;
        this.MCId = MCId;
    }

    

    public Death_Certificate(String Date, String Address, String Name_Of_Deceased, String Residential_Place, String Hospital_Name, String Date_Of_Death, String Sex, String Applicant_Name, String Relation_with_Person, String Id_proof, String Birth_Certificate_Of_Deceased, String Medical_certificate, String Adhar_Card_Of_Deceased, String Copy_of_Ration_Card, String Residensial_proof, String Signature) {
        this.Date = Date;
        this.Address = Address;
        this.Name_Of_Deceased = Name_Of_Deceased;
        this.Residential_Place = Residential_Place;
        this.Hospital_Name = Hospital_Name;
        this.Date_Of_Death = Date_Of_Death;
        this.Sex = Sex;
        this.Applicant_Name = Applicant_Name;
        this.Relation_with_Person = Relation_with_Person;
        this.Id_proof = Id_proof;
        this.Birth_Certificate_Of_Deceased = Birth_Certificate_Of_Deceased;
        this.Medical_certificate = Medical_certificate;
        this.Adhar_Card_Of_Deceased = Adhar_Card_Of_Deceased;
        this.Copy_of_Ration_Card = Copy_of_Ration_Card;
        this.Residensial_proof = Residensial_proof;
        this.Signature = Signature;
    }

    public Death_Certificate(String Date, String Address, String Name_Of_Deceased, String Residential_Place, String Hospital_Name, String Date_Of_Death, String Sex, String Applicant_Name, String Relation_with_Person, String Id_proof, String Birth_Certificate_Of_Deceased, String Medical_certificate, String Adhar_Card_Of_Deceased, String Copy_of_Ration_Card, String Residensial_proof, String Signature, String Status, int Death_Registration_Id, int MCId) {
        this.Date = Date;
        this.Address = Address;
        this.Name_Of_Deceased = Name_Of_Deceased;
        this.Residential_Place = Residential_Place;
        this.Hospital_Name = Hospital_Name;
        this.Date_Of_Death = Date_Of_Death;
        this.Sex = Sex;
        this.Applicant_Name = Applicant_Name;
        this.Relation_with_Person = Relation_with_Person;
        this.Id_proof = Id_proof;
        this.Birth_Certificate_Of_Deceased = Birth_Certificate_Of_Deceased;
        this.Medical_certificate = Medical_certificate;
        this.Adhar_Card_Of_Deceased = Adhar_Card_Of_Deceased;
        this.Copy_of_Ration_Card = Copy_of_Ration_Card;
        this.Residensial_proof = Residensial_proof;
        this.Signature = Signature;
        this.Status = Status;
        this.Death_Registration_Id = Death_Registration_Id;
        this.MCId = MCId;
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

    public String getName_Of_Deceased() {
        return Name_Of_Deceased;
    }

    public void setName_Of_Deceased(String Name_Of_Deceased) {
        this.Name_Of_Deceased = Name_Of_Deceased;
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

    public String getDate_Of_Death() {
        return Date_Of_Death;
    }

    public void setDate_Of_Death(String Date_Of_Death) {
        this.Date_Of_Death = Date_Of_Death;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    public String getApplicant_Name() {
        return Applicant_Name;
    }

    public void setApplicant_Name(String Applicant_Name) {
        this.Applicant_Name = Applicant_Name;
    }

    public String getRelation_with_Person() {
        return Relation_with_Person;
    }

    public void setRelation_with_Person(String Relation_with_Person) {
        this.Relation_with_Person = Relation_with_Person;
    }

    public String getId_proof() {
        return Id_proof;
    }

    public void setId_proof(String Id_proof) {
        this.Id_proof = Id_proof;
    }

    public String getBirth_Certificate_Of_Deceased() {
        return Birth_Certificate_Of_Deceased;
    }

    public void setBirth_Certificate_Of_Deceased(String Birth_Certificate_Of_Deceased) {
        this.Birth_Certificate_Of_Deceased = Birth_Certificate_Of_Deceased;
    }

    public String getMedical_certificate() {
        return Medical_certificate;
    }

    public void setMedical_certificate(String Medical_certificate) {
        this.Medical_certificate = Medical_certificate;
    }

    public String getAdhar_Card_Of_Deceased() {
        return Adhar_Card_Of_Deceased;
    }

    public void setAdhar_Card_Of_Deceased(String Adhar_Card_Of_Deceased) {
        this.Adhar_Card_Of_Deceased = Adhar_Card_Of_Deceased;
    }

    public String getCopy_of_Ration_Card() {
        return Copy_of_Ration_Card;
    }

    public void setCopy_of_Ration_Card(String Copy_of_Ration_Card) {
        this.Copy_of_Ration_Card = Copy_of_Ration_Card;
    }

    public String getResidensial_proof() {
        return Residensial_proof;
    }

    public void setResidensial_proof(String Residensial_proof) {
        this.Residensial_proof = Residensial_proof;
    }

    public String getSignature() {
        return Signature;
    }

    public void setSignature(String Signature) {
        this.Signature = Signature;
    }

    public int getDeath_Registration_Id() {
        return Death_Registration_Id;
    }

    public void setDeath_Registration_Id(int Death_Registration_Id) {
        this.Death_Registration_Id = Death_Registration_Id;
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
