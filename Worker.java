package employee;

public class Worker extends Employee {
    // Phụ cấp nặng nhọc
    private float heavyAllowance;

    // Số ngày nghỉ làm
    private int totalAbsentDays;

    // Đánh giá tháng: A, B, C, D
    @Override
    public int assessment() {
        // ...
        return 1;
    }

    // Lương tháng: lương = hệ số lương * lương cơ bản * (1 + phụ cấp nặng nhọc)
    @Override
    public double salary() {
        // ...
        return 0.0;
    }
}
