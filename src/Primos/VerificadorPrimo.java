package Primos;

public class VerificadorPrimo extends NumerosPrimos {
    public void verificarSiEsPrimo(int numero){
        if (verificarPrimalidad(numero)){
            System.out.println("El número "+numero+" es primo");
        }else{
            System.out.println("El número "+numero+" no es primo");
        }
    }

}
