/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author demon
 */
import Base.Alumno;
import Base.Persona;
import Base.Profesor;
import java.util.ArrayList;

public class AccionesPersona {
    
    /*
    Las acciones de la persona son aquellas que son los comportamientos
    esperados de la clase
    CRUD
    Registrar
    Consultar
    Editar
    Eliminar
    */
    
    //instancia donde yo guarde a las personas
    public ArrayList<Persona> listapersonas = new ArrayList();
    
    Persona profesor = new Profesor();
    Persona alumno = new Alumno();
    
    //agregar una persona
    public void agregarPersonas(Persona p){
        listapersonas.add(p);
    }
    
    //buscar por id a una persona
    public Persona buscarPersona(int id){
        //una instancia depersona para poderla buscar
        Persona encontrada = new Persona();
        for(Persona p : listapersonas){
            if(id == p.getId()){
                encontrada = p; 
            }else{
                System.out.println("No existe el registro de dicha persona");
            }
        }
        return encontrada;
    }
    
    public void actualizarlosDatos(Persona actualizada){
        Persona actualizar = buscarPersona(actualizada.getId());
        //cambiar los datos
        listapersonas.remove(actualizar);
        //guardar
        listapersonas.add(actualizar);
    }
    
    public void eliminarPersona(Persona eliminar){
        listapersonas.remove(eliminar);
    }
    
    public ArrayList<Persona> mostrarPersona(){
        return listapersonas;
    
    }
   
    
    
    
    
    
    
}
