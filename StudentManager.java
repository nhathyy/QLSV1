/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author OS
 */
import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private List<Student> students;

    public StudentManager() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Thêm sinh viên thành công.");
    }

    public void removeStudent(String id) {
        Student studentToRemove = null;
        for (Student student : students) {
            if (student.getId().equals(id)) {
                studentToRemove = student;
                break;
            }
        }
        if (studentToRemove != null) {
            students.remove(studentToRemove);
            System.out.println("Xóa sinh viên thành công.");
        } else {
            System.out.println("Không tìm thấy sinh viên với ID: " + id);
        }
    }

    public void updateStudent(String id, String name, int age, String address) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                student.setName(name);
                student.setAge(age);
                student.setAddress(address);
                System.out.println("Cập nhật thông tin thành công.");
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên với ID: " + id);
    }

    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("Danh sách sinh viên trống.");
        } else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }
}

