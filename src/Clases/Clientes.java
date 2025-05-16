/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Delia
 */
public class Clientes {
     private String cedula;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private String Correo;

    public Clientes() {}

    public Clientes(String cedulaP, String nombreP, String apellidoP, String direccionP, String telefonoP, String CorreoP) {
        cedula = cedulaP;
        nombre = nombreP;
        apellido = apellidoP;
        direccion = direccionP;
        telefono = telefonoP;
        Correo = CorreoP;
    }

    public String getCedula() { return cedula; }
    public void setCedula(String cedulaP) { cedula = cedulaP; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombreP) { nombre = nombreP; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellidoP) { apellido = apellidoP; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccionP) { direccion = direccionP; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefonoP) { telefono = telefonoP; }

    public String getEmail() { return Correo; }
    public void setEmail(String CorreoP) { Correo = CorreoP; }
}
    

