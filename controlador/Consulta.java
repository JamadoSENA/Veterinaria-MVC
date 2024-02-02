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
public class Consulta {
    
    Scanner l = new Scanner (System.in);
    
    //Atributos
    
    private int valorConsulta, tiempo, totalConsulta, valorExamen;
    private String doctor, date, motivo, examen;
    
    //Metodo Constructor

    public Consulta() {
    }

    //Metodos de Encapsulamiento
    
    public String getExamen() {
        return examen;
    }
    
    public int getValorExamen() {
        return valorExamen;
    }
    
    public String getMotivo() {
        return motivo;
    }
    
    public String getDate() {
        return date;
    }
    
    public int getValorConsulta() {
        return valorConsulta;
    }

    public int getTiempo() {
        return tiempo;
    }

    public int getTotalConsulta() {
        return totalConsulta;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setValorExamen(int valorExamen) {
        this.valorExamen = valorExamen;
    }
    
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    
    public void setDate(String date) {
        this.date = date;
    }
    
    public void setValorConsulta(int valorConsulta) {
        this.valorConsulta = valorConsulta;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public void setTotalConsulta(int totalConsulta) {
        this.totalConsulta = totalConsulta;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }
    
    public void registrarConsulta (){
        
        System.out.println("---REGISTRO CONSULTA---");
        System.out.println("Ingrese el motivo de la consulta: ");
        this.motivo = l.next();
        System.out.println("Ingrese el nombre del doctor: ");
        this.doctor = l.next();
        System.out.println("Ingrese el valor de la consulta: ");
        this.valorConsulta = l.nextInt();
        System.out.println("Ingrese el nombre del examen: ");
        this.examen = l.next();
        System.out.println("Ingrese el valor del examen: ");
        this.valorExamen = l.nextInt();
        System.out.println("Ingrese la fecha de la consulta: ");
        this.date = l.next();
        
    }
    
    public void calcularTotalConsulta () {
        
        this.totalConsulta = this.getValorConsulta()+this.getValorExamen();
        
            
    }
    
    public void mostrarInformacion (){
        
        System.out.println("---INFORMACION CONSULTA---");
        System.out.println("Motivo de la Consulta: " + this.getMotivo());
        System.out.println("Doctor que Atendio: " + this.getDoctor());
        System.out.println("Examen Realizado: " + this.getExamen());
        System.out.println("---PRECIOS---");
        System.out.println("Valor Consulta: " + this.getValorConsulta());
        System.out.println("Precio Examen: " + this.valorExamen);
        System.out.println("----------------------------------");
        System.out.println("TOTAL: " + this.getTotalConsulta());
        
    }
}
