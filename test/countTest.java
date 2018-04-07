import static org.junit.Assert.*;

import org.junit.Test;


public class countTest {
	count test;
	@Test
	public void testWord_1() {
		test=new count("word_1.txt");
		test.countWord();
		assertEquals("sdf",test.getWordArray().get(0).word);
	}
	@Test
	public void testWord_2() {
		test=new count("word_2.txt");
		test.countWord();
		assertEquals("sdf-dsfg",test.getWordArray().get(0).word);
	}
	@Test
	public void testWord_3() {
		test=new count("word_3.txt");
		test.countWord();
		assertEquals("dsffdg",test.getWordArray().get(0).word);
		assertEquals("dsdf-dfdsf",test.getWordArray().get(1).word);
	}
	@Test
	public void testWord_4() {
		test=new count("word_4.txt");
		test.countWord();
		assertEquals("sd",test.getWordArray().get(0).word);
	}
	@Test
	public void testWord_5() {
		test=new count("word_5.txt");
		test.countWord();
		assertEquals("i",test.getWordArray().get(0).word);
	}
	@Test
	public void testWord_6() {
		test=new count("word_6.txt");
		test.countWord();
		assertEquals("dsdsfdfg",test.getWordArray().get(0).word);
	}
	@Test
	public void testWord_7() {
		test=new count("word_7.txt");
		test.countWord();
		assertEquals("sdfdf",test.getWordArray().get(0).word);
	}
	@Test
	public void testWord_8() {
		test=new count("word_8.txt");
		test.countWord();
		assertEquals("night",test.getWordArray().get(0).word);
	}
	@Test
	public void testWord_9() {
		test=new count("word_9.txt");
		test.countWord();
		assertEquals("adf",test.getWordArray().get(0).word);
	}
	@Test
	public void testWord_10() {
		test=new count("word_10.txt");
		test.countWord();
		assertEquals("kdf",test.getWordArray().get(0).word);
	}
	@Test
	public void testNum_1() {
		test=new count("./case/num_1.txt");
		test.countWord();
		assertEquals("sdf 1",test.getWordArray().get(0).word+" "+String.valueOf(test.getWordArray().get(0).num));
		assertEquals("sdfd 1",test.getWordArray().get(1).word+" "+String.valueOf(test.getWordArray().get(1).num));
		assertEquals("fsdfs 1",test.getWordArray().get(2).word+" "+String.valueOf(test.getWordArray().get(2).num));
	}
	@Test
	public void testNum_2() {
		test=new count("num_2.txt");
		test.countWord();
		assertEquals("sdf 2",test.getWordArray().get(0).word+" "+String.valueOf(test.getWordArray().get(0).num));
	}
	@Test
	public void testNum_3() {
		test=new count("num_3.txt");
		test.countWord();
		assertEquals("ab 3",test.getWordArray().get(0).word+" "+String.valueOf(test.getWordArray().get(0).num));
	}
	@Test
	public void testNum_4() {
		test=new count("num_4.txt");
		test.countWord();
		assertEquals("yam 2",test.getWordArray().get(0).word+" "+String.valueOf(test.getWordArray().get(0).num));
	}
}
