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
public class Mascota {
   
    Scanner l = new Scanner (System.in);
    
    //Atributos
    
    private String nombre, raza, especie, color, tamaño, propietario, genero;
    private int nacimiento; 
    private int edad;
    private float peso;
    //private char generoM = 'M'|'m';
    //private char generoF = 'F'|'f';

    //Metodo Constructor
    
    public Mascota() {
    }

    //Metodos de Encapsulamiento

    public String getGenero() {
        return genero;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public String getEspecie() {
        return especie;
    }

    public String getColor() {
        return color;
    }

    public String getTamaño() {
        return tamaño;
    }

    public String getPropietario() {
        return propietario;
    }

    public int getNacimiento() {
        return nacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public float getPeso() {
        return peso;
    }

    /*public char getGeneroM() {
        return generoM;
    }

    public char getGeneroF() {
        return generoF;
    }*/

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public void setNacimiento(int nacimiento) {
        this.nacimiento = nacimiento;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    /*public void setGeneroM(char generoM) {
        this.generoM = generoM;
    }

    public void setGeneroF(char generoF) {
        this.generoF = generoF;
    }*/
    
    public void registrarMascota (){
   
        System.out.println("---REGISTRO MASCOTA---");
        System.out.println("Ingrese el nombre de la mascota: ");
        this.nombre = l.nextLine();
        System.out.println("Ingrese la especie de la mascota: ");
        this.especie = l.next();
        System.out.println("Ingrese la raza de la mascota: ");
        this.raza = l.next();
        System.out.println("Ingrese el año de nacimiento de la mascota:");
        this.nacimiento = l.nextInt();
        System.out.println("Ingrese el genero de la mascota: M | F");
        this.genero = l.next();
        System.out.println("Ingrese el color de la mascota: ");
        this.color = l.next();
        System.out.println("Ingrese el peso de la mascota: ");
        this.peso = l.nextFloat();
        System.out.println("Ingrese el tamaño de la mascota: Pequeño | Mediano | Grande");
        this.tamaño = l.next();
        System.out.println("Ingrese el nombre del propietario de la mascota: ");
        this.propietario = l.next();
            
    }
    
    public void calcularEdad () {
        
        this.edad = 2023-this.getNacimiento();
        
    }
    
    public void imprimirInformacion () {
        
        System.out.println("---Imprimir Informacion---");
        System.out.println("-INFORMACION PROPIETARIO-");
        System.out.println("Nombre: " + this.getPropietario());
        System.out.println("-INFORMACION MASCOTA-");
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Raza: " + this.getRaza());
        System.out.println("Edad: " + this.getEdad());
        System.out.println("Fecha de nacimiento: " + this.getNacimiento());
        System.out.println("Especie: " + this.getEspecie());
        System.out.println("Genero: " + this.getGenero());
        System.out.println("Color: " + this.getColor());
        System.out.println("Tamaño: " + this.getTamaño());
        System.out.println("Peso: " + this.getPeso());
        
    }
}
