import java.util.Scanner;

public class Principal{
    public static void main(String[] args){
        Principal.mostrarMenu();
    }

    public static void mostrarMenu(){
        Scanner input = new Scanner(System.in);
        int infinito = 0;
        while(infinito == 0){
            System.out.println("Menú:\n0: Finalizar ejecución del programa.\n1: Crear vehiculo nuevo.\n2: Mostrar información de los vehiculos creados al momento.\n3: Mostrar la cantidad de vehiculos creados hasta el momento.\n4: Mostrar información de todos los vehiculos color verde.\n5: Mostrar información de todos los vehiculos con modelo entre 2000 y 2021\n6: Crear un nuevo sensor.\n7: Mostrar información de los sensores creados al momento.\n8: Mostrar cantidad de todos los sensores creados hasta el momento.\n9: Mostrar información de todos los sensores tipo temperatura.\n666: Mostrar los sensores tipo temperatura ordenados por valor de menor a mayor.");
            System.out.print("Ingrese el número correspondiente para ejecutar la acción deseada: ");
            int numUsuario = input.nextInt();
            if(numUsuario == 0){
                break;
            }else if(numUsuario == 1){
                if(Vehiculo.posAnadir < Vehiculo.tamano){
                    System.out.println("Ingrese el modelo del nuevo vehiculo:");
                    int modeloV = input.nextInt();
                    System.out.println("Ingrese la marca del nuevo vehiculo:");
                    String marcaV = input.next();
                    System.out.println("Ingrese el valor comercial del nuevo vehiculo:");
                    double valorComercialV = input.nextDouble();
                    System.out.println("Ingrese el color del nuevo vehiculo:");
                    String colorV = input.next();
                    Vehiculo.anadirVehiculo(modeloV, marcaV, valorComercialV, colorV);
                }else{
                    System.out.println("\nError, base de datos llena\n");
                }
            }else if(numUsuario == 2){
                System.out.println("\n" + "Información de todos los vehiculos almacenados hasta el momento:");
                System.out.println("\n" + Vehiculo.toStringVehiculos() + "\n");
                
            }else if(numUsuario == 3){
                System.out.print("\n" + "Cantidad de los vehiculos creados hasta el momento: ");
                System.out.println("\n" + Vehiculo.cantidadVehiculos() + "\n");
                
            }else if(numUsuario == 4){
                System.out.println("\n" + "Información de todos los vehiculos color verde almacenados hasta el momento:");
                System.out.println("\n"+ Vehiculo.toStringVehiculosVerdes() +"\n");
                
            }else if(numUsuario == 5){
                System.out.println("\n" + "Información de todos los vehiculos con modelo entre 2000 y 2021 hasta el momento:");
                System.out.println("\n" + Vehiculo.toStringVehiculosModelo() + "\n");
            }else if(numUsuario == 6){
                if(Sensor.posAnadir<8){
                System.out.println("\n" + "Ingrese los valores del sensor que desea crear:");
                System.out.println("\n" + "Ingrese el tipo:");
                String tipo=input.next();
                System.out.println("\n" + "Ingrese el valor:");
                int valor=input.nextInt();
                
                Sensor.anadirSensor(tipo,valor);
            }
            else{System.out.println("\n" + "Error base de datos llena");}
            }else if(numUsuario == 7){
                System.out.println("\n" + "Información de todos los sensores almacenados hasta el momento:");
                System.out.println("\n" + Sensor.toStringSensores() + "\n");
            }else if(numUsuario == 8){
                System.out.println("\n" + "Información de la cantidad de sensores creados hasta el momento:");
                System.out.println("\n" + Sensor.cantidadSensores()+ "\n");
            }else if(numUsuario == 9){
                System.out.println("\n" + "Información de todos los sensores de tipo “temperatura” ");
                System.out.println("\n" +Sensor.toStringTemperatura()+ "\n");
            }else if(numUsuario == 666){
                System.out.println("\n" + "");
                Sensor.ordenarSensor();
                System.out.println("\n" +Sensor.toStringTemperatura()+ "\n");
            }
        }
    }
}
