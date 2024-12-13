
import Base.Alumno;
import Base.Persona;
import Base.Profesor;
import Controlador.AccionesPersona;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author demon
 */
public class ManipularDatos {
    
    int num_empleado, id, edad;
    String nombre;
    ArrayList<Persona> listadepersonas = new ArrayList();
    Persona profesor = new Profesor();
    Persona alumno = new Alumno();
    
    public void menu() throws Exception {
        Scanner entrada = new Scanner(System.in);
        AccionesPersona control = new AccionesPersona();
        
        
        System.out.println("Bienvenido a este ejemplo de crud");
        System.out.println("Elije una opcii[on");
        System.out.println("1./ Mostrar todas las personas mimidas");
        System.out.println("2./ Registrar nueva Profesor");
        System.out.println("3./ Editar persona");
        
        int opcion = entrada.nextInt();
        
        switch (opcion) {
            case 1:
                listadepersonas = control.mostrarPersona();
                    for(Persona objeto : listadepersonas){
                        System.out.println("El id es: " +objeto.getId() + "\n"
                                + "El nombre es: " +objeto.getNombre() + "\n"
                                + "Su edad es: " +objeto.getEdad()  + "\n");
                        
                }
                    menu();
            case 2 :
                pedirDatos();
                profesor = new Profesor(num_empleado, id, nombre, edad);
                guardarDatos();
                break;
            default:
                throw new AssertionError();
        }
    }

    private void pedirDatos() {
        num_empleado = 
                Integer.parseInt(
                        JOptionPane.showInputDialog(
                                "Ingresa el numero de empleado: "));
        id = 
                Integer.parseInt(
                        JOptionPane.showInputDialog(
                                "Ingresa el identificador unico: "));
        nombre = 
                
                        JOptionPane.showInputDialog(
                                "Ingresa el numero de empleado: ");
        edad = 
                Integer.parseInt(
                        JOptionPane.showInputDialog(
                                "Ingresa la edad del empleado: "));
    }

    private void guardarDatos() throws Exception{
        listadepersonas.add(profesor);
        guardararchivo();
    }

    private void guardararchivo() throws Exception{
        FileOutputStream archivo = new FileOutputStream("archivo.dat");
        ObjectOutputStream salida = new ObjectOutputStream(archivo);
        //escribir
        salida.writeObject(listadepersonas);
        salida.close();
    }
    
    private void leerProfesor() throws Exception{
        FileInputStream archivo = new FileInputStream("archivo.dat");
        ObjectInputStream entrada = new ObjectInputStream(archivo);
        //aqui es donde se necesta transformar los objetos al archivo
        listadepersonas = (ArrayList)entrada.readObject();
        
        for(int i = 0; i < listadepersonas.size(); i++){
            Profesor obj = (Profesor)listadepersonas.get(i);
            JOptionPane.showMessageDialog(
                    null, "Numero de empleado: " + obj.getNum_empleado() + "\n"
                            + "Id: " + obj.getId() + "\n"
                            + "Nombre del profesor: " + obj.getNombre() + "\n"
                            + "Edad: " + obj.getEdad() + "\n");
        }
    }
    
}
