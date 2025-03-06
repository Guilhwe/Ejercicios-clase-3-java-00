package Banco;

public class CuentaBancaria {
    //Se usa la etiquete protected para que las clases hijas puedan acceder a la variable
    protected int saldo =1000;
    public void consultarSaldo(){
        System.out.println( "Saldo: " + saldo);
    }
    public void depositar(int cantidad){
        saldo += cantidad;
         System.out.println("Despues del ingreso el saldo es de " + saldo);
    }
    public void retirar(int cantidad){
        saldo -= cantidad;
         System.out.println("Despues de la retirada el saldo es de " + saldo);
    }

    public int getSaldo() {
        return saldo;
    }

    
}
