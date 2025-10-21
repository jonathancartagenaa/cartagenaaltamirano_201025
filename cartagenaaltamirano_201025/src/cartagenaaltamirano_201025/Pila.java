/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cartagenaaltamirano_201025;

/**
 *
 * @author UFG
 */
public class Pila {
    
    private int[] elementos;
    private int cima;
    private int capacidad;
    
    
    // METODO CONSTRUCTOR DE LA CLASE PILA
    // AL INSTANCIAR UNA NUEVA VARIABLE DE TIPO PILA, ENTONCES
    // SE CREARA EN MEMORIA UN OBJETO CON LOS ATRIBUTOS QUE ESTAS
    // DENTRO DE ESTE CONSTRUCTOR
    
    public Pila(int tamano){
        
        this.capacidad = tamano; // CANTIDAD DE ELEMENTOS QUE SE VAN A ALMACENAR EN LA PILA
        this.elementos = new int[this.capacidad]; // SE CREA UN NUEVO ARREGLO DE TIPO ENTERO
        this.cima = -1;  // EL VALOR POR DEFECTO DE LA CIMA ES -1 (VACIA)
        
        
    }
    //METODO PARA VERIFICAR SI LA PILA ESTA VACIA, ES DECIR, SI NO HAY ELEMENTOS
    // O VALORES APILADOS        
    public boolean estaVacia(){
        
        if(this.cima == -1){
            //EL VALOR DE LA CIMA ES -1 POR LO TANTO, LA PILA ESTA VACIA
            return true;
            }else{
            //EL VALOR DE LA CIMA ES UN NUMERO DIFERENTE DE -1 POR LO TANTO
            // LA PILA SE TIENE AL MENOS UN VALOR O UN ELEMENTO
            return false;
        }
        
        
    }
    
    public boolean estaLlena(){
        
        if(this.cima ==(this.capacidad - 1 )){
            
            //EL VALOR DE LA CIMA ES IGUAL A LA CANTIDAD DE ELEMENTOS
            return true;
            }else{
            // EL VALOR DE LA CIMA ES DIFERENTE A LA CANTIDAD DE ELEMENTOS
            return false;
            }
        
    }
    
    // DEVUELVE EL VALOR DE LA CIMA ES DECIR EL VALOR DE EL ULTIMO ELEMENTO
    // QUE FUE INSERTADO AL ARRELGO
    public int tamano(){
        return this.cima + 1;
        
    }
    
    // METODO PARA AGREGAR ELEMENTOS AL ARREGLO, ES DECIR A LA PILA
    //PRIMEROS SE DEBE REALIZAR LA VERIFICACION DEL TAMANO DE LA PILA
    // UNA VEZ VERIFICADA SE PUEDE AGREGAR EL ELEMENTO AL ARREGLO
    
    public void push(int elemento){
        
        //PRIMERO SE VERIFICA SI LA PILA ESTA LLENA
        if(estaLlena()){
            System.out.println("La pila esta llena, no puede agregar el valor: "+elemento);
            // return;
        }else{
            this.cima++; // SE INCREMENTA EL VALOR DE LA CIMA
            this.elementos[this.cima] = elemento; // SE AGREGA EL NUEVO ELEMENTO AL ARREGLO (A LA PILA)
            System.out.println("El valor: "+elemento+" fue agregado a la pila");
            
        }
        
    }
    // METODO PARA EXTRAER UN ELEMENTO DE LA PILA (EL ULTIMO QUE HA SIDO INSERTADO AL ARREGLO)
    public int pop(){
        
        // SE VERIFICA QUE, LA PILA NO ESTE VACIA PARA PODER EXTRAER UN ELEMENTO
        if(estaVacia()){
            //SI ESTA VACIA, POR LO TANTO, SE NOTIFICARA AL USUARIO
            System.out.println("La pila esta vacia, no puede hacer la extraccion del elemento");
            // NO SE REALIZA NINGUNA ACCION
            return -1;
            }else{
            // SI HAY ELEMENTOS QUE EXTRAER, POR LO TANTO, SE CREA UNA NUEVA VARIABLE
            // QUE ALMACENARA EL VALOR QUE SERA EXTRAIDO
            int elementoExtraido = this.elementos[this.cima];// LA NUEVA VARIABLE POSEE EL VALOR DE ULTIMO ELEMENTO INSERTADO AL ARREGLO
            this.cima--; // SE REDUCE EL VALOR DE LA CIMA DEBIDO A QUE YA SE EXTRAJO UN ELEMENTO
            return elementoExtraido;// SE DEVUELVE AL USUARIO EL VALOR QUE FUE EXTRAIDO
        }
        
    } 
    
