package Controller;
public class Atacante extends Jugador{
    public int pasesExito;
    public int numBalonRecuperado;

    public Atacante(int pasesExito, int numBalonRecuperado, String nombre, String numeroDorsal, String rut, int numGoles) {
        super(nombre, numeroDorsal, rut, numGoles);
        this.pasesExito = pasesExito;
        this.numBalonRecuperado = numBalonRecuperado;
    }
    @Override
    public double  calcularValoracion() {
        double valoracion = 0;
        return valoracion = ((this.numGoles*30))/10;
    }

    @Override
    public double calcularValoracionPorTipo() {
        double valoracion = 0;
        return valoracion = (this.numGoles + (this.pasesExito*2) + (this.numBalonRecuperado*3))/4;
    }

    @Override
    public String toString() {
        return "Atacante{" + super.toString() + "pasesExito=" + pasesExito + ", numBalonRecuperado=" + numBalonRecuperado + '}';
    }
    
}
