package array;
import java.util.ArrayList;

public class NumberListExample {
    public static void main(String[] args) {
        ArrayList<Number> numbers = new ArrayList<>();
        numbers.add(10);          
        numbers.add(15.5);        
        numbers.add(20.75f);     
        numbers.add(100L);      
        System.out.println("Numbers in the list:");
        for (Number num : numbers) {
            System.out.println(num);
        }
    }
}
