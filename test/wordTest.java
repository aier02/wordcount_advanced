import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class wordTest {
	word test=new word("aBc");
	@Before
	public void testWord() {
		assertEquals("aBc 1",test.getWord()+" "+String.valueOf(test.getNum()));
	}
	@Test
	public void testAdd() {
		test.add();
		assertEquals(2,test.getNum());
	}
	@Test
	public void testChange() {
		test.change();
		assertEquals("abc",test.getWord());
	}
	
}
