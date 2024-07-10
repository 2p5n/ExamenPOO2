package Controller;
public class Portero extends Jugador{
    public int atajadas;
    public Portero(int atajadas, String nombre, String numeroDorsal, String rut, int numGoles) {
        super(nombre, numeroDorsal, rut, numGoles);
        this.atajadas = atajadas;
    }
    @Override
    public double calcularValoracion() {
        double valoracion = 0;
        return valoracion = (this.numGoles*30)/10;
        
    }
    @Override
    public double calcularValoracionPorTipo() {
        double valoracion = 0;
        return valoracion = (this.numGoles + (this.atajadas*5))/2;
    }

    @Override
    public String toString() {
        return "Portero{" + super.toString() +"atajadas=" + atajadas + '}';
    }
    
}