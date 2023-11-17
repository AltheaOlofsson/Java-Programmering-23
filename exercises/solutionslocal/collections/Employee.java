package exercises.solutionslocal.collections;

public class Employee {
    
private String name;

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

private int age;

public int getAge() {
    return age;
}

public void setAge(int age) {
    this.age = age;
}

Employee(String name, int age){
this.name = name;
this.age = age;

}

@Override
public String toString() {
    return "Name: " + name + ", Age: " + age;
}



}
