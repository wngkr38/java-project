package chap10.wildcard;

import java.util.Arrays;

public class WildCardExample {
    public static void printCourse(Course<?> course) {
        System.out.println(course.getName() + ": " +  Arrays.toString(course.getStudents()));
    }
    public static void printStudentCourse(Course<? extends  Student> course){
        System.out.println(course.getName() + ": " +  Arrays.toString(course.getStudents()));
    }
    public static void printWorkerCourse(Course<? super Worker> course){
        System.out.println(course.getName() + ": " +  Arrays.toString(course.getStudents()));
    }
    public static void main(String[] args) {
        Course<Person> personCourse = new Course<>("일반인과정", 4);
        personCourse.add(new Person("일반인"));
        personCourse.add(new Worker("직장인"));
        personCourse.add(new Student("학생"));
        personCourse.add(new HighStudent("고등학생"));

        Course<HighStudent> highStudentCourse = new Course<>("고등학생과정", 4);
        highStudentCourse.add(new HighStudent("고딩1"));

        Course<Student> studentCourse = new Course<>("학생과정" , 4);
        studentCourse.add(new Student("학생1"));
        studentCourse.add(new HighStudent("고등학생1"));
        Course<Worker> workerCourse = new Course<>("직장인과정" , 1);
        workerCourse.add(new Worker("직장인1"));

        /* Course<?> */
        printCourse(personCourse);
        printCourse(workerCourse);
        printCourse(studentCourse);
        printCourse(highStudentCourse);

        /* Course<? extends Student> */
        printStudentCourse(studentCourse);
        printStudentCourse(highStudentCourse);

        /* Course<? super Worker> */
        printWorkerCourse(workerCourse);
        printWorkerCourse(personCourse);


    }
}
