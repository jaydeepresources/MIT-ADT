package inheritance.abstractClass;

public abstract class Shape {
    protected double area;

    abstract void findArea();

    void display(){
        System.out.println("Area=" + area);
    }
}