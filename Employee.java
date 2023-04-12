public class Employee {

    private static int idCounter=1;
    int id;
    private int age;
    private String firstName;
    private String secondName;

    private double salary;

    public Employee(int age, String firstName, String secondName, double salary) {
        this.id = idCounter++;
        this.age = age;
        this.firstName = firstName;
        this.secondName = secondName;
        this.salary = salary;
    }


    public Employee(int age, String firstName, String secondName) {
        this.id = idCounter++;
        this.age = age;
        this.firstName = firstName;
        this.secondName = secondName;
        this.salary = 50.0;
    }



    @Override
    public String toString() {      // вывод всей информации о сотруднике
        return id + ": " + firstName + " " + secondName + "; Возраст: " + age + "; Зарплата: " + salary;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
        result = prime * result + ((secondName == null) ? 0 : secondName.hashCode());
        long temp;
        temp = Double.doubleToLongBits(salary);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (age != other.age)
            return false;
        if (firstName == null) {
            if (other.firstName != null)
                return false;
        } else if (!firstName.equals(other.firstName))
            return false;
        if (secondName == null) {
            if (other.secondName != null)
                return false;
        } else if (!secondName.equals(other.secondName))
            return false;
        if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
            return false;
        return true;
    }

    public String getFullName(){
        return firstName + " " + secondName;
    }
    



    boolean olderThan(Employee e){
        return this.age>e.age;
    }


    void upgrade(double salary){
        this.salary+=salary;
    }

}