


import java.util.ArrayList;

public class Parada {
    private String nombre;
    private ArrayList<Pasajero> pasajeros;

    public Parada(String nombre) {
        this.nombre = nombre;
        this.pasajeros = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarPasajero(Pasajero pasajero) {
        pasajeros.add(pasajero);
    }

    public void subirPasajeros() {
        for (Pasajero pasajero : pasajeros) {
           
        	if (!pasajero.getSubio()) {
                
        		System.out.println("El pasajero " + pasajero.getNombre() + " subió al colectivo en la parada " + nombre);
                
                pasajero.setSubio(true);
            }
        }
    }
}

