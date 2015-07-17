package whitewater;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestGreet {

	@Test
	public void testSayHello() {
		Greet greet = new Greet();
		String actual = greet.sayHello();
		assertEquals("Hello there.", actual);
	}

}
