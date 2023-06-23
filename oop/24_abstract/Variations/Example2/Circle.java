class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle.");
    }
    
    double getArea() {
        double radius = 5.0;
        return Math.PI * radius * radius;
    }
}


