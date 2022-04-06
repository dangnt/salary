package employee;

public class Manager extends Employee {
    // Hệ số phụ cấp chức vụ
    private float responsibilityAllowance;

    // Đánh giá tháng: A, B, C, D
    @Override
    public int assessment() {
        // ...
        return 1;
    }

    // Lương tháng: lương = hệ số lương * lương cơ bản + phụ cấp chức vụ
    @Override
    public double salary() {
        // ...
        return 0.0;
    }
}
