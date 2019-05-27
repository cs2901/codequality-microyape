package calculator;
import java.util.Scanner;

public class Main {
    public void execute(){
        System.out.println("Calculadora");
        System.out.println("Ingresar una operación separada por un espacio");
        Scanner scan= new Scanner(System.in);
        float n1 = scan.nextFloat();
        char operador = scan.next().charAt(0);
        float n2 = scan.nextFloat();
        Calculadora calculadora = new Calculadora(n1, operador, n2);
    }


    public static void main(String args[]){
        Main main = new Main();
        main.execute();
    }
}
