
package com.MunicipalCorporation.Model;

public class Marriage_Registration {
    
    
    private String Marriage_Date, Ward, Marriage_Place, Marriage_Address, Marriage_City, Marriage_Country, Husband_Name, Husband_Religion_by_Birth, Husband_Religion_by_Adoption, Husband_Date_of_Birth, Husband_Status_at_marriage, Husband_Occupation, Husband_Mobile_Number, Husband_Email, Husband_Address, Husband_City, Husband_Country; 
    private String Wife_Name, Wife_Religion_by_Birth, Wife_Religion_by_Adoption, Wife_Date_of_Birth, Wife_Status_at_marriage, Wife_Occupation, Wife_Mobile_Number, Wife_Email, Wife_Address, Wife_City, Wife_Country; 
    private String Witness_Name, Witness_Relation_With_Couple, Witness_Occupation, Witness_Mobile_Number, Witness_Email, Witness_Address, Witness_City, Witness_Country;
    private String Priest_Name, Priest_Religion, Priest_Date_of_Birth, Priest_Occupation,Priest_Mobile_Number, Priest_Email, Priest_Address, Priest_City, Priest_Country;
    private String Bride_Birth_Certificate, Bride_Aadhar_Card, Photographs_Bride, Bridegroom_Birth_Certificate, Bridegroom_Aadhar_Card, Photographs_Bridegroom, Witness_Aadhar_Card, Witness_Election_Card, Wedding_card, Signature_Priest, Signature_Applicant;
    private int Husband_Age,Wife_Age,Priest_Age, MarriageRregistration_Id, MCId;    
    private String Status;
    
    public Marriage_Registration() {
    }

    public Marriage_Registration(String Marriage_Date, String Ward, String Marriage_Place, String Marriage_Address, String Marriage_City, String Marriage_Country, String Husband_Name, String Husband_Religion_by_Birth, String Husband_Religion_by_Adoption, String Husband_Date_of_Birth, String Husband_Status_at_marriage, String Husband_Occupation, String Husband_Mobile_Number, String Husband_Email, String Husband_Address, String Husband_City, String Husband_Country, String Wife_Name, String Wife_Religion_by_Birth, String Wife_Religion_by_Adoption, String Wife_Date_of_Birth, String Wife_Status_at_marriage, String Wife_Occupation, String Wife_Mobile_Number, String Wife_Email, String Wife_Address, String Wife_City, String Wife_Country, String Witness_Name, String Witness_Relation_With_Couple, String Witness_Occupation, String Witness_Mobile_Number, String Witness_Email, String Witness_Address, String Witness_City, String Witness_Country, String Priest_Name, String Priest_Religion, String Priest_Date_of_Birth, String Priest_Occupation, String Priest_Mobile_Number, String Priest_Email, String Priest_Address, String Priest_City, String Priest_Country, String Bride_Birth_Certificate, String Bride_Aadhar_Card, String Photographs_Bride, String Bridegroom_Birth_Certificate, String Bridegroom_Aadhar_Card, String Photographs_Bridegroom, String Witness_Aadhar_Card, String Witness_Election_Card, String Wedding_card, String Signature_Priest, String Signature_Applicant, int Husband_Age, int Wife_Age, int Priest_Age) {
        this.Marriage_Date = Marriage_Date;
        this.Ward = Ward;
        this.Marriage_Place = Marriage_Place;
        this.Marriage_Address = Marriage_Address;
        this.Marriage_City = Marriage_City;
        this.Marriage_Country = Marriage_Country;
        this.Husband_Name = Husband_Name;
        this.Husband_Religion_by_Birth = Husband_Religion_by_Birth;
        this.Husband_Religion_by_Adoption = Husband_Religion_by_Adoption;
        this.Husband_Date_of_Birth = Husband_Date_of_Birth;
        this.Husband_Status_at_marriage = Husband_Status_at_marriage;
        this.Husband_Occupation = Husband_Occupation;
        this.Husband_Mobile_Number = Husband_Mobile_Number;
        this.Husband_Email = Husband_Email;
        this.Husband_Address = Husband_Address;
        this.Husband_City = Husband_City;
        this.Husband_Country = Husband_Country;
        this.Wife_Name = Wife_Name;
        this.Wife_Religion_by_Birth = Wife_Religion_by_Birth;
        this.Wife_Religion_by_Adoption = Wife_Religion_by_Adoption;
        this.Wife_Date_of_Birth = Wife_Date_of_Birth;
        this.Wife_Status_at_marriage = Wife_Status_at_marriage;
        this.Wife_Occupation = Wife_Occupation;
        this.Wife_Mobile_Number = Wife_Mobile_Number;
        this.Wife_Email = Wife_Email;
        this.Wife_Address = Wife_Address;
        this.Wife_City = Wife_City;
        this.Wife_Country = Wife_Country;
        this.Witness_Name = Witness_Name;
        this.Witness_Relation_With_Couple = Witness_Relation_With_Couple;
        this.Witness_Occupation = Witness_Occupation;
        this.Witness_Mobile_Number = Witness_Mobile_Number;
        this.Witness_Email = Witness_Email;
        this.Witness_Address = Witness_Address;
        this.Witness_City = Witness_City;
        this.Witness_Country = Witness_Country;
        this.Priest_Name = Priest_Name;
        this.Priest_Religion = Priest_Religion;
        this.Priest_Date_of_Birth = Priest_Date_of_Birth;
        this.Priest_Occupation = Priest_Occupation;
        this.Priest_Mobile_Number = Priest_Mobile_Number;
        this.Priest_Email = Priest_Email;
        this.Priest_Address = Priest_Address;
        this.Priest_City = Priest_City;
        this.Priest_Country = Priest_Country;
        this.Bride_Birth_Certificate = Bride_Birth_Certificate;
        this.Bride_Aadhar_Card = Bride_Aadhar_Card;
        this.Photographs_Bride = Photographs_Bride;
        this.Bridegroom_Birth_Certificate = Bridegroom_Birth_Certificate;
        this.Bridegroom_Aadhar_Card = Bridegroom_Aadhar_Card;
        this.Photographs_Bridegroom = Photographs_Bridegroom;
        this.Witness_Aadhar_Card = Witness_Aadhar_Card;
        this.Witness_Election_Card = Witness_Election_Card;
        this.Wedding_card = Wedding_card;
        this.Signature_Priest = Signature_Priest;
        this.Signature_Applicant = Signature_Applicant;
        this.Husband_Age = Husband_Age;
        this.Wife_Age = Wife_Age;
        this.Priest_Age = Priest_Age;
    }

