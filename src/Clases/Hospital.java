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
public class Hospital {
    private int idhospital;
    private String name;
    private String address;
    private String telephone;
    private Integer numOfDoctorsOffices;
    private Integer numOfRooms;
    private int numFloors;
    private DoctorsOffice[] offices;
    private room []rooms;
    private Doctor[] doctors;
    private Patient[]patients;
    private int contador_office;
    private int contador_room;
    private int contador_doctors;
    private int contador_patients;

    //Constructor con datos para copiar
    public Hospital(String name, String address, String telephone, Integer numOfDoctorsOffices, Integer numOfRooms, DoctorsOffice[] offices, room[] rooms, Doctor[] doctors, Patient[] patients) {
        this.contador_office = 0;
        this.contador_doctors = 0;
        this.contador_patients = 0;
        this.contador_room = 0;
        this.name = name;
        this.address = address;
        this.telephone = telephone;
        this.numOfDoctorsOffices = numOfDoctorsOffices;
        this.numOfRooms = numOfRooms;
        this.offices = offices;
        this.rooms = rooms;
        this.doctors = doctors;
        this.patients = patients;
    }
    
    //constructor vacio

    public Hospital() {
        
   /*     this.contador_office = 0;
        this.contador_doctors = 0;
        this.contador_patients = 0;
        this.contador_room = 0;
        this.name = " ";
        this.address = " ";
        this.telephone = " ";
        this.numOfDoctorsOffices = 0;
        this.numOfRooms = 0;
        this.offices = new DoctorsOffice[1];
        this.rooms = new room[1];
        this.doctors = new Doctor[0];
        this.patients = new Patient[0];*/
    }   
    
    //constructor para copia 
    public Hospital(Hospital hospital)
    {
        this.contador_office = 0;
        this.contador_doctors = 0;
        this.contador_patients = 0;
        this.contador_room = 0;
        this.name = hospital.getName();
        this.address = hospital.getAddress();
        this.telephone = hospital.getTelephone();
        this.numOfDoctorsOffices = hospital.getNumOfDoctorsOffices();
        this.numOfRooms = hospital.getNumOfRooms();
        this.offices = hospital.getOffices();
        this.rooms = hospital.getRooms();
        this.doctors = hospital.getDoctors();
        this.patients = hospital.getPatients();
        
    }
    
   //constructos con los primeros 5 atributos

    public Hospital(String name, String address, String telephone, Integer numOfDoctorsOffices, Integer numOfRooms, int num_floors) {
        this.contador_office = 0;
        this.contador_doctors = 0;
        this.contador_patients = 0;
        this.contador_room = 0;
        this.name = name;
        this.address = address;
        this.telephone = telephone;
        this.numOfDoctorsOffices = numOfDoctorsOffices;
        this.numOfRooms = numOfRooms;
        this.numFloors = num_floors;
    }    
    //constructos con los primeros 5 atributos
    
    //Metodos SET

    public void setNumFloors(int numFloors) {
        this.numFloors = numFloors;
    }

    public int getIdhospital() {
        return idhospital;
    }

    public void setIdhospital(int idhospital) {
        this.idhospital = idhospital;
    }

    
    
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setNumOfDoctorsOffices(Integer numOfDoctorsOffices) {
        this.numOfDoctorsOffices = numOfDoctorsOffices;
    }

    public void setNumOfRooms(Integer numOfRooms) {
        this.numOfRooms = numOfRooms;
    }

    public void setOffices(DoctorsOffice[] offices) {
        this.offices = offices;
    }

    public void setRooms(room[] rooms) {
        this.rooms = rooms;
    }

    public void setDoctors(Doctor[] doctors) {
        this.doctors = doctors;
        this.contador_doctors++;
    }

    public void setPatients(Patient[] patients) {
        this.patients = patients;
        this.contador_patients++;
    }    //constructos con los primeros 5 atributos
    
    //Metodos GET

    public int getNumFloors() {
        return numFloors;
    }
    
    

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getTelephone() {
        return telephone;
    }

