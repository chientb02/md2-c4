package bt.PhuongTrinhBac2;

public class QuadraticEquation {
    private double a ;
    private double b ;
    private double c ;

    public void setC(double c) {
        this.c = c;
    }
    public void setB(double b) {
        this.b = b;
    }
    public void setA(double a) {
        this.a = a;
    }

    public double getDiscriminant() {
        return (this.b*this.b - 4*this.a*this.c);
    }
    public double getRoot1(){
        return (-this.b + Math.pow(getDiscriminant(),0.5))/(2*this.a);
    }
    public double getRoot2(){
        return (-this.b - Math.pow(getDiscriminant(),0.5))/(2*this.a);
    }
}
