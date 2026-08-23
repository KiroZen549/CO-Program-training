import java.util.ArrayList;
import java.util.List;

public class avg_value {
    public static void main(String[] args) {
        List<Double> value = new ArrayList<>();
        double sum = 0;


        value.add(2.0);
        value.add(4.3);
        value.add(9.4);
        value.add(2.5);
        value.add(2.1);
        value.add(2.2);
        for (int i = 0; i < value.size(); i++) {
            double total = sum + value.get(i);
            sum = total;
        }
        double avg = sum/value.size();
        System.out.println("the average of the list is " + avg);
    }
}
