/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Delia
 */
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.*;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
public class ClientesDAO {

    
private static final String ARCHIVO = "Clientes.json";

private static Gson gson = new Gson();

    public static void guardarClientes(String cedula, String nombre, String apellido, String direccion, String telefono, String Correo) {
        Map<String, Clientes> clientesMap = listarClientes();
        Clientes cliente = new Clientes(cedula, nombre, apellido, direccion, telefono, Correo);
        clientesMap.put(cedula, cliente);

        try (Writer writer = new FileWriter(ARCHIVO)) {
            gson.toJson(clientesMap, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Map<String, Clientes> listarClientes() {
        try (Reader reader = new FileReader(ARCHIVO)) {
            Type tipoMapa = new TypeToken<Map<String, Clientes>>() {}.getType();
            Map<String, Clientes> clientesMap = gson.fromJson(reader, tipoMapa);
            return (clientesMap != null) ? clientesMap : new HashMap<>();
        } catch (FileNotFoundException e) {
            return new HashMap<>();
        } catch (IOException e) {
            e.printStackTrace();
            return new HashMap<>();
        }
    }
}
