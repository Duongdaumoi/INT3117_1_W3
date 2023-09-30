import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class check_perTest {

    @Test
    void check_point1() {
        assertEquals("Error!", check_point(100,  50));
    }
    @Test
    void check_point2() {
        assertEquals("Error!", check_point(50, 50));
    }
    @Test
    void check_point3() {
        assertEquals("A", check_point(60,35));
    }
    @Test
    void check_point4() {
        assertEquals("B", check_point(35, 30));
    }
    @Test
    void check_point5() {
        assertEquals("C", check_point(25,15));
    }
    private String check_point(int a, int b){
        if (a >= 0 && a <= 60) {
            // Diem ly thuyet toi da la 60.
            if (b >= 0 && b <= 40) {
                // Diem thuc hanh toi da la 40.
                int sum = a + b;
                if (sum >= 80) {
                    return "A";
                } else if (sum >= 60 && sum < 80){
                    return "B";
                } else if (sum < 60) {
                    return "C";
                }
            }
        }
        return "Error!";
    }
}
