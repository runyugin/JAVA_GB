import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class Homework {

    public static void main(String[] args) {
        System.out.println(isCorrectParentheses("()")); // true
        System.out.println(isCorrectParentheses("(")); // false
        System.out.println(isCorrectParentheses("())")); // false
        System.out.println(isCorrectParentheses("((()))")); // true
        System.out.println(isCorrectParentheses("()[]{}<>")); // true
        System.out.println(isCorrectParentheses("([)]")); // false
        System.out.println(isCorrectParentheses("][]")); // false
        System.out.println("[]{<()[]<>>}"); // true
    }
    
    /**
     * Дана последовательность скобочек. Проверить, что она является корректной.
     */
    static boolean isCorrectParentheses(String parentheses) {
        // TODO: 07.04.2023 Вписать решение!
        // Нужно завести маппинг скобочек либо ( -> ), либо ) -> ( и так для каждой пары
        // Нужно использовать Deque.
        // Открывающуюся скобку вносим в Deque (insertFirst)
        // Если встретилась закрывающаяся скобка, то (Deque#pollFirst) и сравниваем ее с встретившейся


        Map<Character,Character> map = new HashMap();
        map.put('{', '}');
        map.put('(', ')');
        map.put('[', ']');
        map.put('<', '>');
        

        Deque<Character> eCharacters = new ArrayDeque<>();
    
        char[] parenthesesArray = parentheses.toCharArray();
        if (parenthesesArray.length % 2 != 0) return false;


        for (int i = 0; i < parenthesesArray.length; i++) {
            if (map.containsKey(parenthesesArray[i])) {
                eCharacters.push(map.get(parenthesesArray[i]));
                }
            else {
                try {
                    if (eCharacters.pollFirst().equals(parenthesesArray[i]));
                    else return false;
                } catch (Exception e) {
                    return false;
                }
            }
        }

        return true;
        }
    

}