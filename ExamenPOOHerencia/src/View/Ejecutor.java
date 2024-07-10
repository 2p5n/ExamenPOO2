package View;
import Controller.Atacante;
import Controller.Defensor;
import Controller.Jugador;
import Controller.Portero;
import java.util.ArrayList;
public class Ejecutor {
    public static void main(String[] args) {
        ArrayList<Jugador> atacantes = new ArrayList<>();
        ArrayList<Jugador> defensores = new ArrayList<>();
        ArrayList<Jugador> porteros = new ArrayList<>();
        Jugador atacante1 = new Atacante(70, 9, "Rondon", "10", "011", 60);
        Jugador atacante2 = new Atacante(40, 6, "Lewansdowski", "112", "01", 45);
        Jugador atacante3 = new Atacante(25, 4, "Messi", "08", "013", 30);
        atacantes.add(atacante1);
        atacantes.add(atacante2);
        atacantes.add(atacante3);
        Jugador defensor1 = new Defensor(40, 25, "Aramburu", "04", "021", 20);
        Jugador defensor2 = new Defensor(30, 15, "Pique", "23", "022", 10);
        Jugador defensor3 = new Defensor(20, 10, "Alonso", "05", "023", 5);
        defensores.add(defensor1);
        defensores.add(defensor2);
        defensores.add(defensor3);
        Jugador portero1 = new Portero(25, "Romo", "23", "031", 3);
        Jugador portero2 = new Portero(20, "Dibu", "07", "032", 2);
        Jugador portero3 = new Portero(10, "Memo", "12", "033", 1);
        porteros.add(portero1);
        porteros.add(portero2);
        porteros.add(portero3);
        for (Jugador atacante : atacantes) {
            System.out.println("\n" + atacante);
            System.out.println("Valoracion:" + atacante.calcularValoracion());
            System.out.println("Valoracion por atacante:" + atacante.calcularValoracionPorTipo() + "\n");
        }
        for (Jugador defensor : defensores) {
            System.out.println("\n" + defensor);
            System.out.println("Valoracion:" + defensor.calcularValoracion());
            System.out.println("Valoracion por defensor:" + defensor.calcularValoracionPorTipo() + "\n");
        }
        for (Jugador portero : porteros) {
            System.out.println("\n" + portero);
            System.out.println("Valoracion:" + portero.calcularValoracion());
            System.out.println("Valoracion por portero:" + portero.calcularValoracionPorTipo() + "\n");
        }
    }
}