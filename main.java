import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n----- Quản Lý Sinh Viên -----");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Xóa sinh viên");
            System.out.println("3. Cập nhật thông tin sinh viên");
            System.out.println("4. Hiển thị danh sách sinh viên");
            System.out.println("5. Thoát");
            System.out.println("\n------------ Hết ------------");
            System.out.print("Chọn một tùy chọn: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Nhập MSSV: ");
                    String id = scanner.nextLine();
                    System.out.print("Nhập tên: ");
                    String name = scanner.nextLine();
                    System.out.print("Nhập tuổi: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Nhập địa chỉ: ");
                    String address = scanner.nextLine();

                    Student student = new Student(id, name, age, address);
                    manager.addStudent(student);
                    break;

                case 2:
                    System.out.print("Nhập MSSV của sinh viên cần xóa: ");
                    String removeId = scanner.nextLine();
                    manager.removeStudent(removeId);
                    break;

                case 3:
                    System.out.print("Nhập MSSV của sinh viên cần cập nhật: ");
                    String updateId = scanner.nextLine();
                    System.out.print("Nhập tên mới: ");
                    String newName = scanner.nextLine();
                    System.out.print("Nhập tuổi mới: ");
                    int newAge = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nhập địa chỉ mới: ");
                    String newAddress = scanner.nextLine();

                    manager.updateStudent(updateId, newName, newAge, newAddress);
                    break;

                case 4:
                    manager.displayStudents();
                    break;

                case 5:
                    System.out.println("Thoát chương trình.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }
}

