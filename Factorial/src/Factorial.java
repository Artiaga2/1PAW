/**
 * Created by artiaga on 16/1/17.
 */
public class Factorial {
    public static void main (String[] args) {

        int num = 4;
        int fact;

        fact = factorialRecursivo(num);

        System.out.println("4! = " + fact);

    }
    static int factorialIterativo(int number){
        int resultado = 1;

        for (int i = 1; 1 <= number ; i ++){
            resultado *= i;

        }
        return resultado;
    }

    static int factorialRecursivo (int number){
        if ( number == 1){
            return 1;
        }else{
            return number * factorialRecursivo(number -1);
        }

    }

}
