import Vehiculos.Coche;
import Vehiculos.ModeloCoche;

public class App {
    public static void main(String[] args) throws Exception {
    ModeloCoche modeloCoche = new ModeloCoche();
        modeloCoche.setMarca("Seat");
        modeloCoche.setModelo("Ibiza");
        modeloCoche.setPrecioAño1(500);
        modeloCoche.setPrecioAño2(300);
        modeloCoche.setPrecioAño3(250);
        modeloCoche.getPrecioMedio();
        modeloCoche.getPrecioMayor();
        modeloCoche.getPrecioMenor();
    }
}
