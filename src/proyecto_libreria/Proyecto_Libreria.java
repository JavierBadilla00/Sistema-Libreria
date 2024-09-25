/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_libreria;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 
 */
public class Proyecto_Libreria {
    
     static ArrayList <Prestamo> PrestamoList = new ArrayList<>();
    
     private static DefaultTableModel modelo;

    public static void main(String[] args) {
        modelo = new DefaultTableModel();
        CargarVentas();
    }

    private static void CargarVentas() {
        PrestamoList.clear();
        modelo.setRowCount(0);
        Document documento = new Document();
        String destino = "Prestamos.pdf";
        
        try (Connection conn = Base_De_Datos_Conexion.getConnection()) {
            String sql = "SELECT * FROM Prestamos";
            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            
            
            PdfWriter.getInstance(documento, new FileOutputStream(destino));
            documento.open();
            
            Phrase p = new Phrase("Reporte de prestamos realizados\n\n");
            documento.add(p);
            
            
            PdfPTable table = new PdfPTable(7);

          
            table.addCell("ID");
            table.addCell("Fecha");
            table.addCell("Lector");
            table.addCell("Libro");
            table.addCell("Precio");
            table.addCell("Cantidad");
            table.addCell("Total");
            

            while (resultSet.next()) {
                String ID = resultSet.getString("ID");
                Date Fecha = resultSet.getDate("Fecha");
                String Lector = resultSet.getString("ID_Lector");
                String Libro = resultSet.getString("ID_Libro");
                int Precio = resultSet.getInt("Precio");
                int Cantidad = resultSet.getInt("Cantidad");
                int Total = resultSet.getInt("Total");

               
                Prestamo prestamo = new Prestamo(ID, Fecha, Lector, Libro, Precio, Cantidad, Total);
                PrestamoList.add(prestamo);
                modelo.addRow(new Object[]{ID, Fecha, Lector, Libro, Precio, Cantidad, Total});

               
                table.addCell(ID);
                table.addCell(Fecha.toString());
                table.addCell(Lector);
                table.addCell(Libro);
                table.addCell(String.valueOf(Precio));
                table.addCell(String.valueOf(Cantidad));
                table.addCell(String.valueOf(Total));
            }
            
           
            documento.add(table);
            documento.close();
            
            JOptionPane.showMessageDialog(null, "Se ha generado exitosamente el reporte de la biblioteca!" + destino);
            
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Proyecto_Libreria.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(Proyecto_Libreria.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