    public Marriage_Registration(String Marriage_Date, String Ward, String Marriage_Place, String Marriage_Address, String Marriage_City, String Marriage_Country, String Husband_Name, String Husband_Religion_by_Birth, String Husband_Religion_by_Adoption, String Husband_Date_of_Birth, String Husband_Status_at_marriage, String Husband_Occupation, String Husband_Mobile_Number, String Husband_Email, String Husband_Address, String Husband_City, String Husband_Country, String Wife_Name, String Wife_Religion_by_Birth, String Wife_Religion_by_Adoption, String Wife_Date_of_Birth, String Wife_Status_at_marriage, String Wife_Occupation, String Wife_Mobile_Number, String Wife_Email, String Wife_Address, String Wife_City, String Wife_Country, String Witness_Name, String Witness_Relation_With_Couple, String Witness_Occupation, String Witness_Mobile_Number, String Witness_Email, String Witness_Address, String Witness_City, String Witness_Country, String Priest_Name, String Priest_Religion, String Priest_Date_of_Birth, String Priest_Occupation, String Priest_Mobile_Number, String Priest_Email, String Priest_Address, String Priest_City, String Priest_Country, String Bride_Birth_Certificate, String Bride_Aadhar_Card, String Photographs_Bride, String Bridegroom_Birth_Certificate, String Bridegroom_Aadhar_Card, String Photographs_Bridegroom, String Witness_Aadhar_Card, String Witness_Election_Card, String Wedding_card, String Signature_Priest, String Signature_Applicant, int Husband_Age, int Wife_Age, int Priest_Age, int MCId) {
        this.Marriage_Date = Marriage_Date;
        this.Ward = Ward;
        this.Marriage_Place = Marriage_Place;
        this.Marriage_Address = Marriage_Address;
        this.Marriage_City = Marriage_City;
        this.Marriage_Country = Marriage_Country;
        this.Husband_Name = Husband_Name;
        this.Husband_Religion_by_Birth = Husband_Religion_by_Birth;
        this.Husband_Religion_by_Adoption = Husband_Religion_by_Adoption;
        this.Husband_Date_of_Birth = Husband_Date_of_Birth;
        this.Husband_Status_at_marriage = Husband_Status_at_marriage;
        this.Husband_Occupation = Husband_Occupation;
        this.Husband_Mobile_Number = Husband_Mobile_Number;
        this.Husband_Email = Husband_Email;
        this.Husband_Address = Husband_Address;
        this.Husband_City = Husband_City;
        this.Husband_Country = Husband_Country;
        this.Wife_Name = Wife_Name;
        this.Wife_Religion_by_Birth = Wife_Religion_by_Birth;
        this.Wife_Religion_by_Adoption = Wife_Religion_by_Adoption;
        this.Wife_Date_of_Birth = Wife_Date_of_Birth;
        this.Wife_Status_at_marriage = Wife_Status_at_marriage;
        this.Wife_Occupation = Wife_Occupation;
        this.Wife_Mobile_Number = Wife_Mobile_Number;
        this.Wife_Email = Wife_Email;
        this.Wife_Address = Wife_Address;
        this.Wife_City = Wife_City;
        this.Wife_Country = Wife_Country;
        this.Witness_Name = Witness_Name;
        this.Witness_Relation_With_Couple = Witness_Relation_With_Couple;
        this.Witness_Occupation = Witness_Occupation;
        this.Witness_Mobile_Number = Witness_Mobile_Number;
        this.Witness_Email = Witness_Email;
        this.Witness_Address = Witness_Address;
        this.Witness_City = Witness_City;
        this.Witness_Country = Witness_Country;
        this.Priest_Name = Priest_Name;
        this.Priest_Religion = Priest_Religion;
        this.Priest_Date_of_Birth = Priest_Date_of_Birth;
        this.Priest_Occupation = Priest_Occupation;
        this.Priest_Mobile_Number = Priest_Mobile_Number;
        this.Priest_Email = Priest_Email;
        this.Priest_Address = Priest_Address;
        this.Priest_City = Priest_City;
        this.Priest_Country = Priest_Country;
        this.Bride_Birth_Certificate = Bride_Birth_Certificate;
        this.Bride_Aadhar_Card = Bride_Aadhar_Card;
        this.Photographs_Bride = Photographs_Bride;
        this.Bridegroom_Birth_Certificate = Bridegroom_Birth_Certificate;
        this.Bridegroom_Aadhar_Card = Bridegroom_Aadhar_Card;
        this.Photographs_Bridegroom = Photographs_Bridegroom;
        this.Witness_Aadhar_Card = Witness_Aadhar_Card;
        this.Witness_Election_Card = Witness_Election_Card;
        this.Wedding_card = Wedding_card;
        this.Signature_Priest = Signature_Priest;
        this.Signature_Applicant = Signature_Applicant;
        this.Husband_Age = Husband_Age;
        this.Wife_Age = Wife_Age;
        this.Priest_Age = Priest_Age;
        this.MCId = MCId;
    }

