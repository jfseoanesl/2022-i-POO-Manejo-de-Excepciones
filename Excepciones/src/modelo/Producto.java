package modelo;

import Excepciones.MyExcepcion;

public class Producto {
    private int codigo;
    private String descripcion;
    private double precio;

    public Producto() {
    }

    public Producto(int codigo, String descripcion, double precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    
    public String obtenerString() throws MyExcepcion {
        return "Producto{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", precio=" + precio 
                + ", length="+this.lenDescripcion()+'}';
    }
    
    public int lenDescripcion() throws MyExcepcion {// tamaño en num de caracteres del descripcion del producto
        if(this.descripcion==null)
            throw new MyExcepcion("El valor de descripcion es null");
        
        return this.descripcion.length();
    }
    
    
}
