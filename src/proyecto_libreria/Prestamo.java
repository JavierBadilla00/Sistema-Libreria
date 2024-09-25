/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_libreria;

import java.util.Date;

/**
 *
 * @author 
 */
public class Prestamo {
    
    String ID;
    Date Fecha;
    String ID_Lector;
    String ID_Libro;
    int Precio;
    int Cantidad;
    int Total;

    public Prestamo(String ID, Date Fecha, String ID_Lector, String ID_Libro, int Precio, int Cantidad, int Total) {
        this.ID = ID;
        this.Fecha = Fecha;
        this.ID_Lector = ID_Lector;
        this.ID_Libro = ID_Libro;
        this.Precio = Precio;
        this.Cantidad = Cantidad;
        this.Total = Total;
    }

    public Prestamo() {
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public String getID_Lector() {
        return ID_Lector;
    }

    public void setID_Lector(String ID_Lector) {
        this.ID_Lector = ID_Lector;
    }

    public String getID_Libro() {
        return ID_Libro;
    }

    public void setID_Libro(String ID_Libro) {
        this.ID_Libro = ID_Libro;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public int getTotal() {
        return Total;
    }

    public void setTotal(int Total) {
        this.Total = Total;
    }

    @Override
    public String toString() {
        return "Prestamo{" + "ID=" + ID + ", Fecha=" + Fecha + ", ID_Lector=" + ID_Lector + ", ID_Libro=" + ID_Libro + ", Precio=" + Precio + ", Cantidad=" + Cantidad + ", Total=" + Total + '}';
    }
       
    
}
