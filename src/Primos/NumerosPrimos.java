package Primos;

public class NumerosPrimos {
    public boolean verificarPrimalidad(int numero){
       if (numero<=1){
           return false;
       }
         for(int i=2;i*i<=numero;i++){
              if(numero%i==0){
                return false;
                
              }
         }
            return true;
         }

    
    public void listarPrimos(int numero){
        for(int i=2;i<=numero;i++){
            int divisor =2;
            boolean esPrimo = true;
            //usamos un bucle para recorrer todas las posiciones i del array con longitud numero
            while(divisor<i){
                if(i%divisor==0){
                    esPrimo = false;
                    break;
                }
                divisor++;
            }
            if (esPrimo){
                System.out.println(i);
            }
        }
    }

}
