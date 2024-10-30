public class App {
    public static void main(String[] args) throws Exception {
        Recursividad recursividad = new Recursividad();
        int resultado = recursividad.factorial(5); 
        System.out.println(resultado); 

        System.out.println("El resultado de los numeros consecutivos de 5 es: " + recursividad.sumaConsecutivos(5));
        System.out.println("El resultado de la potencia es: "+ recursividad.potencia(2,3));
        System.out.println("El resultado de los digitos de 456 es: " + recursividad.sumaNumeros(456));
        System.out.println("La serie fibonacci es: " + recursividad.fibonacci(10));

        RenombrarDirectorios rd = new RenombrarDirectorios();
        rd.renombrarDirectorios("src/app/java/directorios");
        rd.renombrarDirectorios("src/directorios");
    }
}