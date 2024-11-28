import java.util.Scanner;

public class estructuraDatos {

    public static void main(String[] args){

        //vamos hacer un programa de seleccion de tareas

        //un objeto que se encargue de poder comportarse de acuerdo al tipo de dato
        Scanner entrada = new Scanner(System.in);

        //variables
        int opcion, numbinario;
        char letra;
        String binario = "";


        do{
            System.out.println("Bienvenido al programa de tareas comunes");
            System.out.println("1.- Descuento por edad");
            System.out.println("2.- Convertir numero decimal a binario");
            System.out.println("3.- Conversiones de Temperatura");
            System.out.println("4.- Tiendita");

            opcion = entrada.nextInt();

            //menu 
            switch (opcion) {
                case 1:
                    System.out.println("Aqui van a hacer un programa que si tienes mas de 65 años haga un 8% de descuento a un producto");
                    
                    break;
                case 2:
                    //convertir binario
                    System.out.println("Ingresa el numero que desees convertir a binario, debe ser un entero positivo");
                    numbinario = entrada.nextInt();

                    //tengo que saber que sea positivo
                    if(numbinario > 0){
                        //esta es la condicion verdadera
                        while(numbinario > 0){
                            if(numbinario%2 == 0){
                                binario = "0" + binario;
                            }else{
                                binario = "1" + binario;
                            }
                            numbinario = (int)numbinario/2;
                        }
                    }else if(numbinario == 0){
                        binario = "0";

                    }else{
                        binario = "No se puede convertir ese numero";
                    }
                    System.out.println("El binario es: " + binario);
            
                default:
                    break;
            }




            //si quiero repetir el programa
            System.out.println("Desea repetir el programa?");
            letra = entrada.next().charAt(0);


        }while(letra == 's' || letra == 'S');
    }
}