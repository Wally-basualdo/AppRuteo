package appRuteo;

public class Pasajero {
       private String nombre;
       private boolean subio;
       
       public Pasajero(String nombre) {
    	this.nombre = nombre;
    	this.subio = false;
    	   
    }
       public String getNombre() {
           return nombre;
       }

       public boolean getSubio() {
           return subio;
       }

       public void setSubio(boolean subio) {
           this.subio = subio;
       }
   }         


        