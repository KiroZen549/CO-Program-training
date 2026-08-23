public class Time {
    public static void main(String[] args) {
        double A = 1;
        double B = 6;
        double C = 9;
        double sqrt = B + Math.sqrt(4*A*C);
        double Zero1 = (-B + sqrt)/2*A;
        Double Zero2 = (-B - sqrt)/2*A;
        System.out.println(Zero1 + " and " + Zero2);
    }
}
