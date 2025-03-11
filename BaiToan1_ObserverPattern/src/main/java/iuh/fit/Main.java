package iuh.fit;

public class Main {
    public static void main(String[] args) {
        Classroom classroom = new Classroom();
        Student student1 = new Student("John");
        Student student2 = new Student("Jane");

        classroom.register(student1);
        classroom.register(student2);

        classroom.setMessage("Lớp học bắt đầu lúc 8 giờ sáng!");
    }
}