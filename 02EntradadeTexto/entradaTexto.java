class entradaTexto{

    //este programa tiene como objetivo realizar una entrada de texto standar

    //variables globales

    //metodo principal

    public static void main(String[] args){
        //la estructura basica de un programa es
        //declaracion de variables particuales
        String nombre;

        System.out.println("Por favor intoduce su nombre: ");

        nombre = System.console().readLine();

        System.out.println("El nombre ingreado es: " + nombre + " Bienvenido");
    }
}