    public Integer getNumOfDoctorsOffices() {
        return numOfDoctorsOffices;
    }

    public Integer getNumOfRooms() {
        return numOfRooms;
    }

    public DoctorsOffice[] getOffices() {
        return offices;
    }

    public room[] getRooms() {
        return rooms;
    }

    public Doctor[] getDoctors() {
        return doctors;
    }

    public Patient[] getPatients() {
        return patients;
    }
    
    
    //otros Metodos
    
    public void addDoctorOffice(DoctorsOffice office)
    {
        if (office != null)
        {
        for (int i = this.contador_office ; i<this.numOfDoctorsOffices; i++)
        {
            this.offices[i] = office;
        }
        }
        else
            for (int i = this.contador_office ; i<this.numOfDoctorsOffices; i++)
            {
               this.offices[i] = null;  
            }  
    
    }
    
    public void addRoom(room room)
    {
        if (room != null)
        {
        for (int i = this.contador_room ; i<this.numOfRooms; i++)
        {
            this.rooms[i] = room;
        }
        }
        else
            for (int i = this.contador_room; i<this.numOfRooms; i++)
            {
               this.rooms[i] = null;  
            }  
    
    }
    public void showDoctorsOfficeInfo(int id)
    {
        for (int i = 0; i > this.numOfDoctorsOffices; i++)
        {
            if (this.offices[i].getId().equals(id))
            {
                this.offices[i].toString();
                String doctorid=this.offices[i].getDoctorID();
                if (this.doctors[i].getId().equals(doctorid))
                {this.doctors[i].toString();}
                        
            }
               
        }
    }
    
    public void showDoctorInfo(String id)
    {
     for (int i = 0; i > this.contador_doctors; i++)
        {
            if (this.doctors[i].getId().equals(id))
            {
                this.doctors[i].toString();
                        
            }
        
        }
    }
    
   public void showPatientInfo(String SecurityNumber)
   {
       for (int i = 0; i > this.contador_patients; i++)
        {
            if (this.patients[i].getSecurityNumber().equals(SecurityNumber))
            {
                this.patients[i].toString();
                        
            }
        
        }
   }
   
   public void assignDoctorToPatient(String SecurityNumber, String DoctorID)
   {
    /*   for (int i = 0; i < this.contador_patients; i++)
       {
           if (this.patients[i].getSecurityNumber().equals(SecurityNumber))
           {
               this.patients[i].setNewDoc(DoctorID);
           }
           
       }
       //e Igual le agregamos un paciente al doctor mediante el metodo addpatientID de la clase Doctor
       for (int i = 0; i < this.contador_doctors; i++)
       {
           if (this.doctors[i].getId().equals(DoctorID))
           {
               this.doctors[i].addPatientID(SecurityNumber);
           }
       }*/
       
   }
   public void assignRoomToPatient(String SecurityNumber, int roomID)
   {
       for (int i = 0; i < this.contador_patients; i++)
       {
           if (this.patients[i].getSecurityNumber().equals(SecurityNumber))
           {
               this.patients[i].setRoomID(roomID);
           }
       }
       for (int i = 0; i < this.contador_room; i++)
       {
           if (this.rooms[i].getRoomID().equals(roomID))
           {
               this.rooms[i].setPatientID(SecurityNumber);
           }
       }
           
           
       }
   
   public void assignOfficeToDoctor(int id, String DoctorID)
   {
       for (int i = 0; i < this.numOfDoctorsOffices; i++)
       {
           if (this.offices[i].getId().equals(id))
           {
               this.offices[i].setDoctorID(DoctorID);
           }
       }
   }

    @Override
    public String toString() {
       // return "name=" + this.name + ", address=" + this.address + ", telephone=" + this.telephone + ", numOfDoctorsOffices=" + this.numOfDoctorsOffices + ", numOfRooms=" + this.numOfRooms + ", numFloors=" + this.numFloors + '}';
     
        return name;
    }
    
   
   
   
}

    
