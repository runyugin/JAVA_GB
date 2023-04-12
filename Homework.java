import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

// Реализовать приложение, которое:
// Принимает от пользователя и запоминает строки
// Если пользователь ввел print, то выводим все предыдущие строки в обратном порядке
// Если введено revert, то удаляем последнюю введеную строку
// Если введено exit, то завершаем программу

//     java
//     c++
//     python
//     c#
//     print
//     < [c#, python, c++, java]
//     revert
//     print
//     < [python, c++, java]
//     exit



public class Homework {

    public static void main(String[] args) {

        start();     

    }

    private static void start() {

        List<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);


        while (true) {     
            String line = sc.nextLine();
            if(line.equals("exit")){
                break;
            } else if(line.equals("print")){

                list.stream()
                .collect(Collectors.toCollection(ArrayDeque::new)) // or LinkedList
                .descendingIterator()
                .forEachRemaining(System.out::println);

            } else if(line.equals("revert")&&list.size()>0){
                list.remove(list.size()-1);
            } else {
                list.add(line);
            }
        }

    }
    

}