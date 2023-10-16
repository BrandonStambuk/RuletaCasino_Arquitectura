import java.util.ArrayList;

public class JugadorVIP extends Jugador {
    private int nivelVIP;
    private double bonoVIP;
    private boolean accesoSalasPrivadas;

    public JugadorVIP() {
        super(); // Llama al constructor de la clase base (Jugador)
        // Inicialización de atributos específicos para JugadorVIP
        nivelVIP = 0;
        bonoVIP = 0.0;
        accesoSalasPrivadas = false;
    }

    
    
    
    
    
    
    
    public int getNivelVIP() {
        return nivelVIP;
    }

    public void setNivelVIP(int nivelVIP) {
        this.nivelVIP = nivelVIP;
    }

    public double getBonoVIP() {
        return bonoVIP;
    }

    public void setBonoVIP(double bonoVIP) {
        this.bonoVIP = bonoVIP;
    }

    public boolean tieneAccesoSalasPrivadas() {
        return accesoSalasPrivadas;
    }

    public void setAccesoSalasPrivadas(boolean accesoSalasPrivadas) {
        this.accesoSalasPrivadas = accesoSalasPrivadas;
    }

    // Otros métodos específicos para JugadorVIP
}