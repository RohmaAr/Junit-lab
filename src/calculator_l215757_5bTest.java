import static org.junit.jupiter.api.Assertions.*;

class calculator_l215757_5bTest {

    @org.junit.jupiter.api.Test
    void sum() {
        var cal=new calculator_l215757_5b();
        assertEquals(7,cal.sum(3,4));
    }

    @org.junit.jupiter.api.Test
    void sub() {
        var cal=new calculator_l215757_5b();
        assertEquals(-1,cal.sub(3,4));
    }

    @org.junit.jupiter.api.Test
    void prod() {
        var cal=new calculator_l215757_5b();
        assertEquals(12,cal.prod(3,4));    }

    @org.junit.jupiter.api.Test
    void div() {
        var cal=new calculator_l215757_5b();
        assertNotEquals(3,cal.div(3,0));

    }
}