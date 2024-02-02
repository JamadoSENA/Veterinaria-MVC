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
public class Producto {
    
    Scanner l = new Scanner (System.in);
    
    //Atributos
    
    private String nombre;
    private int precio, cantidad, total;
    
    //Metodo Constructor

    public Producto() {
    }
    
    //Metodos de Encapsulamiento

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getTotal() {
        return total;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
    public void compraProducto (){
        
        System.out.println("---COMPRA PRODUCTOS---");
        System.out.println("Ingrese el nombre del producto: ");
        this.nombre = l.next();
        System.out.println("Ingrese el precio del producto: ");
        this.precio = l.nextInt();
        System.out.println("Ingrese la cantidad a llevar: ");
        this.cantidad = l.nextInt();
        
    }
    
    public void calcularTotalProducto (){
        
        this.total = this.getCantidad()*this.getPrecio();
        
        
    }
    
    public void imprimirInformacion () {
        
        System.out.println("---INFORMACION COMPRA PRODUCTO---");
        System.out.println("Nombre Producto: " + this.getNombre());
        System.out.println("Precio Producto: " + this.getPrecio());
        System.out.println("Cantidad: " + this.getCantidad());
        System.out.println("-------------------------------");
        System.out.println("TOTAL: " + this.getTotal());
        
    }
}