    public Marriage_Registration(String Marriage_Date, String Ward, String Marriage_Place, String Marriage_Address, String Marriage_City, String Marriage_Country, String Husband_Name, String Husband_Religion_by_Birth, String Husband_Religion_by_Adoption, String Husband_Date_of_Birth, String Husband_Status_at_marriage, String Husband_Occupation, String Husband_Mobile_Number, String Husband_Email, String Husband_Address, String Husband_City, String Husband_Country, String Wife_Name, String Wife_Religion_by_Birth, String Wife_Religion_by_Adoption, String Wife_Date_of_Birth, String Wife_Status_at_marriage, String Wife_Occupation, String Wife_Mobile_Number, String Wife_Email, String Wife_Address, String Wife_City, String Wife_Country, String Witness_Name, String Witness_Relation_With_Couple, String Witness_Occupation, String Witness_Mobile_Number, String Witness_Email, String Witness_Address, String Witness_City, String Witness_Country, String Priest_Name, String Priest_Religion, String Priest_Date_of_Birth, String Priest_Occupation, String Priest_Mobile_Number, String Priest_Email, String Priest_Address, String Priest_City, String Priest_Country, String Bride_Birth_Certificate, String Bride_Aadhar_Card, String Photographs_Bride, String Bridegroom_Birth_Certificate, String Bridegroom_Aadhar_Card, String Photographs_Bridegroom, String Witness_Aadhar_Card, String Witness_Election_Card, String Wedding_card, String Signature_Priest, String Signature_Applicant, int Husband_Age, int Wife_Age, int Priest_Age, int MarriageRregistration_Id, int MCId) {
        this.Marriage_Date = Marriage_Date;
        this.Ward = Ward;
        this.Marriage_Place = Marriage_Place;
        this.Marriage_Address = Marriage_Address;
        this.Marriage_City = Marriage_City;
        this.Marriage_Country = Marriage_Country;
        this.Husband_Name = Husband_Name;
        this.Husband_Religion_by_Birth = Husband_Religion_by_Birth;
        this.Husband_Religion_by_Adoption = Husband_Religion_by_Adoption;
        this.Husband_Date_of_Birth = Husband_Date_of_Birth;
        this.Husband_Status_at_marriage = Husband_Status_at_marriage;
        this.Husband_Occupation = Husband_Occupation;
        this.Husband_Mobile_Number = Husband_Mobile_Number;
        this.Husband_Email = Husband_Email;
        this.Husband_Address = Husband_Address;
        this.Husband_City = Husband_City;
        this.Husband_Country = Husband_Country;
        this.Wife_Name = Wife_Name;
        this.Wife_Religion_by_Birth = Wife_Religion_by_Birth;
        this.Wife_Religion_by_Adoption = Wife_Religion_by_Adoption;
        this.Wife_Date_of_Birth = Wife_Date_of_Birth;
        this.Wife_Status_at_marriage = Wife_Status_at_marriage;
        this.Wife_Occupation = Wife_Occupation;
        this.Wife_Mobile_Number = Wife_Mobile_Number;
        this.Wife_Email = Wife_Email;
        this.Wife_Address = Wife_Address;
        this.Wife_City = Wife_City;
        this.Wife_Country = Wife_Country;
        this.Witness_Name = Witness_Name;
        this.Witness_Relation_With_Couple = Witness_Relation_With_Couple;
        this.Witness_Occupation = Witness_Occupation;
        this.Witness_Mobile_Number = Witness_Mobile_Number;
        this.Witness_Email = Witness_Email;
        this.Witness_Address = Witness_Address;
        this.Witness_City = Witness_City;
        this.Witness_Country = Witness_Country;
        this.Priest_Name = Priest_Name;
        this.Priest_Religion = Priest_Religion;
        this.Priest_Date_of_Birth = Priest_Date_of_Birth;
        this.Priest_Occupation = Priest_Occupation;
        this.Priest_Mobile_Number = Priest_Mobile_Number;
        this.Priest_Email = Priest_Email;
        this.Priest_Address = Priest_Address;
        this.Priest_City = Priest_City;
        this.Priest_Country = Priest_Country;
        this.Bride_Birth_Certificate = Bride_Birth_Certificate;
        this.Bride_Aadhar_Card = Bride_Aadhar_Card;
        this.Photographs_Bride = Photographs_Bride;
        this.Bridegroom_Birth_Certificate = Bridegroom_Birth_Certificate;
        this.Bridegroom_Aadhar_Card = Bridegroom_Aadhar_Card;
        this.Photographs_Bridegroom = Photographs_Bridegroom;
        this.Witness_Aadhar_Card = Witness_Aadhar_Card;
        this.Witness_Election_Card = Witness_Election_Card;
        this.Wedding_card = Wedding_card;
        this.Signature_Priest = Signature_Priest;
        this.Signature_Applicant = Signature_Applicant;
        this.Husband_Age = Husband_Age;
        this.Wife_Age = Wife_Age;
        this.Priest_Age = Priest_Age;
        this.MarriageRregistration_Id = MarriageRregistration_Id;
        this.MCId = MCId;
    }

