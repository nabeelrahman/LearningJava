public class Employee implements Comparable<Employee>{

    String name;
    int age;
    String country;

    public Employee(String name, int age, String country) {
        super();
        this.name = name;
        this.age = age;
        this.country = country;
    }


    @Override
    public int compareTo(Employee emp) {
        return this.country.compareTo(emp.country);
    }
}
