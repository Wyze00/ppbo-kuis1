enum Shape {
    Sphere,
    Cylinder,
    Cuboid,
    Cube;
}

public abstract class Object3D {
    private Shape shapeName;
    static double PI = Math.PI;

    public Object3D(Shape shapeName){
        this.shapeName = shapeName;
    }

    public abstract double getVolume();
    public abstract double getSurfaceArea();

    public Shape getShapeName() {
        return this.shapeName;
    }

    public void print(){
        StringBuilder str = new StringBuilder();

        str.append("Name : " + this.getClass().getName() + "\n");
        str.append("Volume : " + this.getVolume() + "\n");
        str.append("Surface Area : " + this.getSurfaceArea() + "\n");

        System.out.println(str.toString());
    }
}

class Sphere extends Object3D {
    private double radius;

    public Sphere(double radius) {
        super(Shape.Sphere);
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        return ((double)(4) / (double) (3)) * Object3D.PI * Math.pow(this.radius, 3);
    }

    @Override
    public double getSurfaceArea() {
        return 4 * Object3D.PI * Math.pow(this.radius, 2);
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}

class Cylinder extends Object3D {

    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        super(Shape.Cylinder);
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double getVolume() {
        return this.height * Object3D.PI * Math.pow(this.radius, 2);
    }

    @Override
    public double getSurfaceArea() {
        return 2 * Object3D.PI * this.radius * (this.height + this.radius);
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getHeight(){
        return this.height;
    }

    public void setHeight(double height){
        this.height = height;
    }
}

class Cuboid extends Object3D {

    private double width;
    private double height;
    private double length;

    public Cuboid(double width, double height, double length) {
        super(Shape.Cuboid);
        this.width = width;
        this.height = height;
        this.length = length;
    }

    @Override
    public double getVolume() {
        return this.width * this.height * this.length;
    }

    @Override
    public double getSurfaceArea() {
        return 2 * (this.length * this.width + this.length * this.height + this.width * this.height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}

class Cube extends Object3D {
    private double side;

    public Cube(double side) {
        super(Shape.Cube);
        this.side = side;
    }

    @Override
    public double getVolume() {
        return Math.pow(this.side, 3);
    }

    @Override
    public double getSurfaceArea() {
        return 6 * Math.pow(this.side, 2);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
