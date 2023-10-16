import java.util.ArrayList;

public abstract class Jugador {
    private String nombre;
    protected double saldo;
    protected ArrayList<Apuesta> apuestas;
    
    public Jugador() {
        this.apuestas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ArrayList<Apuesta> getApuestas() {
        return apuestas;
    }

    public void setApuestas(ArrayList<Apuesta> apuestas) {
        this.apuestas = apuestas;
    }
    
    // Otros métodos abstractos y concretos que podrían ser necesarios
}