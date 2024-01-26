import java.util.*;
//Test GIT
public class ArrayListExample {

    public static void main(String args[]) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Alex", 23, "USA"));
        list.add(new Employee("Dave", 34, "India"));
        list.add(new Employee("Carl", 21, "USA"));
        list.add(new Employee("Joe", 56, "Russia"));
        list.add(new Employee("Amit", 64, "China"));
        list.add(new Employee("Ryan", 19, "Brazil"));

        System.out.println("Employees age over 50******************");
        for(Employee emp: list){
            if(emp.age > 50){
                System.out.println("Employee Name: " + emp.name);
                System.out.println("Employee age: " + emp.age);
                System.out.println("Employee country: " + emp.country);
            }

        }
        System.out.println("Employees from USA*********");
        for(Employee emp:list){
            if(emp.country.equals("USA")){
                System.out.println("Employee Name: " + emp.name);
                System.out.println("Employee age: " + emp.age);
                System.out.println("Employee country: " + emp.country);
            }
        }
        //Sort by country
        System.out.println("***********SORTING BY COUNTRY");
        Collections.sort(list);
        for(Employee emp: list){
            System.out.println("Employee Name: " + emp.name);
            System.out.println("Employee age: " + emp.age);
            System.out.println("Employee country: " + emp.country);
        }






    }

}
