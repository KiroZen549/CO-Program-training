public class array_max {
    public static void main(String[] args) {
        int max = 0;
        int[] inter = {1,9,4};
        for (int i = 0; i < inter.length; i++) {
            if (max < inter[i]) {
                max = inter[i];
            }
        }
        System.out.println(max);
    }
}