    public Marriage_Registration(String Marriage_Date, String Ward, String Marriage_Place, String Marriage_Address, String Marriage_City, String Marriage_Country, String Husband_Name, String Husband_Religion_by_Birth, String Husband_Religion_by_Adoption, String Husband_Date_of_Birth, String Husband_Status_at_marriage, String Husband_Occupation, String Husband_Mobile_Number, String Husband_Email, String Husband_Address, String Husband_City, String Husband_Country, String Wife_Name, String Wife_Religion_by_Birth, String Wife_Religion_by_Adoption, String Wife_Date_of_Birth, String Wife_Status_at_marriage, String Wife_Occupation, String Wife_Mobile_Number, String Wife_Email, String Wife_Address, String Wife_City, String Wife_Country, String Witness_Name, String Witness_Relation_With_Couple, String Witness_Occupation, String Witness_Mobile_Number, String Witness_Email, String Witness_Address, String Witness_City, String Witness_Country, String Priest_Name, String Priest_Religion, String Priest_Date_of_Birth, String Priest_Occupation, String Priest_Mobile_Number, String Priest_Email, String Priest_Address, String Priest_City, String Priest_Country, String Bride_Birth_Certificate, String Bride_Aadhar_Card, String Photographs_Bride, String Bridegroom_Birth_Certificate, String Bridegroom_Aadhar_Card, String Photographs_Bridegroom, String Witness_Aadhar_Card, String Witness_Election_Card, String Wedding_card, String Signature_Priest, String Signature_Applicant, int Husband_Age, int Wife_Age, int Priest_Age, int MarriageRregistration_Id, int MCId, String Status) {
        this.Marriage_Date = Marriage_Date;
        this.Ward = Ward;
        this.Marriage_Place = Marriage_Place;
        this.Marriage_Address = Marriage_Address;
        this.Marriage_City = Marriage_City;
        this.Marriage_Country = Marriage_Country;
        this.Husband_Name = Husband_Name;
        this.Husband_Religion_by_Birth = Husband_Religion_by_Birth;
        this.Husband_Religion_by_Adoption = Husband_Religion_by_Adoption;
        this.Husband_Date_of_Birth = Husband_Date_of_Birth;
        this.Husband_Status_at_marriage = Husband_Status_at_marriage;
        this.Husband_Occupation = Husband_Occupation;
        this.Husband_Mobile_Number = Husband_Mobile_Number;
        this.Husband_Email = Husband_Email;
        this.Husband_Address = Husband_Address;
        this.Husband_City = Husband_City;
        this.Husband_Country = Husband_Country;
        this.Wife_Name = Wife_Name;
        this.Wife_Religion_by_Birth = Wife_Religion_by_Birth;
        this.Wife_Religion_by_Adoption = Wife_Religion_by_Adoption;
        this.Wife_Date_of_Birth = Wife_Date_of_Birth;
        this.Wife_Status_at_marriage = Wife_Status_at_marriage;
        this.Wife_Occupation = Wife_Occupation;
        this.Wife_Mobile_Number = Wife_Mobile_Number;
        this.Wife_Email = Wife_Email;
        this.Wife_Address = Wife_Address;
        this.Wife_City = Wife_City;
        this.Wife_Country = Wife_Country;
        this.Witness_Name = Witness_Name;
        this.Witness_Relation_With_Couple = Witness_Relation_With_Couple;
        this.Witness_Occupation = Witness_Occupation;
        this.Witness_Mobile_Number = Witness_Mobile_Number;
        this.Witness_Email = Witness_Email;
        this.Witness_Address = Witness_Address;
        this.Witness_City = Witness_City;
        this.Witness_Country = Witness_Country;
        this.Priest_Name = Priest_Name;
        this.Priest_Religion = Priest_Religion;
        this.Priest_Date_of_Birth = Priest_Date_of_Birth;
        this.Priest_Occupation = Priest_Occupation;
        this.Priest_Mobile_Number = Priest_Mobile_Number;
        this.Priest_Email = Priest_Email;
        this.Priest_Address = Priest_Address;
        this.Priest_City = Priest_City;
        this.Priest_Country = Priest_Country;
        this.Bride_Birth_Certificate = Bride_Birth_Certificate;
        this.Bride_Aadhar_Card = Bride_Aadhar_Card;
        this.Photographs_Bride = Photographs_Bride;
        this.Bridegroom_Birth_Certificate = Bridegroom_Birth_Certificate;
        this.Bridegroom_Aadhar_Card = Bridegroom_Aadhar_Card;
        this.Photographs_Bridegroom = Photographs_Bridegroom;
        this.Witness_Aadhar_Card = Witness_Aadhar_Card;
        this.Witness_Election_Card = Witness_Election_Card;
        this.Wedding_card = Wedding_card;
        this.Signature_Priest = Signature_Priest;
        this.Signature_Applicant = Signature_Applicant;
        this.Husband_Age = Husband_Age;
        this.Wife_Age = Wife_Age;
        this.Priest_Age = Priest_Age;
        this.MarriageRregistration_Id = MarriageRregistration_Id;
        this.MCId = MCId;
        this.Status = Status;
    }

    
    
    

