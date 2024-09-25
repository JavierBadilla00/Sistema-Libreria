/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_libreria;

/**
 *
 * @author Javie
 */
public class Libro {
    
    String ID;
    String Nombre;
    String AutorID;
    int Precio;

    public Libro(String ID, String Nombre, String AutorID, int Precio) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.AutorID = AutorID;
        this.Precio = Precio;
    }

    public Libro() {
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

    public String getAutorID() {
        return AutorID;
    }

    public void setAutorID(String AutorID) {
        this.AutorID = AutorID;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    @Override
    public String toString() {
        return "Libro{" + "ID=" + ID + ", Nombre=" + Nombre + ", AutorID=" + AutorID + ", Precio=" + Precio + '}';
    }
    
    
    
    
}
