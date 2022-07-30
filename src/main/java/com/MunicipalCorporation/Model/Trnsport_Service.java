
package com.MunicipalCorporation.Model;


public class Trnsport_Service {
    
    
    private String Route, First_Bus, Last_Bus;
    private int Transport_Service_Id, Rounds, MCId;

    public Trnsport_Service() {
    }

    public Trnsport_Service(String Route, String First_Bus, String Last_Bus, int Transport_Service_Id, int Rounds) {
        this.Route = Route;
        this.First_Bus = First_Bus;
        this.Last_Bus = Last_Bus;
        this.Transport_Service_Id = Transport_Service_Id;
        this.Rounds = Rounds;
    }

    public String getRoute() {
        return Route;
    }

    public void setRoute(String Route) {
        this.Route = Route;
    }

    public String getFirst_Bus() {
        return First_Bus;
    }

    public void setFirst_Bus(String First_Bus) {
        this.First_Bus = First_Bus;
    }

    public String getLast_Bus() {
        return Last_Bus;
    }

    public void setLast_Bus(String Last_Bus) {
        this.Last_Bus = Last_Bus;
    }

    public int getTransport_Service_Id() {
        return Transport_Service_Id;
    }

    public void setTransport_Service_Id(int Transport_Service_Id) {
        this.Transport_Service_Id = Transport_Service_Id;
    }

    public int getRounds() {
        return Rounds;
    }

    public void setRounds(int Rounds) {
        this.Rounds = Rounds;
    }

    public int getMCId() {
        return MCId;
    }

    public void setMCId(int MCId) {
        this.MCId = MCId;
    }
    
    
}
