import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class TestMainClass {

    @Test
    public void test1(){
        assertEquals(50, Main.potatoes(99,100,98));
    }

    @Test
    public void test2(){
        assertEquals(114, Main.potatoes(82,127,80));
    }

    

}






