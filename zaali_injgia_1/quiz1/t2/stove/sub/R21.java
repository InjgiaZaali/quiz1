package zaali_injgia_1.quiz1.t2.stove.sub;

import zaali_injgia_1.quiz1.t2.stove.A21;
import zaali_injgia_1.quiz1.t2.pork.stage.A22;

public class R21 {
    public static void main(String[] args) {
        // Create instances of A21 and A22
        A21 rectangle = new A21();
        A22 monthInfo = new A22();

        // Calculate and print rectangle area
        int area = rectangle.getWidth() * rectangle.getHeight();
        System.out.println("Rectangle Area: " + area);

        // Print the name of the month with validation
        // Print the name of the month with validation
        System.out.println("Month: " + monthInfo.getMonthName());
    }
}


