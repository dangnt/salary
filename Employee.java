package employee;

public abstract class Employee {
    private String id;
    private String fullName;
    private int birthYear;
    private int startYear;
    private int sex;
    private float salaryCoefficient;

    // Đánh giá tháng: A, B, C, D
    public abstract int assessment();

    // Lương tháng
    public abstract double salary();

    // Phụ cấp thâm niên
    public double seniorityAllowances(int rank) {
        // phụ cấp thâm niên = số năm làm việc * lương cơ bản/100

        return 0.0;
    }

    // Thu nhập
    public double income(int assessment) {
        double income = 0;

        switch (assessment) {
            case 1: // A
                // ...
                break;
            case 2: // B
                // ...
                break;
            case 3: // C
                // ...
                break;
            case 4: // D
                // ...
                break;
        }

        return income;
    }
}
