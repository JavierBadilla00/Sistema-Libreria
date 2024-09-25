/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_libreria;

/**
 *
 * @author Javie
 */
public class Autor {
    
     String ID;
    String Nombre;

    public Autor(String ID, String Nombre) {
        this.ID = ID;
        this.Nombre = Nombre;
    }

    public Autor() {
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public String toString() {
        return "Autores{" + "ID=" + ID + ", Nombre=" + Nombre + '}';
    }
    
    
    
    
}
