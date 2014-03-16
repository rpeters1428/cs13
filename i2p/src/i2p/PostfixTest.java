package i2p;

import static org.junit.Assert.*;

import org.junit.Test;

public class PostfixTest {

	@Test
	public void test() {
		Postfix p = new Postfix();
		assertEquals(-0.7568024953, p.eval("sin 4"), 0.000001);
	}

}
