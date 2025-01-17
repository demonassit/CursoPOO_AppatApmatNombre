/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Base;

/**
 *
 * @author demon
 */
public class Profesor extends Persona {
    
    private int num_empleado;
    
    public Profesor(){
    }

    public Profesor(int num_empleado) {
        this.num_empleado = num_empleado;
    }

    public Profesor(int num_empleado, int id, String nombre, int edad) {
        super(id, nombre, edad);
        this.num_empleado = num_empleado;
    }
    
   
    public int getNum_empleado() {
        return num_empleado;
    }

    public void setNum_empleado(int num_empleado) {
        this.num_empleado = num_empleado;
    }
    
    @Override
    String tipoPersona() {
        return("Docente");
    }

    
}
