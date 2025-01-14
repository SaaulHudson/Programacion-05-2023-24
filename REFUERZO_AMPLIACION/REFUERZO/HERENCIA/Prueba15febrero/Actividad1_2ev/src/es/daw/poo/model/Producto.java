package es.daw.poo.model;

import java.time.LocalDate;

//public  class Producto {
public abstract  class Producto {
    private LocalDate fechaCaducidad;
    private int numeroLote;
   
    public Producto(LocalDate fechaCaducidad, int numeroLote){
        this.fechaCaducidad = fechaCaducidad;
        this.numeroLote = numeroLote;
    }
   
    public void setFechaCaducidad(LocalDate fecha){
        fechaCaducidad = fecha;
    }
   
    public void setNumeroLote(int num){
        numeroLote = num;
    }
   
    public LocalDate getFechaCaducidad(){
        return fechaCaducidad;
    }
   
    public int getNumeroLote(){
        return numeroLote;
    }

    public abstract boolean validar();

    @Override
    public String toString() {
        return "Producto [fechaCaducidad=" + fechaCaducidad + ", numeroLote=" + numeroLote + "]";
    }

    
}
    

