package Animales;

public class Perro extends Animal  {
    @Override
    public String getSonido() {
        return "Guau guau";


    }

    public void moverCola(){
        System.out.println("Mueve la cola");
    }
    
}
