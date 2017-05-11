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
public class Person {
    //Declaramos las variables 
    //Se usa Integer
    private String Firstname;
    private String Lastname;
    private Integer age;
    private String address;
    private String telephone;
    private String email;

    //creamos un constructor que recibe los datos
    public Person(String Firstname, String Lastname, int age, String address, String telephone, String email) {
        this.Firstname = Firstname;
        this.Lastname = Lastname;
        this.age = age;
        this.address = address;
        this.telephone = telephone;
        this.email = email;
    }
    //creamos un contructor vacio con mensajes predeterminados
    public Person(){
    
       /* this.Firstname = "No se ha ingresado ningun dato";
        this.Lastname = "No se ha ingresado ningun dato";
        this.age = null;
        this.address = "No se ha ingresado ningun dato";
        this.telephone = "No se ha ingresado ningun dato";
        this.email = "No se ha ingresado ningun dato";*/
    
    }
    //constructor que copia los datos de un objeto "Person"

    public Person(Person per1) {
        this.Firstname = per1.getFirstname();
        this.Lastname = per1.getLastname();
        this.age = per1.getAge();
        this.address = per1.getAddress();
        this.telephone = per1.getTelephone();
        this.email = per1.getEmail();
    }
    
    //Metodos SET

    public void setFirstname(String Firstname) {
        this.Firstname = Firstname;
    }

    public void setLastname(String Lastname) {
        this.Lastname = Lastname;
    }

    //si age es igual o menor a 0 age = nulo, en la interfaz se permitira valores menores o igual a cero 
    public void setAge(int age) {
        if (age < 0 )
        {
            this.age = null;
        }
        else 
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    //Metodos GET

    public String getFirstname() {
        return Firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
      //  return "Firstname=" + Firstname + ", \nLastname=" + Lastname + ", \nage=" + age + ", \naddress=" + address + ", \ntelephone=" + telephone + ",\n email=" + email + '}';
      return " ";
    }
    
    
    
}