    public String getMarriage_Date() {
        return Marriage_Date;
    }

    public void setMarriage_Date(String Marriage_Date) {
        this.Marriage_Date = Marriage_Date;
    }

    public String getWard() {
        return Ward;
    }

    public void setWard(String Ward) {
        this.Ward = Ward;
    }

    public String getMarriage_Place() {
        return Marriage_Place;
    }

    public void setMarriage_Place(String Marriage_Place) {
        this.Marriage_Place = Marriage_Place;
    }

    public String getMarriage_Address() {
        return Marriage_Address;
    }

    public void setMarriage_Address(String Marriage_Address) {
        this.Marriage_Address = Marriage_Address;
    }

    public String getMarriage_City() {
        return Marriage_City;
    }

    public void setMarriage_City(String Marriage_City) {
        this.Marriage_City = Marriage_City;
    }

    public String getMarriage_Country() {
        return Marriage_Country;
    }

    public void setMarriage_Country(String Marriage_Country) {
        this.Marriage_Country = Marriage_Country;
    }

    public String getHusband_Name() {
        return Husband_Name;
    }

    public void setHusband_Name(String Husband_Name) {
        this.Husband_Name = Husband_Name;
    }

    public String getHusband_Religion_by_Birth() {
        return Husband_Religion_by_Birth;
    }

