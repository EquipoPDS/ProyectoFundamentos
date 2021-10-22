public class Vehiculo{
    public static Vehiculo[] vehiculos = new Vehiculo[10];
    public static int tamano = 10;
    public static int posAnadir = 0;
    private int modelo;
    private String marca;
    private double valorComercial;
    private String color;

    public Vehiculo(){

    }

    public Vehiculo(int mo, String ma, double va){   
        this(mo, ma, va,"verde");
    }

    public Vehiculo(int mo, String ma, double va, String co){
        this.modelo = mo;
        this.marca = ma;
        this.valorComercial = va;
        this.color = co;
    }

    public int getModelo(){
        return this.modelo;
    }

    public String getMarca(){
        return this.marca;
    }

    public double getValorComercial(){
        return this.valorComercial;
    }

    public String getColor(){
        return this.color;
    }

    public void setModelo(int mo){
        this.modelo = mo;
    }

    public void setMarca(String ma){
        this.marca = ma;
    }

    public void setValorComercial(double va){
        this.valorComercial = va;
    }

    public void setColor(String co){
        this.color = co;
    }

    public String toString(){
        return "\nModelo: " + this.modelo + "\nMarca: " + this.marca + "\nValor Comercial: " + this.valorComercial + "\nColor: " + this.color + "\n";
    }

    public static void anadirVehiculo(int mo, String ma, double va, String co){
        vehiculos[Vehiculo.posAnadir] = new Vehiculo(mo, ma, va, co);
        Vehiculo.posAnadir += 1;
    }

    public static String toStringVehiculosModelo(){
        String concatenado = "";

        for(int i=0; i<Vehiculo.posAnadir; i++){
            if(vehiculos[i].getModelo() >= 2000 && vehiculos[i].getModelo() <= 2021){
                concatenado += vehiculos[i].toString();
            }
        }
        return concatenado;
    }
    
    public static String toStringVehiculosVerdes(){
        String concatenado = "";

        for(int i=0; i<Vehiculo.posAnadir; i++){
            if(vehiculos[i].getColor().equalsIgnoreCase("verde")){
                concatenado += vehiculos[i].toString();
            }
        }
        return concatenado;
    } 

    public static String toStringVehiculos(){
        String concatenado = "";

        for(int i=0; i<Vehiculo.posAnadir; i++){
            concatenado += vehiculos[i].toString();
        }
        return concatenado;
    }

    public static int cantidadVehiculos(){
        return Vehiculo.posAnadir;
    }
}