    //METODO PARA VERIFICAR EL ULTIMO VALOR INSERTADO, ES DECIR, VER EL VALOR QUE SE PUEDE
    //EXTRAER DE LA PILA
    public int peek(){
        
        // SE VERIFICA SI ESTA VACIA
        if(estaVacia()){
            // SI ESTA VACIA, POR LO TANTO, SE MUESTRA MENSAJE AL USUARIO
            System.out.println("La pila esta vacia");
            //NO SE REALIZA NINGUNA ACCION
            return -1;
        }else{
            // SE DEVUELVE AL USUARIO EL ULTIMO ELEMENTO QUE FUE INSERTADO
            // Y QUE ES EL PROXIMO ELEMENTO A SER EXTRAIDO
            return this.elementos[this.cima];
        }
    }
    
    //METODO PARA IMPRIMIR LOS VALORES QUE POSEE UNA PILA, ES DECIR,
    //IMPRIMIR TODOS LOS VALORES DEL ARREGLO, DESDE EL ULTIMO QUE FUE
    // AGREGADO, HASTA EL PRIMERO (EN ESE ORDEN)
    public void mostrar(){
         
        // SE VERIFICA QUE LA PILA NO ESTE VACIA
        if(estaVacia()){
            // SI ESTA VACIA, POR LO TANTO NO SE REALIZA NADA
            System.out.println("La pila esta vacia");
        }else{
            //SE IMPRIME LA SALIDA AL USUARIO
            System.out.println("Contenido de la pila (desde la cima, hasta la base de la pila)");
            // SE INICIA UNA ESTRUCTURA CON CORCHETE "["
            System.out.print("[");
            // SE DEBE RECORRER EL ARRELGO DE LA PILA PARA PODER IMPRIMIR CADA VALOR
            // EN LA ESTRUCTURA ITERATIVA DE INICIA DESDE EL VALOR DE LA CIMA; ES DECIR;
            // DESDE LA ULTIMA POSICION AGREGADA AL ARREGLO, MIENTRAS EL VALOR DE "i" SEA 
            // MAYOR QUE CERO (ES DECIR QUE AUN NO A LLEGADO A LA BASE DE LA PILA), EL VALOR
            // DE "i" ESTARA EN DECREMENTO HASTA LLEGAR AL CERO
            
            for(int i = this.cima; i >= 0; i--){
                // SE IMPRIME CADA VALOR DE SU POSICION CORRESPONDIENTE DE MANERA CONTINUA (SIN SALTOS DE LINEA)
                System.out.println(this.elementos[i]);
                //SE VERIFICA SI EL VALOR DE "i" ES MAYOR QUE CERO PARA PODER IMPRIMIR UN CARACTER
                if(i > 0){
                    // "i" NO HA LLEGADO A CERO, POR LO TANTO, SE PUEDE IMPRIMIR UNA COMA
                    System.out.print(",");// SE IMPRIME COMA
                }
            }
            
            // SE CIERRA LA ESTRUCTURA DE CORCHETE PARA LA SALIDA DEL ISUARIO FINAL
            System.out.print("]");
        }
        
    }
    
}
