import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GradeTest {

    @Test
    void grade1() {
        assertEquals('I', Grade(-1));
    }
    @Test
    void grade2() {
        assertEquals('A', Grade(9));
    }
    @Test
    void grade3() {
        assertEquals('B', Grade(8));
    }
    @Test
    void grade4() {
        assertEquals('C', Grade(7));
    }
    @Test
    void grade5() {
        assertEquals('D', Grade(6));
    }
    @Test
    void grade6() {
        assertEquals('F', Grade(4));
    }
    private static char Grade(int score){
        char res;
        if (score < 0 || score > 10)
            return 'I';
        if (score >= 9)
            res = 'A';
        else if (score >= 8)
            res = 'B';
        else if (score >= 6.5)
            res = 'C';
        else if (score >= 5)
            res = 'D';
        else
            res = 'F';
        return res;
    }
}