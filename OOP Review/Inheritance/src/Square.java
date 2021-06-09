/* TODO : Complete the Square class.
 Add variables if you need.
 Remember to use the @Override to override methods.
intelliJ will be helpful if you do).*/

public class Square extends Shape {
    double side;

    public Square(double side, String name) {
        super(name);
        this.side = side;
    }

    @Override
    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public double getPerimeter() {
        return this.side * 4;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null)
            return false;

        if(this.getClass() != obj.getClass())
            return false;

        Square square = (Square) obj;
        return this.side == square.side && this.name.equals(square.name);

    }

    @Override
    public String toString() {
        return this.name + ":" + this.side;
    }
}