    public void setHusband_Religion_by_Birth(String Husband_Religion_by_Birth) {
        this.Husband_Religion_by_Birth = Husband_Religion_by_Birth;
    }

    public String getHusband_Religion_by_Adoption() {
        return Husband_Religion_by_Adoption;
    }

    public void setHusband_Religion_by_Adoption(String Husband_Religion_by_Adoption) {
        this.Husband_Religion_by_Adoption = Husband_Religion_by_Adoption;
    }

    public String getHusband_Date_of_Birth() {
        return Husband_Date_of_Birth;
    }

    public void setHusband_Date_of_Birth(String Husband_Date_of_Birth) {
        this.Husband_Date_of_Birth = Husband_Date_of_Birth;
    }

    public String getHusband_Status_at_marriage() {
        return Husband_Status_at_marriage;
    }

    public void setHusband_Status_at_marriage(String Husband_Status_at_marriage) {
        this.Husband_Status_at_marriage = Husband_Status_at_marriage;
    }

    public String getHusband_Occupation() {
        return Husband_Occupation;
    }

    public void setHusband_Occupation(String Husband_Occupation) {
        this.Husband_Occupation = Husband_Occupation;
    }

    public String getHusband_Mobile_Number() {
        return Husband_Mobile_Number;
    }

    public void setHusband_Mobile_Number(String Husband_Mobile_Number) {
        this.Husband_Mobile_Number = Husband_Mobile_Number;
    }

    public String getHusband_Email() {
        return Husband_Email;
    }

    public void setHusband_Email(String Husband_Email) {
        this.Husband_Email = Husband_Email;
    }

    public String getHusband_Address() {
        return Husband_Address;
    }

    public void setHusband_Address(String Husband_Address) {
        this.Husband_Address = Husband_Address;
    }

    public String getHusband_City() {
        return Husband_City;
    }

    public void setHusband_City(String Husband_City) {
        this.Husband_City = Husband_City;
    }

    public String getHusband_Country() {
        return Husband_Country;
    }

    public void setHusband_Country(String Husband_Country) {
        this.Husband_Country = Husband_Country;
    }

    public String getWife_Name() {
        return Wife_Name;
    }

    public void setWife_Name(String Wife_Name) {
        this.Wife_Name = Wife_Name;
    }

    public String getWife_Religion_by_Birth() {
        return Wife_Religion_by_Birth;
    }

    public void setWife_Religion_by_Birth(String Wife_Religion_by_Birth) {
        this.Wife_Religion_by_Birth = Wife_Religion_by_Birth;
    }

