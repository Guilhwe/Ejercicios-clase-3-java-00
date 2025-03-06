package Primos;

public class GeneradorPrimo extends NumerosPrimos{
    public int generadorPrimo(int ultimoPrimo){
        int numero = ultimoPrimo+1;
        while(!verificarPrimalidad(numero)){
            numero++;
        }
        return numero;
    }

}
