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
public class Pila<T> {
    
        private Object[] valores;
        private Integer x;
    
    public Pila(int tamano){
        valores = new Object[tamano];
    }

    Pila() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void push (T dato) throws Exception
    {
        if(size() == valores.length){
            throw new Exception ("La pila esta llena");
        }else{
            valores[x] = dato;
            x++;
        }
    }
    
    public T pop() throws Exception
    {
        if(IsEmpty()){
            throw new Exception ("La pila esta vacia");
        }
        T temp = (T)valores[size() -1];
        valores[size() - 1] = null;
        x--;
        return temp;
    }
    
    public Object top() throws Exception
    {
        if(IsEmpty()){
            throw new Exception ("La pila esta vacia");
        }
        
        return valores[size() -1];
    }
    
    public int size()
    {
        return x;
    }
    
    public boolean IsEmpty()
    {
        return size() == 0;
    }
}
