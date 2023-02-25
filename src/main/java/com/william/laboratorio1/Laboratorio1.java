/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.william.laboratorio1;

import javax.swing.JOptionPane;

/**
 *
 * @author William
 */
public class Laboratorio1 {

    public static void main(String[] args) {
        int opcion = 0, elemento, posicion;
        SinglyLinkedList listaen = new SinglyLinkedList(); 
        
        do{
            try{
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, """
                     1. Insertar al inicio
                     2. Insertar al Final
                     3. Recorrer                                                     
                     4. Buscar elemento                                                       
                     5. Borrar un elemento
                     6. Salir                                                                                                                                            
                     Menu de opciones                                                       """, "Menu de Opciones",
                        JOptionPane.INFORMATION_MESSAGE));
                
                switch(opcion){
                    case 1 -> {
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresar elemento del nodo",
                                "Agregar nodo al inicio", JOptionPane.INFORMATION_MESSAGE));
                                listaen.insertAtHead(elemento);
                        break;
                    }

                    case 2 -> {
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresar elemento del nodo",
                                "Agregar nodo al final", JOptionPane.INFORMATION_MESSAGE));
                                listaen.insertAtTail(elemento);
                        break;
                    }

                    case 3 -> {
                        if(!listaen.isEmpty()){
                            listaen.traverse();
                        }
                                
                        break;
                    }

                    case 4 -> {
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Buscar por valor",
                                "Buscando por valor", JOptionPane.INFORMATION_MESSAGE));
                                listaen.searchByValue(elemento);
                                JOptionPane.showMessageDialog(null, "El elemento buscado es: " + listaen.searchByValue(elemento), 
                                "Elemento encontrado", JOptionPane.INFORMATION_MESSAGE);       
                        break;
                    }

                    case 5 -> {
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Borrar elemento",
                                "Borrando elemento del nodo", JOptionPane.INFORMATION_MESSAGE));
                                listaen.deleteFromPosition(elemento);
                                JOptionPane.showMessageDialog(null, "El elemento eliminado es: " + elemento, 
                                "Elemento encontrado", JOptionPane.INFORMATION_MESSAGE);  
                        break;
                    }
                    
                    case 6 -> {
                        JOptionPane.showMessageDialog(null, "Saliendo", "Fin", JOptionPane.INFORMATION_MESSAGE);
                        break;
                        
                       /* default:
                            JOptionPane.showMessageDialog(null, "Opcion no disponible", "Error", JOptionPane.INFORMATION_MESSAGE);
                            break;*/
                            
                    }
        }
            
            }catch(NumberFormatException n){
                JOptionPane.showMessageDialog(null, "Error" + n.getMessage());
            }
        }while(opcion != 5);
    
    }
}
