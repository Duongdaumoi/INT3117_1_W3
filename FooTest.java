import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class FooTest {
    @Test
    void foo1(){
        assertEquals("A", foo(65));
    }
    @Test
    void foo2(){
        assertEquals("B", foo(66));
    }
    @Test
    void foo3(){
        assertEquals("C", foo(67));
    }
    @Test
    void foo4(){
        assertEquals("haven't check", foo(68));
    }
    String foo(int x) {
        String res;
        switch(x) {
            case 65:
                res = "A";
                break;
            case 66:
                res = "B";
                break;
            case 67:
                res = "C";
                break;
            default:
                res = "haven't check";
        }
        return res;
    }
}
