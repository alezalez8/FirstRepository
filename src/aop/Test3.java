package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class Test3 {

    public static void main(String[] args) {
        System.out.println("Method main starts");
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary library = context.getBean("uniLibrary", UniLibrary.class);
//        library.returnBook();
        String bookName = library.returnBook();
        System.out.println(bookName);


        System.out.println("Method main ends");

        context.close();
    }

    @Component
    public static class University {
        private List<Student> students = new ArrayList<>();

        public void addStudents() {
            Student st1 = new Student("Zaur Tregulov", 4, 7.5);
            Student st2 = new Student("Mikhail Ivanov", 2, 8.3);
            Student st3 = new Student("Elena Sidorova", 1, 9.1);
            students.add(st1);
            students.add(st2);
            students.add(st3);
        }

        public List<Student> getStudents() {
            System.out.println("Начало работы метода getStudents");
    //        System.out.println(students.get(3));
            System.out.println("Information from method getStudents:");
            System.out.println(students);
            // сюда вклинивается @AfterReturning и меняет значение листа students
            return students;
        }

  /*      @Entity
        @Table(name = "employees")
        public static class Employee {

            @Id
            @Column(name = "id")
            private int id;

            @Column(name = "name")
            private String name;

            @Column(name = "surname")
            private String surname;

            @Column(name = "department")
            private String department;

            @Column(name = "salary")
            private int salary;


            public Employee() {
            }

            public Employee(String name, String surname, String department, int salary) {
                this.name = name;
                this.surname = surname;
                this.department = department;
                this.salary = salary;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getSurename() {
                return surname;
            }

            public void setSurename(String surename) {
                this.surname = surename;
            }

            public String getDepartment() {
                return department;
            }

            public void setDepartment(String department) {
                this.department = department;
            }

            public int getSalary() {
                return salary;
            }

            public void setSalary(int salary) {
                this.salary = salary;
            }

            @Override
            public String toString() {
                return "Employee{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        ", surename='" + surname + '\'' +
                        ", department='" + department + '\'' +
                        ", salary=" + salary +
                        '}';
            }
        }*/
    }
}
