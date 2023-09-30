import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {

    int[] a = new int[]{1,2,-1,5,8,-7,3,-5};
    @Test
    void Sum1(){
        assertEquals(0, Sum(a, 0));
    }
    @Test
    void Sum2(){
        assertEquals(2, Sum(a, 3));
    }
    private static int Sum(int a[], int n){

        int i, total = 0;
        for(i = 0;i<n;i++)
            total = total + a[i];
        return total;
    }

}
