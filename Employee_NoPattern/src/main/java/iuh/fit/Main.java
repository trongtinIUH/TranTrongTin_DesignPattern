package iuh.fit;

public class Main {
    public static void main(String[] args) {

        // Tạo và xử lý yêu cầu của nhân viên
        Employee employee1 = new Employee("Đội trưởng");
        Employee employee2 = new Employee("Giám đốc");
        Employee employee3 = new Employee("Nhân viên VP");

        employee1.handleRequest();  // Đội trưởng
        employee2.handleRequest();  // Giám đốc
        employee3.handleRequest();  // Nhân viên VP

        // Tạo đối tượng sắp xếp mảng và kiểm tra các phương thức sắp xếp
        int[] array = {4, 5, 7, 3, 9};
        ArraySort arraySort = new ArraySort(array);

        arraySort.mergeSort();
        arraySort.quickSort();
        arraySort.bubbleSort();
    }
}