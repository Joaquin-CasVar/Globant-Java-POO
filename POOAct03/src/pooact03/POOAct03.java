package pooact03;

// @author Haze
import Entity.Operacion;
import Service.OperacionService;

public class POOAct03 {

    public static void main(String[] args) {
        OperacionService os = new OperacionService();
        Operacion o1 = os.crearOperacion();
        
        int suma = os.sumar(o1);
        int resta = os.restar(o1);
        System.out.println("Suma de los numeros ingresados: " + suma);
        System.out.println("Suma de los numeros ingresados: " + resta);
    }

}
