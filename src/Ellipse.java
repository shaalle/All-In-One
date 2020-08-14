public class Ellipse {
    public static void main(String []args){
        // Area of Ellipse
        float a = 5, b = 4;
        findArea(a, b);
    }
    // Function to find area of an ellipse.
    static void findArea( float a, float b) {
        float Area;
        // formula to find the area of an Ellipse.
        Area = (float)3.142 * a * b ;
        // Display the result
        System.out.println("Area: " + Area);
    }
}
