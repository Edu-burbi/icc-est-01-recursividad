public class Recursividad {


    public int factorial (int n){
        System.out.println("Calculanado el factorial de: " + n);
        if (n == 0 || n == 1){
            System.out.println("Caso base alcanzado el factorial de " + n + " es 1");
            return 1;
        }
        else{
            int resultado = n * factorial(n-1);
            System.out.println("Resultado parcial para " + n + " * factorial ("+(n-1)+") = "+ resultado);
            return resultado;
            //return n * factoiral (n-1);
        }    
    }

    // calcular la suma de los numeros consecutivos
    // n = 5 resultado = 5+4+3+2+1 = 15

    public int sumaConsecutivos(int n){
        //caso base
        if (n ==1){
            return 1;
        }
        return n + sumaConsecutivos(n-1);
    }
    

    // Calcula la potencia de un numero

    public int potencia(int base, int exponente){
        if (exponente == 0) {
            return 1;
        }
        return base * potencia(base, exponente - 1);
    }

    // Crear un metodo que sume los digitos de un numero
    // si mando 456 sea igual a 15
    // 4 + 5 + 6 = 15
    // pista se usa % mod
    
    public int sumaNumeros(int numero){
        int suma = 0;
        while (numero > 0){
            int digito = numero % 10;
            suma = suma + digito;
            numero = numero / 10;
        }
        return suma;
    }

    public int fibonacci(int n) {

        if (n==0) return 0;   
        if (n==1) return 1;
        return fibonacci(n-1)+fibonacci(n-2);
    }

    


}
