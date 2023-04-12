import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

// 1 Дано четное число N (>0) и символы c1 и c2.
// Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.

// Пример. (n = 6, c1='a', c2='b') -> "ababab"
// (n = 8, c1='x', c2='y') -> "xyxyxyxy"

// static String buildString(int n, char c1, char c2) {
//     // TODO: 28.03.2023 Домашнее задание!
//     return null;
// }

// 2 Создать файл file.txt. Если файл уже создан, ничего делать не надо. Записать в файл слово TEXT 100 раз: TEXTTEXTTEXTTEXTTEXTTEXT...


public class Homework {

    public static void main(String[] args) {
        

        System.out.println(buildString(6,'a','b'));       
        System.out.println(buildString(8,'x','y'));


        printText(100,"TEXT");



    }


    static String buildString(int l, char c1, char c2) {

        String result = "";

        for (int i = 0; i < l; i++) {
            if(i%2==0){
                result +=c1;
            } else {
                result +=c2;
            }
        }

        return result;

    }


    public static void printText(int l, String text) {
        

        Path path = Path.of("file.txt");

        try {
            Files.createFile(path);
            byte[] bytes = text.getBytes();
            OutputStream os = Files.newOutputStream(path);
            int i = 0;

            while(i!=l){
                os.write(bytes);
                i++;
            }
        } catch (IOException e) {
            
        }



    }

}