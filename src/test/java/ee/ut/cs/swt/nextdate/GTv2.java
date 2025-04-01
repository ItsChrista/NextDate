package ee.ut.cs.swt.nextdate;

import org.junit.Test;
import static org.junit.Assert.*;

public class GTv2 {

	@Test(timeout = 4000)
	public void testCreatesNextDate1() throws Throwable {
	    NextDate nextDate0 = new NextDate(1, 1, 1);
	    String string0 = nextDate0.run(1, 1, 3223);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate0() throws Throwable {
	    NextDate nextDate0 = new NextDate((-393), (-3508), (-393));
	    String string0 = nextDate0.run(994, 13, 994);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate3() throws Throwable {
	    NextDate nextDate0 = new NextDate(5, (-3461), 2);
	    String string0 = nextDate0.run(5, 3, 1994);
	    assertEquals("5/4/1994", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate2() throws Throwable {
	    NextDate nextDate0 = new NextDate(8, 11, 8);
	    String string0 = nextDate0.run(11, 1801, 1801);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate5() throws Throwable {
	    NextDate nextDate0 = new NextDate(0, (-3461), 2);
	    String string0 = nextDate0.run(7, 10, 2021);
	    assertEquals("7/10/2021", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate4() throws Throwable {
	    NextDate nextDate0 = new NextDate((-1), (-1), (-1));
	    String string0 = nextDate0.run(10, 31, 1988);
	    assertEquals("11/1/1988", string0);
	}

	@Test(timeout = 4000)
	public void testRunReturningNonEmptyString() throws Throwable {
	    NextDate nextDate0 = new NextDate(8, 11, 8);
	    String string0 = nextDate0.run(11, 8, 1801);
	    assertEquals("11/9/1801", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegative() throws Throwable {
	    NextDate nextDate0 = new NextDate(8, 11, 8);
	    String string0 = nextDate0.run((-1), 1801, 1801);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegativeAndRunWithNegativeAndRunWithPositive() throws Throwable {
	    NextDate nextDate0 = new NextDate(8, 11, 8);
	    String string0 = nextDate0.run((-1), (-1), 592);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate14() throws Throwable {
	    NextDate nextDate0 = new NextDate(8, 11, 8);
	    String string0 = nextDate0.run(8, 11, 1801);
	    assertEquals("8/12/1801", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate13() throws Throwable {
	    NextDate nextDate0 = new NextDate(3, 1983, 1983);
	    String string0 = nextDate0.run(3, 3, 1983);
	    assertEquals("3/4/1983", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate15() throws Throwable {
	    NextDate nextDate0 = new NextDate((-393), (-3508), (-393));
	    String string0 = nextDate0.run(9, 24, 2021);
	    assertEquals("9/25/2021", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegativeAndRunWithPositiveAndRunWithPositive() throws Throwable {
	    NextDate nextDate0 = new NextDate(5, (-3461), 2);
	    String string0 = nextDate0.run(2, 1, (-1));
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate7() throws Throwable {
	    NextDate nextDate0 = new NextDate(4, 31, 6);
	    String string0 = nextDate0.run(6, 31, 1990);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate6() throws Throwable {
	    NextDate nextDate0 = new NextDate((-399), (-399), (-399));
	    String string0 = nextDate0.run(4, 30, 1993);
	    assertEquals("5/1/1993", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate9() throws Throwable {
	    NextDate nextDate0 = new NextDate(4, 31, 12);
	    String string0 = nextDate0.run(12, 31, 1990);
	    assertEquals("1/1/1991", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate8() throws Throwable {
	    NextDate nextDate0 = new NextDate(7, 1996, 1809);
	    String string0 = nextDate0.run(12, 7, 1809);
	    assertEquals("12/8/1809", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate10() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 1990, 1990);
	    String string0 = nextDate0.run(2, 31, 1990);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate12() throws Throwable {
	    NextDate nextDate0 = new NextDate(1, 1, 1);
	    String string0 = nextDate0.run(1, 1, 1988);
	    assertEquals("1/2/1988", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate11() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 1990, 1990);
	    String string0 = nextDate0.run(2, 2, 1990);
	    assertEquals("2/3/1990", string0);
	}

}