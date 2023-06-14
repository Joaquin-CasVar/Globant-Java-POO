package Service;

// @author Haze
import Entity.Operacion;
import java.util.Scanner;

public class OperacionService {

    public Operacion crearOperacion() {
        Scanner input = new Scanner(System.in);
        Operacion o1 = new Operacion();

        System.out.println("Ingrese el primer numero");
        o1.setNumero1(input.nextInt());
        System.out.println("Ingrese el segundo numero");
        o1.setNumero2(input.nextInt());
        return o1;
    }

    public int sumar(Operacion o1) {
        int suma = o1.getNumero1() + o1.getNumero2();
        return suma;
    }

    public int restar(Operacion o1) {
        int resta = o1.getNumero1() - o1.getNumero2();
        return resta;
    }
}
