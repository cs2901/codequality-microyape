package calculator;


import java.util.List;

public class Calculadora {
    String[] tokens;
    private float resultado;

    private void validar(String numero1, String operador, String numero2){

    }

    public Calculadora(float n1, char operador, float n2){

        switch(operador) {
            case '+':
                Suma suma = new Suma();
                resultado = suma.operar(n1, n2);
                break;
            case '-':
                Resta resta = new Resta();
                resultado = resta.operar(n1,n2);
                break;
            case '*':
                Multiplicacion mult = new Multiplicacion();
                resultado = mult.operar(n1,n2);
                break;
            case '/':
                Division div = new Division();
                try{
                    resultado = div.operar(n1, n2);
                }
                catch(Exception e){
                    System.out.println("No existe division por 0");
                }
                break;
            default:
                System.out.println("Operador no indentificado");
        }
        System.out.println("Resutado: ");
        System.out.println(resultado);
    }
}
