package Controller;
public abstract class Jugador {
    public String nombre;
    public String numeroDorsal;
    public String rut;
    public int numGoles;

    public Jugador(String nombre, String numeroDorsal, String rut, int numGoles) {
        this.nombre = nombre;
        this.numeroDorsal = numeroDorsal;
        this.rut = rut;
        this.numGoles = numGoles;
    }
    abstract public double calcularValoracion();
    abstract public double calcularValoracionPorTipo();

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", numeroDorsal=" + numeroDorsal + ", rut=" + rut + ", numGoles=" + numGoles + '}';
    }
    
}
