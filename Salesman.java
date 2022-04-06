package employee;

public class Salesman extends Employee {
    // Doanh số bán hàng tối thiểu
    private double minimumSales;

    // Doanh số bán hàng theo tháng
    private double totalSales;

    // Đánh giá tháng: A, B, C, D
    @Override
    public int assessment() {
        // ...
        return 1;
    }

    // Lương tháng: lương = hệ số lương * lương cơ bản + hoa hồng
    @Override
    public double salary() {
        // ...
        return 0.0;
    }
}
