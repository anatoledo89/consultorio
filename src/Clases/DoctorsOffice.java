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
public class DoctorsOffice extends Hospital{
    //declarando los atributos
    private int id;
    private int floor;
    private float monthlyRent;
    private String doctorID;
    private float lastPayment;
    private int idhospital;


    public DoctorsOffice(Integer id, Integer floor, Float monthlyRent, String doctorID, Float lastPayment) {
        this.id = id;
        this.floor = floor;
        this.monthlyRent = monthlyRent;
        this.doctorID = doctorID;
        this.lastPayment = lastPayment;
    }
    
    public DoctorsOffice(DoctorsOffice DocOffice)
    {
        this.id = DocOffice.getId();
        this.floor = DocOffice.getFloor();
        this.monthlyRent = DocOffice.getMonthlyRent();
        this.doctorID = DocOffice.getDoctorID();
        this.lastPayment = DocOffice.getLastPayment();
    }
    
    
    public DoctorsOffice()
    {
     /*   this.id=0;
        this.floor = 0;
        this.monthlyRent = 0;
        this.doctorID = " ";
        this.lastPayment = 0;*/
    }
    
    //metodos SET

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFloor(Integer floor) {
      //  if (floor< this.getNumFloors())
        this.floor = floor;
        
        
    }

    public int getIdhospital() {
        return idhospital;
    }

    public void setIdhospital(int idhospital) {
        this.idhospital = idhospital;
    }

    public void setMonthlyRent(Float monthlyRent) {
        this.monthlyRent = monthlyRent;
    }

    public void setDoctorID(String doctorID) {
        this.doctorID = doctorID;
    }

    public void setLastPayment(Float lastPayment) {
        this.lastPayment = lastPayment;
    }
    
    //Metodos GET

    public Integer getId() {
        return id;
    }

    public Integer getFloor() {
        return floor;
    }

    public Float getMonthlyRent() {
        return monthlyRent;
    }

    public String getDoctorID() {
        return doctorID;
    }

    public Float getLastPayment() {
        return lastPayment;
    }

    
    @Override
    public String toString() {
        
       //return  "id=" + this.id + ", floor=" + this.floor + ", monthlyRent=" + this.monthlyRent + ", doctorID=" + this.doctorID + ", lastPayment=" + this.lastPayment + '}';
      return   "ID: "+this.id; 
//", floor=" + this.floor + ", monthlyRent=" + this.monthlyRent + ", doctorID=" + this.doctorID;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
