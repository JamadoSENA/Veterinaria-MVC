/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import controlador.Consulta;
import controlador.Mascota;
import controlador.Producto;
import controlador.Servicio;
import java.util.Scanner;


/**
 *
 * @author GAES 2
 */
public class Interfaz {
 
    public void iniciarPrograma (){
        
        int opcion, respuesta;
        char respuestas = 'Y' | 'y';
        Scanner l = new Scanner (System.in);
        Consulta objConsulta = new Consulta();
        Mascota objMascota = new Mascota();
        Producto objProducto = new Producto();
        Servicio objServicio = new Servicio();
        
        do{
        
            System.out.println("---BIENVENIDO A LA VETERINARIA DEL GAES 2---");
            System.out.println("1. Registrar Mascota. ");
            System.out.println("2. Hacer una Consulta. ");
            System.out.println("3. Solicitar un Servicio. ");
            System.out.println("4. Comprar un Producto. ");
            System.out.println("5. Salir. ");
            System.out.println("");
            System.out.println("Ingrese una opcion: ");
            opcion = l.nextInt();
            
            if(opcion==5){
                break;
            }else if(opcion != 1 && opcion != 2 && opcion != 3 && opcion != 4 && opcion != 5){
                
            System.out.println("---BIENVENIDO A LA VETERINARIA DEL GAES 2---");
            System.out.println("1. Registrar Mascota. ");
            System.out.println("2. Hacer una Consulta. ");
            System.out.println("3. Solicitar un Servicio. ");
            System.out.println("4. Comprar un Producto. ");
            System.out.println("5. Salir. ");
            System.out.println("");
            System.out.println("Ingrese una opcion: ");
            opcion = l.nextInt();
                
            }
            
            switch(opcion){
                
                case 1:
                 
                do{
                    
                objMascota.registrarMascota();
                System.out.println("Desea visualizar la informacion: 1 = SI | 0 = NO");
                respuesta = l.nextInt();
                
                if(respuesta == 1){
                    
                    objMascota.calcularEdad();
                    objMascota.imprimirInformacion();
                    
                    System.out.println("¿Desea resgistrar una consulta de la mascota " + objMascota.getNombre() + "?  1 = SI ó 0 = NO");
                    respuesta = l.nextInt();
                    
                    if(respuesta == 1){
                        
                        objConsulta.registrarConsulta();
                        System.out.println("¿Desea mostrar la informacion de la consulta de la mascota " 
                                           + objMascota.getNombre() + "? 1 = SI ó 0 = NO\n(SI DIGITA (NO) SE FACTURARA DIRECTAMENTE)");
                        respuesta = l.nextInt();
                        
                        if(respuesta == 1){
                            
                            objConsulta.calcularTotalConsulta();
                            objConsulta.mostrarInformacion();
                            System.out.println("¿Desea adquirir algun servicio para la mascota " 
                                           + objMascota.getNombre() + "? 1 = SI ó 0 = NO\n(SI DIGITA (NO) SE FACTURARA DIRECTAMENTE)");
                            respuesta = l.nextInt();    
                            
                            if(respuesta == 1){
                                
                                objServicio.registrarServicio();
                                System.out.println("¿Desea mostrar la informacion del servicio para la mascota " 
                                           + objMascota.getNombre() + "? 1 = SI ó 0 = NO\n(SI DIGITA (NO) SE FACTURARA DIRECTAMENTE)");
                                respuesta = l.nextInt();
                                
                                if(respuesta == 1){
                                    
                                    objServicio.calcularServicio();
                                    objServicio.imprimirInformacion();
                                    System.out.println("¿Desea adquirir algun producto para la mascota " 
                                           + objMascota.getNombre() + "? 1 = SI ó 0 = NO\n(SI DIGITA (NO) SE FACTURARA DIRECTAMENTE)");
                                    respuesta = l.nextInt();
                                    
                                    if(respuesta == 1){
                                        
                                        objProducto.compraProducto();
                                        System.out.println("¿Desea mostrar la informacion del producto para la mascota " 
                                           + objMascota.getNombre() + "? 1 = SI ó 0 = NO\n(SI DIGITA (NO) SE FACTURARA DIRECTAMENTE)");
                                        respuesta = l.nextInt();
                                        
                                        if(respuesta == 1){
                                            
                                            objProducto.calcularTotalProducto();
                                            objProducto.imprimirInformacion();
                                            
                                            System.out.println("---VENTA---");
                                            System.out.println("TOTAL CONSULTA: " + objConsulta.getTotalConsulta());
                                            System.out.println("TOTAL SERVICIO: " + objServicio.getTotal());
                                            System.out.println("TOTAL PRODUCTO(S): " + objProducto.getTotal());
                                            
                                        }else if(respuesta == 0){
                                            
                                            System.out.println("---VENTA---");
                                            System.out.println("TOTAL CONSULTA: " + objConsulta.getTotalConsulta());
                                            System.out.println("TOTAL SERVICIO: " + objServicio.getTotal());
                                            System.out.println("TOTAL PRODUCTO(S): " + objProducto.getTotal());
                                            break;
                                            
                                        }
                                        
                                    }else if (respuesta == 0){
                                        
                                        System.out.println("---VENTA---");
                                        System.out.println("TOTAL CONSULTA: " + objConsulta.getTotalConsulta());
                                        System.out.println("TOTAL SERVICIO: " + objServicio.getTotal());
                                        System.out.println("TOTAL PRODUCTO(S): " + objProducto.getTotal());
                                        break;
                                    
                                    }
                                    
                                }else if (respuesta == 0){
                                    
                                    System.out.println("---VENTA---");
                                    System.out.println("TOTAL CONSULTA: " + objConsulta.getTotalConsulta());
                                    System.out.println("TOTAL SERVICIO: " + objServicio.getTotal());
                                    break;
                                
                                }
                                
                            }else if (respuesta == 0){
                                
                                System.out.println("---VENTA---");
                                System.out.println("TOTAL CONSULTA: " + objConsulta.getTotalConsulta());
                                break;
                            
                            }
                            
                        }else if(respuesta == 0){
                            
                            System.out.println("---VENTA---");
                            System.out.println("TOTAL CONSULTA: " + objConsulta.getTotalConsulta());
                            break;
                            
                        }
                        
                    }else if(respuesta == 0){
                        
                        break;
                        
                    }
                    
                }else if(respuesta == 0){
                    
                    break;
                    
                }
                
                System.out.println("Quieres resgistrar otra mascota: Y ó N");
                respuestas = l.next().charAt(0);
                
                }while(respuestas == 'Y' || respuestas == 'y');    
                
                break;
                
                case 2:
                    
                    do{
                    
                    System.out.println("¿Desea antes registrar una mascota? 1 = SI ó 0 = NO");
                    respuesta = l.nextInt();
                    
                    if(respuesta == 1){
                        
                        objMascota.registrarMascota(); 
                        System.out.println("---CONSULTA---");
                        System.out.println("REGISTRANDO CONSULTA DE LA MASCOTA " + objMascota.getNombre() + "...");
                        objConsulta.registrarConsulta();
                        System.out.println("");
                        System.out.println("¿Desea mostrar la informacion de la consulta de la mascota " 
                                           + objMascota.getNombre() + "? 1 = SI ó 0 = NO\n(SI DIGITA (NO) SE FACTURARA DIRECTAMENTE)");
                        respuesta = l.nextInt();
                        
                        if(respuesta == 1){
                            
                            objConsulta.calcularTotalConsulta();
                            objConsulta.mostrarInformacion();
                            System.out.println("---VENTA---");
                            System.out.println("TOTAL CONSULTA: " + objConsulta.getTotalConsulta());
                            
                        }else if(respuesta == 0){
                            
                            System.out.println("---VENTA---");
                            System.out.println("TOTAL CONSULTA: " + objConsulta.getTotalConsulta());
                            
                        }
                        
                    }else if(respuesta == 0){
                        
                        objConsulta.registrarConsulta();
                        System.out.println("Desea imprimir la informacion de la consulta: 1 = SI ó 0 = NO");
                        respuesta = l.nextInt();
                        if(respuesta == 1){
                            
                            objConsulta.calcularTotalConsulta();
                            objConsulta.mostrarInformacion();
                            System.out.println("---VENTA---");
                            System.out.println("TOTAL CONSULTA: " + objConsulta.getTotalConsulta());
                            
                        }else if(respuesta == 0){
                            
                            System.out.println("---VENTA---");
                            System.out.println("TOTAL CONSULTA: " + objConsulta.getTotalConsulta());
                            
                        }
                        
                    }
                    
                    System.out.println("Quieres resgistrar otra consulta: Y ó N");
                    respuestas = l.next().charAt(0);
                    
                    }while(respuestas == 'Y' || respuestas == 'y');
            
                    break;
                    
                case 3:
                    
                    do{
                    
                    objServicio.registrarServicio();
                    System.out.println("¿Desea imprimir la informacion del servicio? 1 = SI ó 0 = NO");
                    respuesta = l.nextInt();
                    
                    if(respuesta == 1){
                        
                        objServicio.calcularServicio();
                        objServicio.imprimirInformacion();
                        System.out.println("---VENTA---");
                        System.out.println("TOTAL SERVICIO: " + objServicio.getTotal());
                        
                    }else if(respuesta == 0){
                        
                        System.out.println("---VENTA---");
                        System.out.println("TOTAL SERVICIO: " + objServicio.getTotal());
                        
                    }
                        
                    System.out.println("Quieres resgistrar otro servicio: Y ó N");
                    respuestas = l.next().charAt(0);
                    
                    }while(respuestas == 'Y' || respuestas == 'y');
            
                    break;
                    
                case 4:
            
                    do{
                      
                    objProducto.compraProducto();
                    System.out.println("¿Desea imprimir la informacion de la compra del producto(s)? 1 = SI ó 0 = NO");
                    respuesta = l.nextInt();
                    
                    if(respuesta == 1){
                        
                        objProducto.calcularTotalProducto();
                        objProducto.imprimirInformacion();
                        System.out.println("---VENTA---");
                        System.out.println("TOTAL PRODUCTO: " + objProducto.getTotal());
                        
                    }else if(respuesta == 0){
                        
                        System.out.println("---VENTA---");
                        System.out.println("TOTAL PRODUCTO: " + objProducto.getTotal());
                        
                    }
                        
                    System.out.println("Quieres resgistrar otro producto: Y ó N");
                    respuestas = l.next().charAt(0);
                    
                    }while(respuestas == 'Y' || respuestas == 'y');
            
                    break;
                    
            }
                
                
            
        }while(opcion <= 5);
        
        
        
        
    }
    
    
}
