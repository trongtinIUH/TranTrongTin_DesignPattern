package iuh.fit;

public class Main {
    public static void main(String[] args) {
        // Tạo các sản phẩm
        Product coffee = new Product("Cà phê", 30.0);
        Product water = new Product("Nước suối", 10.0);
        Product tea = new Product("Trà sữa", 25.0);

        // Tạo bàn 1 và thêm sản phẩm vào bàn
        Table table1 = new Table();
        table1.addProduct(coffee);
        table1.addProduct(water);

        // Tạo bàn 2 và thêm sản phẩm vào bàn
        Table table2 = new Table();
        table2.addProduct(tea);
        table2.addProduct(water);

        // Tạo quán cà phê và thêm bàn vào quán
        Client cafe = new Client();
        cafe.addTable(table1);
        cafe.addTable(table2);

        // Tính tổng doanh thu của quán
        double revenue = cafe.calculateRevenue();
        System.out.println("Tổng doanh thu của quán là: " + revenue);
    }
}