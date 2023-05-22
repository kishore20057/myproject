import static org.junit.Assert.*;

import org.junit.Test;

public class mypro {

	static testunit sc = new testunit();
	
	@Test
	public static void test1() {

        assertEquals(4, sc.Addition(1,2));
        System.out.println(sc.Addition(1,2));
    }
	
	@Test
	public static void test2() {
        assertEquals(2, sc.Subtraction(3,1));
        System.out.println(sc.Subtraction(3,1));
    }

}
