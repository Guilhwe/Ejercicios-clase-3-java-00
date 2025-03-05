package Vehiculos;

public class Coche {
    private String marca;
    private String modelo;
    private double precioAño1;
    private double precioAño2;
    private double precioAño3;

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }
    public double getPrecioAño1() {
        return precioAño1;
    }

    public void setPrecioAño1(double precioAño1) {
        this.precioAño1 = precioAño1;
    }

    public double getPrecioAño2() {
        return precioAño2;
    }

    public void setPrecioAño2(double precioAño2) {
        this.precioAño2 = precioAño2;
    }

    public double getPrecioAño3() {
        return precioAño3;
    }

    public void setPrecioAño3(double precioAño3) {
        this.precioAño3 = precioAño3;
    }

    private double precioMedio(double precioAño1, double precioAño2, double precioAño3) {
        return (precioAño1 + precioAño2 + precioAño3) / 3;
    }


    public void getPrecioMedio() {
        System.out.println("El precio medio del "+ marca+" "+ modelo+ " es " +precioMedio(precioAño1, precioAño2, precioAño3)+ "€");
    }

    private double precioMayor(double precioAño1, double precioAño2, double precioAño3) {
        return Math.max(precioAño1, Math.max(precioAño2, precioAño3));
    }

    public void getPrecioMayor() {
        System.out.println("El mayor precio del "+ marca+" "+ modelo+ " fue " +precioMayor(precioAño1, precioAño2, precioAño3)+ "€");
    }

    private double precioMenor(double precioAño1, double precioAño2, double precioAño3) {
        return Math.min(precioAño1, Math.min(precioAño2, precioAño3));
    }

    public void getPrecioMenor() {
        System.out.println("El menor precio  del "+ marca+" "+ modelo+ " fue " +precioMenor(precioAño1, precioAño2, precioAño3)+ "€");
    }
    
    
    


}
