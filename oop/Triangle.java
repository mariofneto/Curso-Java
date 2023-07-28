
public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    Triangle(double a, double b, double c){
        this.sideA = a;
        this.sideB = b;
        this.sideC = c;
    }

    public void exibirArea(){
        double p = (this.sideA + this.sideB + this.sideC) / 2;
        double area =  Math.sqrt(p * (p - this.sideA) * (p - this.sideB) * (p - this.sideC));
        System.out.printf("Triangle area: %.4f%n", area);
    }




}
