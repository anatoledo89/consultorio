/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author pamel
 */
/**
 * 
 * @author pamel
 */
public class Doctor extends Person{
    //Declarando atributos...
    private String id;
    private String department;
    private String license;
    private ArrayList<String>patientSet=new ArrayList<>();
    private int contadorP = 0;
    private int size = 10;
    private int idhospital=0;
    
//constructor con valores de atributos 
    public Doctor(String id, String department, String license) {
        this.id = id;
        this.department = department;
        this.license = license;
    }

    //constructor con datos copiados
    public Doctor(Doctor doc)
    {
        this.id = doc.getId();
        this.department = doc.getDepartment();
        this.license = doc.getLicense();
    }
    
    //constructor vacio
   
    public Doctor()
            {
        this.id = " No se ha ingresado";
        this.department = " No se ha ingresado";
        this.license = " No se ha ingresado";
            }
    
    
  //Metodos SET

    public void setIdhospital(int idhospital) {
        this.idhospital = idhospital;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public void setPatientSet(ArrayList<String>patientSet) {
        this.patientSet = patientSet;
    }
    
    //Metodos GET
    

    public String getId() {
        return id;
    }

    public int getIdhospital() {
        return idhospital;
    }
    

    public String getDepartment() {
        return department;
    }

    public String getLicense() {
        return license;
    }

    public ArrayList<String> getPatientSet() {
        return patientSet;
    }
    
    private void resize(){
            //Creamos primero un arreglo del mismo amaño que el actual
      /*      String []aux = new String[this.size];
            //Ahora respaldamos el arreglo actual en este nuevo arreglo
            for(int i=0; i<this.size;i++){
            aux[i]=this.patientSet[i];}
            //ya que lo tenemos respaldado, reservamos memoria para el nuev tamaño del arreglo data
            this.size*=2;
            this.patientSet = new String[this.size];
            //ahora solo vaciamos nuestro respaldo a data
           for(int i=0; i<this.size/2; i++){
               this.patientSet[i]=aux[i];
           }*/
    }
    
    
    public boolean addPatientID(String securityNumber)
    {
        
       
        if(patientSet.size()<5)
        {
             
            patientSet.add(securityNumber);
            return true;
        }else
        {
            return false;
        }
      /*  if (this.contadorP<this.size)
        {
             this.patientSet[this.contadorP++]=securityNumber;
        }
        else{
                //si caemos aquí, es que ya se llenó el arreglo, por lo que es necesario 
                //redimensionarlo para poder añadir el dato
                this.resize();
                this.patientSet[this.contadorP++]=securityNumber;
            }*/
    }
    
    public void erasePatientID(String securityNumber)
    {
        
        patientSet.remove(securityNumber);
      /*for( int i = 0; i<this.size;i++)
        {
            if (this.patientSet[i].equals(securityNumber))
            {
                this.patientSet[i] = " ";
            }
        }
        this.contadorP--;*/
    }

    //se comento por que usamos combo box y estos devuelven siempre un toString 
    //asi que por estetica comentamos lo demas 
    @Override
    public String toString() {
      //  return "Firstname=" + super.getFirstname() + ", \nLastname=" + super.getLastname() + ", \nage=" + super.getAge() + ", \naddress=" + super.getAddress() + ", \ntelephone=" + super.getTelephone() + ",\n email=" + super.getEmail()+"Doctor{" + "id=" + id + ", department=" + department + ", license=" + license + ", patientSet=" + patientSet + ", contadorP=" + contadorP + '}';
    
    return super.getFirstname()+" "+super.getLastname();
    }
}
