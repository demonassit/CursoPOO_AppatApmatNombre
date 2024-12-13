/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Base;

/**
 *
 * @author demon
 */
import java.io.Serializable;


public abstract class Persona implements Serializable{
    
    private int id;
    private String nombre;
    private int edad;
    //appat
    //apmat
    //direccion

    public Persona(){
    }
    
    public Persona(int id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //metodo abstracto que se encargue de identificar que la clase es abstracta
    abstract String tipoPersona();
    
    
    
    
    
}
