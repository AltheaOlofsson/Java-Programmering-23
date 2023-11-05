package exercises.solutionslocal;
public class E3Exercise2 {
    public static void main(String[] args) {
        
        Student Anna = new Student("Anna",15,5.5);

        System.out.println(Anna.name + " is " + Anna.age + " years old and has a grade of " + Anna.grade + ".");
    }
}
class Student{
    String name;
    int age;
    double grade;

    Student(String name, int age, double grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

}

