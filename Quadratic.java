public class Quadratic {
    public static void main(String[] args) {
        double A = (1/4);
        double B = 3;
        double C = 9;
        double discrim = Math.sqrt(Math.pow(B, 2) - (4*A*C));

        System.out.println(discrim);

        if (discrim>0) {
            System.out.println("2 roots");
        } else if (discrim==0) {
            System.out.println("1 root");
        } else if (discrim<0) {
            System.out.println("no root");
        } 


        if (A>0) {
            System.out.println("Opens up");
        } else if (A<0) {
            System.out.println("opens down");
        } else if (A==0) {
            System.out.println("does not open");
        }
    }
}
