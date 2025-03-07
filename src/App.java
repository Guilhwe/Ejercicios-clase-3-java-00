
import Vehiculos.ModeloCoche;
import Animales.Perro;
import Banco.CuentaCorriente;
import Primos.GeneradorPrimo;
import Primos.NumerosPrimos;
import Primos.VerificadorPrimo;
import Animales.Gato;

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

        Perro perro = new Perro();
        Gato gato = new Gato();
        System.out.println(perro.getSonido());
        System.out.println(gato.getSonido());
        perro.moverCola();
        gato.arañaMuebles();

        CuentaCorriente cuentaCorriente = new CuentaCorriente();
        cuentaCorriente.consultarSaldo();
        cuentaCorriente.depositar(100);
        cuentaCorriente.retirar(50);
        cuentaCorriente.tarifaMantenimiento();
        cuentaCorriente.consultarSaldo();


    VerificadorPrimo verificadorPrimo = new VerificadorPrimo();
    verificadorPrimo.verificarSiEsPrimo(5);
    verificadorPrimo.verificarSiEsPrimo(10);
    verificadorPrimo.verificarSiEsPrimo(13);
    verificadorPrimo.verificarSiEsPrimo(20);

    GeneradorPrimo generadorPrimo = new GeneradorPrimo();
    System.out.println(generadorPrimo.generadorPrimo(5));
    System.out.println(generadorPrimo.generadorPrimo(10));  
    System.out.println(generadorPrimo.generadorPrimo(13));
}
}
