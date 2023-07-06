package bt.PhuongTrinhBac2;

import  java.util.Scanner ;

public class Main {
    public static void main(String[] args) {
        System.out.println("phương trình bậc 2 ");
    Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số a: " );
        double a = scanner.nextDouble();

        System.out.println("nhập số b: " );
        double b = scanner.nextDouble();

        System.out.println("nhập số c: " );
        double c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation();
        quadraticEquation.setA(a);
        quadraticEquation.setB(b);
        quadraticEquation.setC(c);
        double delta = quadraticEquation.getDiscriminant();
        if(delta > 0) {
            double x1 = quadraticEquation.getRoot1();
            double x2 = quadraticEquation.getRoot2();
            System.out.println("phương trình có 2 nghiệm là x1 = "+ x1 + " x2 = " + x2);
        }else if(delta == 0) {
            double x = quadraticEquation.getRoot1();
            System.out.println("phương trình có nghiệm x1 = x2 = "+ x);
        }else {
            System.out.println("phương trình vô nghiệm");
        }
    }
}