    public String getWife_Religion_by_Adoption() {
        return Wife_Religion_by_Adoption;
    }

    public void setWife_Religion_by_Adoption(String Wife_Religion_by_Adoption) {
        this.Wife_Religion_by_Adoption = Wife_Religion_by_Adoption;
    }

    public String getWife_Date_of_Birth() {
        return Wife_Date_of_Birth;
    }

    public void setWife_Date_of_Birth(String Wife_Date_of_Birth) {
        this.Wife_Date_of_Birth = Wife_Date_of_Birth;
    }

    public String getWife_Status_at_marriage() {
        return Wife_Status_at_marriage;
    }

    public void setWife_Status_at_marriage(String Wife_Status_at_marriage) {
        this.Wife_Status_at_marriage = Wife_Status_at_marriage;
    }

    public String getWife_Occupation() {
        return Wife_Occupation;
    }

    public void setWife_Occupation(String Wife_Occupation) {
        this.Wife_Occupation = Wife_Occupation;
    }

    public String getWife_Mobile_Number() {
        return Wife_Mobile_Number;
    }

    public void setWife_Mobile_Number(String Wife_Mobile_Number) {
        this.Wife_Mobile_Number = Wife_Mobile_Number;
    }

    public String getWife_Email() {
        return Wife_Email;
    }

    public void setWife_Email(String Wife_Email) {
        this.Wife_Email = Wife_Email;
    }

    public String getWife_Address() {
        return Wife_Address;
    }

    public void setWife_Address(String Wife_Address) {
        this.Wife_Address = Wife_Address;
    }

    public String getWife_City() {
        return Wife_City;
    }

    public void setWife_City(String Wife_City) {
        this.Wife_City = Wife_City;
    }

    public String getWife_Country() {
        return Wife_Country;
    }

    public void setWife_Country(String Wife_Country) {
        this.Wife_Country = Wife_Country;
    }

    public String getWitness_Name() {
        return Witness_Name;
    }

    public void setWitness_Name(String Witness_Name) {
        this.Witness_Name = Witness_Name;
    }

    public String getWitness_Relation_With_Couple() {
        return Witness_Relation_With_Couple;
    }

    public void setWitness_Relation_With_Couple(String Witness_Relation_With_Couple) {
        this.Witness_Relation_With_Couple = Witness_Relation_With_Couple;
    }

    public String getWitness_Occupation() {
        return Witness_Occupation;
    }

    public void setWitness_Occupation(String Witness_Occupation) {
        this.Witness_Occupation = Witness_Occupation;
    }

    public String getWitness_Mobile_Number() {
        return Witness_Mobile_Number;
    }

    public void setWitness_Mobile_Number(String Witness_Mobile_Number) {
        this.Witness_Mobile_Number = Witness_Mobile_Number;
    }

    public String getWitness_Email() {
        return Witness_Email;
    }

    public void setWitness_Email(String Witness_Email) {
        this.Witness_Email = Witness_Email;
    }

    public String getWitness_Address() {
        return Witness_Address;
    }

    public void setWitness_Address(String Witness_Address) {
        this.Witness_Address = Witness_Address;
    }

    public String getWitness_City() {
        return Witness_City;
    }

    public void setWitness_City(String Witness_City) {
        this.Witness_City = Witness_City;
    }

    public String getWitness_Country() {
        return Witness_Country;
    }

    public void setWitness_Country(String Witness_Country) {
        this.Witness_Country = Witness_Country;
    }

    public String getPriest_Name() {
        return Priest_Name;
    }

    public void setPriest_Name(String Priest_Name) {
        this.Priest_Name = Priest_Name;
    }

    public String getPriest_Religion() {
        return Priest_Religion;
    }

    public void setPriest_Religion(String Priest_Religion) {
        this.Priest_Religion = Priest_Religion;
    }

    public String getPriest_Date_of_Birth() {
        return Priest_Date_of_Birth;
    }

    public void setPriest_Date_of_Birth(String Priest_Date_of_Birth) {
        this.Priest_Date_of_Birth = Priest_Date_of_Birth;
    }

    public String getPriest_Occupation() {
        return Priest_Occupation;
    }

    public void setPriest_Occupation(String Priest_Occupation) {
        this.Priest_Occupation = Priest_Occupation;
    }

