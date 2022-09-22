import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00, toplam;

      Scanner inp = new Scanner(System.in);

        System.out.println("Armut Kilo ? : ");
        armut = inp.nextDouble();

        System.out.println("Elma Kilo ? : ");
        elma = inp.nextDouble();

        System.out.println("Domates Kilo ? : ");
        domates = inp.nextDouble();

        System.out.println("Muz Kilo ? : ");
        muz = inp.nextDouble();

        System.out.println("Patlican Kilo ? : ");
        patlican = inp.nextDouble();

        toplam = armut*armut + elma*elma +domates*domates+muz*muz+patlican*patlican;
        System.out.println("Toplam Tutar : " + toplam );

    }
}