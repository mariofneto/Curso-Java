public class Rectangle {

    public double Width;
    public double Height;

    public double Area(){
        return Width * Height;
    }

    public double Perimeter(){
        return 2 * (Width + Height);
    }

    public double Diagonal(){ // Usando o Teorema de Pitágoras: diagonal^2 = base^2 + altura^2
        double diagonal = Math.sqrt(Width * Width + Height * Height);
        return diagonal;
    }

}
