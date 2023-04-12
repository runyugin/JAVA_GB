import java.util.ArrayList;
import java.util.List;

public class Homework {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("string");
        strings.add("40");
        strings.add("-5");
        strings.add("my_string");
        removeIntegers(strings);
        System.out.println(strings); // [string, my_string]
        

        List<Integer> number = new ArrayList<>();
        number.add(11);
        number.add(45);
        number.add(12);
        number.add(32);
        number.add(36);

        removeEvenNumber(number);
    }
    
    static void removeEvenNumber(List<Integer> numbers) {
        // TODO: 31.03.2023 Удалить все четные элементы из списка
        numbers.removeIf(num -> num%2==0);
        System.out.println(numbers);
    }


    
    static void removeIntegers(List<String> strings) {
        // TODO: 31.03.2023 Удалить строки, которые являются целыми числами

        strings.removeIf(num -> isNumber(num));
        System.out.println(strings);

    }

    public static boolean isNumber(String str) {
        try {
            Integer.parseInt(str);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    
    }