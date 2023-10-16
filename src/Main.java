import animal.Carnivor;
import calculator.Calculator;
import device.Device;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        calculator.setKw(150);
        calculator.setAreBaterie(true);
        calculator.incarca();
        calculator.incarca();
        calculator.incarca();

        System.out.println(calculator.getKw());
        System.out.println(calculator.areBaterie());
        System.out.println(calculator.getProcentIncarcareBaterie());


    }
}