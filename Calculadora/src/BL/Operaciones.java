/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

/**
 *
    * @author Valgher Moreno
    * http://www.github.com/valgherm
 */
public class Operaciones {
    
/**************************** OPERACIONES *************************************/
    
    //Metodo que recibe dos numeros por parametros y realiza la suma
    public double Suma(double numero, double numero2){
        double resultado; //Variable para obtener resultado con decimales
        resultado = numero + numero2; //Operacion algebraica de la suma
        return resultado; //Retorna el valor del resultado
    }
    
    //Metodo que recibe dos numeros por parametros y realiza la resta
    public double Resta(double numero, double numero2){
        double resultado; //Variable para obtener resultado con decimales
        resultado = numero - numero2; //Operacion algebraica de la resta
        return resultado; //Retorna el valor del resultado
    }
    
    //Metodo que recibe dos numeros por parametros y realiza la multiplicacion
    public double Multiplicacion(double numero, double numero2){
        double resultado; //Variable para obtener resultado con decimales
        resultado = numero * numero2; //Operacion algebraica de la multiplicacion
        return resultado; //Retorna el valor del resultado
    }
    
    //Metodo que recibe dos numeros por parametros y realiza la division
    public double Division(double numero, double numero2){
        double resultado; //Variable para obtener resultado con decimales
        resultado = numero / numero2; //Operacion algebraica de la division
        return resultado; //Retorna el valor del resultado
    }
    
    //Metodo que recibe un numero por parametro y realiza el seno
    public double Seno(int numero){
        double resultado = 0; //Variable para obtener resultado con decimales
        resultado = Math.sin(numero); //Operacion matematica para obtener el seno del valor
        return resultado; //Retorna el valor del resultado
    }
    
    //Metodo que recibe un numero por parametro y realiza el coseno
    public double Coseno(int numero){
        double resultado = 0; //Variable para obtener resultado con decimales
        resultado = Math.cos(numero); //Operacion matematica para obtener el coseno del valor
        return resultado; //Retorna el valor del resultado
    }
    
    //Metodo que recibe un numero por parametro y realiza la secante
    public double Secante(int numero){
        double resultado = 0; //Variable para obtener resultado con decimales
        resultado = 1/Math.cos(numero); //Operacion matematica para obtener la secante del valor
        return resultado; //Retorna el valor del resultado
    }
    
    //Metodo que recibe un numero por parametro y realiza la cosecante
    public double Cosecante(int numero){
        double resultado; //Variable para obtener resultado con decimales
        resultado = 1/Math.sin(numero); //Operacion matematica para obtener la cosecante del valor
        return resultado; //Retorna el valor del resultado
    }
    
    //Metodo que recibe un numero por parametro y realiza la tangente
    public double Tangente(int numero){
        double resultado = 0; //Variable para obtener resultado con decimales
        resultado = Math.tan(numero); //Operacion matematica para obtener el seno del valor
        return resultado; //Retorna el valor del resultado
    }
    
    //Metodo que recibe un numero por parametro y realiza la cotangente
    public double Cotangente(int numero){
        double resultado = 0; //Variable para obtener resultado con decimales
        resultado = 1/Math.tan(numero); //Operacion matematica para obtener la cotangente del valor
        return resultado; //Retorna el valor del resultado
    }
    
/**************************** VALIDACIONES ************************************/
    
    //Metodo para comprobar si es un parentesis izquierdo
    public boolean EsParentesisIzq(String caracter) throws Exception{
        if(caracter == "(") {
            return true;
        }else{
            return false;
        }
    }
    
    //Metodo para comprobar si es un parentesis derecho
    public boolean EsParentesisDer(String caracter) throws Exception{
        if(caracter == ")") {
            return true;
        }else{
            return false;
        }
    }
    
    //Metodo para comprobar si es un operador
    public boolean EsOperador(String caracter) throws Exception{
        if(caracter == "+" || caracter == "-" || caracter == "*" || caracter == "/" || 
                caracter == "x" || caracter == "y" || caracter == "z") {
           return true;
        }else{
            return false;
        }
    }
    
    //
    public boolean EsNumero(String caracter) throws Exception{
        if (caracter == "0" || caracter == "1" || caracter == "2" || caracter == "3"
                || caracter == "4" || caracter == "5" || caracter == "6"
                || caracter == "7" || caracter == "8" || caracter == "9"){
            return true;
        }else{
            return false;
        }
    }
    
    //
    public int Prioridad(char caracter) {
        if (caracter == '*' || caracter == '/') {
            return 2;
        } else {  
            if (caracter == '+' || caracter == '-') {
                return 1;
            } else {
                return 0;
            }
        }    
    }
    
    
    
}
