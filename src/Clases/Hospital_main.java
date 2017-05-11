
package Clases;
import java.util.Scanner;


public class Hospital_main {

  /*  public static void main(String[] args) {
        //Variables Scanner
        Scanner num;
        Scanner letras;
        String resp = "";
                    
        //Variables para crear clinica 
        String nombre_hospital;
        String direccion;
        String telefono;
        int num_oficinas =0;
        int num_rooms;
        int num_floors;
        
        //Variables para dar de alta un consultorio 
        int id;
        int floor;
        float monthlyRent;
        String doctorID;
        float lastPayment;
    
        //Variables para dar de baja un consultorio
        int idb;
        
        //Variables para dar alta a un médico
        String idm;
        String dprtmt;
        String license;
        String patient; 
        
        
        ////////////////////////////////////////////////////////////////////////////////
        
     do{
        System.out.println("Bienvenido a tu hospital");
        System.out.println("*******************MENU******************");
        System.out.println("1.- Crear Clinica");
        System.out.println("2.- Dar de alta a los consultorios");
        System.out.println("3-. Dar de baja un consultorio");
        System.out.println("4-. Modificar un consultorio");
        System.out.println("5-. Dar de alta a los médicos que trabajan en la clínica ");
        System.out.println("6-. Modificar médicos de la clinica");
        System.out.println("7-. Eliminar médicos de la clínica");
        System.out.println("8-.  Agregar pacientes.");
        System.out.println("9-.  Eliminar paciente");
        System.out.println("10-. Dar de alta a paciente ");
        System.out.println("11-. Datos de médico ");
        System.out.println("12-. Reporte de consultorios ");
        System.out.println("13-. Reporte de médicos ");
        System.out.println("14-. Reporte de cuartos ");
        System.out.println("15-. Repote de pacientes ");
        System.out.println(" Salir ");
        
        System.out.println("Escoja una opcion");
        num = new Scanner(System.in);
        int opcion = num.nextInt();

        switch(opcion)
        {
            case 1:
                System.out.println("Nombre del hospital: ");
                letras = new Scanner(System.in);
                nombre_hospital = letras.nextLine();
                
                 System.out.println("Direccion del hospital: ");
                letras = new Scanner(System.in);
                direccion = letras.nextLine();
                
                 System.out.println("Telefono del hospital: ");
                letras = new Scanner(System.in);
                telefono = letras.nextLine();
                
                 System.out.println("Numero de oficinas del hospital: ");
                num = new Scanner(System.in);
                num_oficinas = num.nextInt();
                
                 System.out.println("Numero de habitaciones del hospital: ");
                num = new Scanner(System.in);
                num_rooms = num.nextInt();
                
                 System.out.println("Numero de pisos del hospital: ");
                num = new Scanner(System.in);
                num_floors = num.nextInt();
                
                Hospital h1 = null;
                 h1 = new Hospital(nombre_hospital,direccion,telefono,num_oficinas,num_rooms,num_floors);
                System.out.println(h1.toString());
                System.out.println(" ¿Desea realizar otra operación?");
         
                letras= new Scanner(System.in);
                resp = letras.nextLine();
                
                break;
                
                case 2:
                    //Dar de alta consultorios   
                System.out.println("Escriba el ID del consultorio ");
                num = new Scanner(System.in);
                id = num.nextInt();
                
                 System.out.println("Piso en el que se encuentra el consultorio: ");
                num = new Scanner(System.in);
                floor = num.nextInt();
                
                 System.out.println("Ingrese la cantidad de la renta mensual ");
                num = new Scanner(System.in);
                 monthlyRent = num.nextFloat();
                
                 System.out.println(" Ingrese el ID del doctor que ocupara el consultorio ");
                 letras = new Scanner(System.in);
                 doctorID = letras.nextLine();
                
                 System.out.println("Ingrese el ultimo pago realizado por el medico, en caso de no haber realizado ningun pago escriba 0 ");
                num = new Scanner(System.in);
                lastPayment = num.nextInt();
                
                DoctorsOffice d1 = new DoctorsOffice(id,floor,monthlyRent,doctorID,lastPayment);
                //d1.addDoctorOffice(d1);
                
                   System.out.println(d1.toString());
                   System.out.println(" ¿Desea realizar otra operación?");
         
                letras= new Scanner(System.in);
                resp = letras.nextLine();
                   break;
                    
                case 3: //Dar de baja un consultorio
                System.out.println("Escriba el ID del consultorio:  ");  
                 num=new Scanner(System.in);
                idb=num.nextInt();
               // for (int i = 0; i < h1.getNumOfDoctorsOffices();i++)
                
               
                System.out.println(" ¿Desea realizar otra operación?");
         
                letras= new Scanner(System.in);
                resp = letras.nextLine();
                break;
                
                case 4: //Modificar un consultorio
                    System.out.println("Escriba el ID del consultorio:  ");  
                    num= new Scanner(System.in);
                    idb=num.nextInt();
                    System.out.println(" ¿Desea realizar otra operación?");
         
                letras= new Scanner(System.in);
                resp = letras.nextLine();
                break;
                    
                case 5: //Dar de alta a los médicos que trabajan en la clínica
                    System.out.println("Escriba el ID del médico:  ");  
                    letras= new Scanner(System.in);
                    idm=letras.nextLine();
                    
                    System.out.println("Escriba la especialidad del médico:  "); 
                    letras = new Scanner(System.in);
                   dprtmt=letras.nextLine();
                   
                     System.out.println(" Escriba la cédula profesional del médico: "); 
                     letras = new Scanner(System.in);
                     license= letras.nextLine();
                break;
                    
                case 6: //Modificar médicos de la clinica
                    System.out.println("Escriba el ID del médico:  ");  
                    letras= new Scanner(System.in);
                    idm=letras.nextLine();
                break;    
                    
                case 7: // Eliminar médicos de la clínica
                    System.out.println("Escriba el ID del médico:  ");  
                    letras= new Scanner(System.in);
                    idm=letras.nextLine();
                break;
                
                case 8: //Agregar pacientes
                    System.out.println("Escriba el ID del médico:  ");  
                    letras= new Scanner(System.in);
                    idm=letras.nextLine();
                break;
                    
                case 9: //Eliminar paciente
                    
                break;
                    
                case 10: //Dar de alta a paciente
                    
                break;   
                    
                case 11: //Pacientes de X médico
                    System.out.println("Escriba el ID del médico:  ");  
                    letras= new Scanner(System.in);
                    idm=letras.nextLine();
                    
                    System.out.println(" ");  
                break;  
                    
                case 12: //Reporte de consultorios
                    System.out.println("Escriba el ID del consultorio:  ");  
                    num= new Scanner(System.in);
                    idb=num.nextInt();
//                    if(???){
//                        System.out.println(toString());
//                    }
                break;
                    
                case 13: //Reporte de médicos
                    System.out.println("Escriba el ID del médico:  ");  
                    letras= new Scanner(System.in);
                    idm=letras.nextLine();
                break;
                 
                case 14: //Reporte de cuartos 
                   
                break;
                    
                case 15: //Repote de pacientes
                    
                break;
                    
                case 16:
                    System.exit(0);
                    break;
        }
       }while(resp.equals("si") );
    }*/
}
