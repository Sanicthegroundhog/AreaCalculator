public class Main {

    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));

    }

    private static double area(double x, double y) {
        if(x < 0){
            return -1;
        }
        if(y < 0){
            return -1;
        }

        return x * y;
    }

    private static double area(double radius) {
        if(radius < 0){
            return -1;
        }
        double area = Math.PI * radius * radius;
        return area;
    }

}