    public String getPriest_Mobile_Number() {
        return Priest_Mobile_Number;
    }

    public void setPriest_Mobile_Number(String Priest_Mobile_Number) {
        this.Priest_Mobile_Number = Priest_Mobile_Number;
    }

    public String getPriest_Email() {
        return Priest_Email;
    }

    public void setPriest_Email(String Priest_Email) {
        this.Priest_Email = Priest_Email;
    }

    public String getPriest_Address() {
        return Priest_Address;
    }

    public void setPriest_Address(String Priest_Address) {
        this.Priest_Address = Priest_Address;
    }

    public String getPriest_City() {
        return Priest_City;
    }

    public void setPriest_City(String Priest_City) {
        this.Priest_City = Priest_City;
    }

    public String getPriest_Country() {
        return Priest_Country;
    }

    public void setPriest_Country(String Priest_Country) {
        this.Priest_Country = Priest_Country;
    }

    public String getBride_Birth_Certificate() {
        return Bride_Birth_Certificate;
    }

    public void setBride_Birth_Certificate(String Bride_Birth_Certificate) {
        this.Bride_Birth_Certificate = Bride_Birth_Certificate;
    }

    public String getBride_Aadhar_Card() {
        return Bride_Aadhar_Card;
    }

    public void setBride_Aadhar_Card(String Bride_Aadhar_Card) {
        this.Bride_Aadhar_Card = Bride_Aadhar_Card;
    }

    public String getPhotographs_Bride() {
        return Photographs_Bride;
    }

    public void setPhotographs_Bride(String Photographs_Bride) {
        this.Photographs_Bride = Photographs_Bride;
    }

    public String getBridegroom_Birth_Certificate() {
        return Bridegroom_Birth_Certificate;
    }

    public void setBridegroom_Birth_Certificate(String Bridegroom_Birth_Certificate) {
        this.Bridegroom_Birth_Certificate = Bridegroom_Birth_Certificate;
    }

    public String getBridegroom_Aadhar_Card() {
        return Bridegroom_Aadhar_Card;
    }

    public void setBridegroom_Aadhar_Card(String Bridegroom_Aadhar_Card) {
        this.Bridegroom_Aadhar_Card = Bridegroom_Aadhar_Card;
    }

    public String getPhotographs_Bridegroom() {
        return Photographs_Bridegroom;
    }

    public void setPhotographs_Bridegroom(String Photographs_Bridegroom) {
        this.Photographs_Bridegroom = Photographs_Bridegroom;
    }

    public String getWitness_Aadhar_Card() {
        return Witness_Aadhar_Card;
    }

    public void setWitness_Aadhar_Card(String Witness_Aadhar_Card) {
        this.Witness_Aadhar_Card = Witness_Aadhar_Card;
    }

    public String getWitness_Election_Card() {
        return Witness_Election_Card;
    }

    public void setWitness_Election_Card(String Witness_Election_Card) {
        this.Witness_Election_Card = Witness_Election_Card;
    }

    public String getWedding_card() {
        return Wedding_card;
    }

    public void setWedding_card(String Wedding_card) {
        this.Wedding_card = Wedding_card;
    }

    public String getSignature_Priest() {
        return Signature_Priest;
    }

    public void setSignature_Priest(String Signature_Priest) {
        this.Signature_Priest = Signature_Priest;
    }

    public String getSignature_Applicant() {
        return Signature_Applicant;
    }

    public void setSignature_Applicant(String Signature_Applicant) {
        this.Signature_Applicant = Signature_Applicant;
    }

    public int getHusband_Age() {
        return Husband_Age;
    }

    public void setHusband_Age(int Husband_Age) {
        this.Husband_Age = Husband_Age;
    }

    public int getWife_Age() {
        return Wife_Age;
    }

    public void setWife_Age(int Wife_Age) {
        this.Wife_Age = Wife_Age;
    }

    public int getPriest_Age() {
        return Priest_Age;
    }

    public void setPriest_Age(int Priest_Age) {
        this.Priest_Age = Priest_Age;
    }

    public int getMarriageRregistration_Id() {
        return MarriageRregistration_Id;
    }

    public void setMarriageRregistration_Id(int MarriageRregistration_Id) {
        this.MarriageRregistration_Id = MarriageRregistration_Id;
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
