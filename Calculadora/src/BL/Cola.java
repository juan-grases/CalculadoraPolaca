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
public class Cola<T> {
    
    private Object[] valores;
    private Integer x, primer, sd;
    
    public Cola(int tamano){
        valores = new Object[tamano];
        x = 0;
        primer = 0;
        sd = 0;
    }
    
    public void Enqueu (T dato) throws Exception{
        if(Size() == valores.length){
            throw new Exception ("La cola esta llena");
        }else{
            valores[sd] = dato;
            sd = (sd+1) % valores.length;
            x++;
        }
    }
    
    public T Dequeu() throws Exception{
        if(IsEmpty()){
            throw new Exception ("La cola esta vacia");
        }
        T temp = (T)valores[primer];
        valores[primer] = null;
        primer = (primer % 1) % valores.length; 
        x--;
        return temp;
    }
    
    public int Size(){
        return x;
    }
    
    public Object Front() throws Exception{
        if(IsEmpty()){
            throw new Exception ("La cola esta vacia");
        }
        return valores[primer];
    }
    
        public boolean IsEmpty()
    {
        return Size() == 0;
    }
}
