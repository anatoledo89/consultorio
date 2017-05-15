/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import DAO.DAOPaciente;
import java.sql.SQLException;

/**
 *
 * @author pamel
 */
public class Patient extends Person {


    public Patient(String Firstname, String Lastname, int age, String address, String telephone, String email) {
        super(Firstname, Lastname, age, address, telephone, email);
    }
     //Declaramos las variables 
   
    private int patientID;
    private String securityNumber;
    private Float weight;
    private Float size;
    private String disease;
    private Integer roomID;
    private int hospitalID;
    private String []doctorID;
    private int status;
    private int contador = 0;
    private int num = 5;
    
    //Creamos un constructor vacio
    public Patient(){
        this.securityNumber = "No se ha ingresado ningun dato";
        this.weight = 0.0f;
        this.size = 0.0f;
        this.disease = " No se ha ingresado ningun dato";
        this.roomID = 0;
        this.doctorID = new String[5];
        this.status = 0;
    }
   
    //constructor que recibe datos 
    
    public Patient(String securityNumber, Float weight, Float size, String disease, Integer roomID, String[] doctorID, int status) {
        this.securityNumber = securityNumber;
        this.weight = weight;
        this.size = size;
        this.disease = disease;
        this.roomID = roomID;
        this.doctorID = doctorID;
        this.status = status;
    }
    
    //Constructo11r que copia los datos de un objeto Patient
    public Patient(Patient p1)
    {
        this.securityNumber = p1.getSecurityNumber();
        this.weight = p1.getWeight();
        this.size = p1.getSize();
        this.disease = p1.getDisease();
        this.roomID = p1.getRoomID();
        this.doctorID = p1.getDoctorID();
        this.status = p1.getStatus();
        
    }

    public int getHospitalID() {
        return hospitalID;
    }

    public void setHospitalID(int hospitalID) {
        this.hospitalID = hospitalID;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    
    
    public int getPatientID() {
        return patientID;
    }

    //Metodos SET
    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public void setSecurityNumber(String securityNumber) {
        this.securityNumber = securityNumber;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public void setSize(Float size) {
        this.size = size;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public void setRoomID(Integer roomID) {
        this.roomID = roomID;
    }

    public void setDoctorID(String []doctorID) {
        this.doctorID =doctorID;
    }

    public void setStatus(int status) {
        
        this.status = status;
    }
    
    //Metodos GET 

    public String getSecurityNumber() {
        return securityNumber;
    }

    public Float getWeight() {
        return weight;
    }

    public Float getSize() {
        return size;
    }

    public String getDisease() {
        return disease;
    }

    public Integer getRoomID() {
        return roomID;
    }

    public String []getDoctorID( ) {
      return this.doctorID;
   }

    public int getStatus() {
        return status;
    }
    
  //otros metodos 
    
   public boolean setNewDoc(String doctorID, int status, int idpaciente,int idhospital, int idcuarto) throws SQLException, ClassNotFoundException     
    { Doctor d=new Doctor();
       
 
            
            DAOPaciente daopaciente=new DAOPaciente();
        if(    daopaciente.addDoctor(doctorID, this.securityNumber,status,idpaciente,idhospital,idcuarto))
        {
            
                return d.addPatientID(this.securityNumber);
        }else return false;
    }
            
            
            
            //falta contador verificar
            /*  if (this.num - this.contador <=5)
            {
            for( int i = this.contador; i<this.num;i++)
            {
            this.doctorID[i] = doctorID;
            }
            this.contador++;
            }
            else 
            if (this.num - this.contador ==0)
            {
            System.out.println("Se ha alcanzado el numero maximo de doctores por paciente");
            }
            */
        
        
      
    
   
   public void freeDoc(String doctorID) throws SQLException, ClassNotFoundException
   {
       
      
       
       /* for( int i = 0; i<5;i++)
        {
            if (this.doctorID[i].equals(doctorID))
            {
                this.doctorID[i] = " ";
            }
        }
        this.contador--;*/
   }

    @Override
    public String toString()
    {
        return "Nombre:" + super.getFirstname() + ", Apellido:" + super.getLastname() + ", age=" + super.getAge() + ", address=" + super.getAddress() + ", \nsecurityNumber=" + this.securityNumber + "'</html>";
    }


    
    
    
    

    }

   