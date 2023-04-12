// Создать класс Сотрудник (Employee).
// У класса должны быть следующие поля:
// 1. Возраст (int)
// 2. Имя (String)
// 3. Фамилия (String)
// 4. Зарплата (double)
// 5. ... можно придумать свои поля

// У класса должно быть 2 конструктора:
// 1. Конструктор, который принимает все аргументы
// 2. Констуктор, который принимает все аргументы КРОМЕ зарплаты; значение зарплаты должно быть задано значением по умолчанию (50.0)

// Переопределить:
// 1. Методы equals и hashCode (поля, которые должны там участвовать, нужно определить самостоятельно)
// 2. Метод toString (в любом формате)

//     Реализовать методы:
//     String getFullName() - возвращает полное имя сотрудника
//     boolean olderThan(Employee e) - возвращает true, если текущий сотрудник старше чем тот, который передали в метод.
//     void upgrade(double salary) - повышает зарплату сотрудника НА salary единиц. Пример: Было 50.0, upgrade(20.0) -> стало 70.0



public class Homework {

    public static void main(String[] args) {

        Employee employee_1 = new Employee(20, "Дмитрий", "Иванов", 60);
        Employee employee_2 = new Employee(30, "Иван", "Смирнов", 40);
        Employee employee_3 = new Employee(27, "Олег", "Сидоров");
        Employee employee_4 = new Employee(65, "Алексей", "Пупкин", 55);
        Employee employee_5 = new Employee(28, "Владимир", "Иванов");
        
        System.out.println(employee_1);
        System.out.println(employee_2);
        System.out.println(employee_3);
        System.out.println(employee_4);
        System.out.println(employee_5);

        System.out.println();

        System.out.println(employee_1.getFullName());

        System.out.println();

        System.out.println(employee_1.olderThan(employee_2));
        System.out.println(employee_4.olderThan(employee_3));

        System.out.println();
        
        employee_1.upgrade(40);
        employee_5.upgrade(80);

        System.out.println(employee_1);
        System.out.println(employee_5);
    }
    


}