package modelo;

import Excepciones.MyExcepcion;

public class Parrafo {
    private String texto;

    public Parrafo() {
    }

    public Parrafo(String texto) {
        this.texto = texto;
    }

    /**
     * @return the texto
     */
    public String getTexto() {
        return texto;
    }

    /**
     * @param texto the texto to set
     */
    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    public void imprimirTexto() throws MyExcepcion{
        
        System.out.println("texto="+this.getTextUpper());
        
    }
    
    public String getTextUpper() throws MyExcepcion{
         
        if(this.texto==null)
            throw new MyExcepcion("El texto del paraafo no puede ser null");
        
        return this.texto.toUpperCase();
    }
    
}
