package zaali_injgia_1.quiz1.t2.pork.stage;

public class A22 {
    private int month = 7; // July (0-based index would be 6)

    public String getMonthName() {
        String[] months = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };

        // Check if month is within valid range
        if (month >= 0 && month < months.length) {
            return months[month];
        }
        return "Invalid Month";
    }

}