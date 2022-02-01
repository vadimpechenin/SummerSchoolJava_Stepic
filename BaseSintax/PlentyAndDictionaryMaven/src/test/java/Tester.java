import org.junit.Test;

public class Tester {

    @Test
    public void test1(){
        assert (new Main().sum(1,2)==3);
    }

    @Test
    public void test2(){
        assert (new Main().mult(5,7)==35);
    }

   /* @Test
    public void test3(){
        assert (new Main().mult(5,7)==3);
    }*/
}

