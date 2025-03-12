package chap07.constructor;

public class Student extends Person{
        private int studentNo;

        public Student(String name, String ssn ,int studentNo) {
            super(name, ssn);
            this.studentNo = studentNo;
        }

    public int getStudentNo() {
        return studentNo;
    }
}
