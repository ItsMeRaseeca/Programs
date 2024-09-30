class CalculateArea{
    void area(float side){
        float squareArea = side*side;
        System.out.println("The area of square is : " + squareArea + " sq.units");
    }
    
    void area(int length, int breadth){
        int rectArea = length * breadth;
        System.out.println("The area of rectangle is : " + rectArea + " sq.units");
    }
    
    void area(double radius){
        double circleArea = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of circle is : " + circleArea + " sq.units");
    }
    
    void area(){
        System.out.print("No parameters passed. Please provide the measurements. \n");
    }
    
    public static void main(String[] args){
        CalculateArea c1 = new CalculateArea();
        c1.area(4.2f);
        c1.area(10, 5);
        c1.area(2.678);
        c1.area();
    }
}