/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author pamel 
 */
public class Room {
    
    private int roomID;
    private String patientID;
    private int hospitalID;
    private int Maxroom;

    //constructor que copia datos de un objeto "Room"
    public Room(Room room) {
        this.roomID = room.getRoomID();
        this.patientID = room.getPatientID();
    }
    //constructor vacio
    public Room(){
    this.roomID=0;
    this.patientID=" ";
    this.Maxroom=0;
    }
   
     //constructor con valor de roomID
    public Room(int room)
    {
       this.roomID = room;
    }
      
//Metodos SET 
    public void setRoomID(Integer roomID) {
        if(this.roomID>1 && this.roomID<this.Maxroom){
        this.roomID = roomID;}
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    //Metodos GET
    public Integer getRoomID() {
        return roomID;
    }

    public String getPatientID() {
        return patientID;
    }
    
    
    
}

