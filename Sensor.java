public class Sensor{
    public static Sensor[] sensores = new Sensor[8];
    public static Sensor[] sensores2= new Sensor[8];
    public static int tamano=8;
    public static int posAnadir=0;
    private String tipo;
    private double valor;
    
    
    public Sensor(){
    
    }
    
    public Sensor(String t, double v){
        this.tipo = t;
        this.valor = v;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    public double getValor(){
        return this.valor;
    }
    
    public void setTipo(String t){
        this.tipo = t;
    }
    
    public void setValor(double v){
        this.valor = v;
    }
    
    public String toString(){
        return "\nTipo: " + this.tipo + "\nValor: " + this.valor + "\n";
    }
    
    public static void anadirSensor(String t, double v){
        sensores[Sensor.posAnadir] = new Sensor(t, v);
        Sensor.posAnadir += 1;
    }
    
    public static void ordenarSensor() {
        int contador = 0;
        for (boolean ordenado = false; !ordenado;) {
            // Para cambiar el ordenamiento de menor a mayor, a que sea de mayor a menor
            // solo se cambia el '<' por un '>'.
            for (int i = 0; i < Sensor.posAnadir - 1; i++) {
                  if (sensores[i].getValor() > sensores[i+1].getValor()) {
                      // Intercambiamos los valores 
                      Sensor aux = sensores[i];
                      sensores[i] = sensores[i + 1];
                      sensores [i + 1] = aux;
                      // Indicamos que hay un cambio
                      contador++;
                  }
            }
            // Si el arreglo ya se encontraba ordenado, el contador va a ser = 0
            if (contador == 0) {
                ordenado = true;
            }
            contador = 0;
        }   
    }
    
    public static String toStringSensores(){
        String concatenados = "";
        for(int i=0; i<Sensor.posAnadir; i++){
            concatenados += sensores[i].toString();
        }
        return concatenados;
    }
    
    public static int cantidadSensores(){
        return Sensor.posAnadir;
    }
    
    public static String toStringTemperatura(){
        String sensorest="";
        for(int i=0; i<Sensor.posAnadir; i++){
            if(sensores[i].getTipo().equals("Temperatura") ||sensores[i].getTipo().equals("temperatura")){
             sensorest += sensores[i].toString();
            }
        }

        return sensorest;
    }
    
}


