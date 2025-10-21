/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cartagenaaltamirano_201025;

/**
 *
 * @author UFG
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pila miPila = new Pila(5);
        
        System.out.println("La pila esta vacia?    "+miPila.estaVacia());
        System.out.println();
        
        System.out.println("AGREGANDO VALORES DEL METODO PUSH ()");
        miPila.push(10); //AGREGADO EL VALOR ENTERO 10  
        miPila.push(20); //AGREGADO EL VALOR ENTERO 20 
        miPila.push(30); //AGREGADO EL VALOR ENTERO 30 
        miPila.push(40); //AGREGADO EL VALOR ENTERO 40
        miPila.push(50); //AGREGADO EL VALOR ENTERO 50
        
        System.out.println(); // SALTO DE LINEA
        
        miPila.mostrar();
        System.out.println("Tamaño actual de la pila "+miPila.tamano()+" elementos");
        System.out.println(); // SALTO DE LINEA
        
        System.out.println("AGREGAR ELEMENTO NUEVO CON LA PILA LLENA");
        miPila.push(60);
        System.out.println(); // SALTO DE LINEA
        
        System.out.println("EXTRAER VALORES DE LA PILA");
        System.out.println("Se ha extraido el valor de: "+miPila.pop()); //SE EXTRAE EL ULTIMO DE LA PILA
        System.out.println("Se ha extraido el valor de: "+miPila.pop()); //NUEVAMENTE SE EXTRAE EL ULTIMO DE LA PILA
        System.out.println(); // SALTO DE LINEA
        
        System.out.println("MOSTRANDO VALORES DE LA PILA");
        miPila.mostrar();
        System.out.println("Tamaño actual de la pila "+miPila.tamano()+" elementos");
        System.out.println(); // SALTO DE LINEA
        
        System.out.println(" SE EXTRAEN TODOS LOS ELEMENTOS DE PILA");
        // SE RECORREN LOS VALORES DE PILA
        while(!miPila.estaVacia()){
            System.out.println("Se ha extraido el valor de: "+miPila.pop());
        }
        
        miPila.pop();
        System.out.println(); // SALTO DE LINEA
        
        System.out.println("VERIFICACION DEL ULTIMO VALOR AGREGADO");
        System.out.println("El elemento de la cima es: "+miPila.peek());
        System.out.println(); // SALTO DE LINEA
        }
    
    
}
