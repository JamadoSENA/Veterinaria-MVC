/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.Scanner;

/**
 *
 * @author GAES 2
 */
public class Servicio {
    
    Scanner l = new Scanner (System.in);
    
    //Atributos
    
    private String nombre, date;
    private int precio, total;
    
    //Metodo Constructor

    public Servicio() {
    }
    
    //Metodos de Encapsulamiento

    public String getNombre() {
        return nombre;
    }

    public String getDate() {
        return date;
    }

    public int getPrecio() {
        return precio;
    }

    public int getTotal() {
        return total;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
    public void registrarServicio (){
        
        System.out.println("---REGISTRO SERVICIO---");
        System.out.println("Registre el nombre del servicio: ");
        this.nombre = l.next();
        System.out.println("Ingrese la fecha del servicio: ");
        this.date = l.next();
        System.out.println("Ingrese el precio del servicio" + this.getNombre() + ": ");
        this.precio = l.nextInt();
        
    }
    
    public void calcularServicio (){
        
        this.total = this.getPrecio();
        
         
    }
    
    public void imprimirInformacion (){
        
        System.out.println("---INFORMACION SERVICIO---");
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Precio: " + this.getPrecio());
        System.out.println("Fecha: " + this.getDate());
        System.out.println("---------------------------");
        System.out.println("TOTAL: " + this.getTotal());
        
    }
}
