import static org.junit.Assert.*;

import org.junit.Test;


public class CountTest {
	Count test;
	@Test
	public void testWord1() {
		test=new Count("./case/word_1.txt");
		test.countWord();
		assertEquals("sdf",test.getWordArray().get(0).word);
	}
	@Test
	public void testWord2() {
		test=new Count("./case/word_2.txt");
		test.countWord();
		assertEquals("sdf-dsfg",test.getWordArray().get(0).word);
	}
	@Test
	public void testWord3() {
		test=new Count("./case/word_3.txt");
		test.countWord();
		assertEquals("dsffdg",test.getWordArray().get(0).word);
		assertEquals("dsdf-dfdsf",test.getWordArray().get(1).word);
	}
	@Test
	public void testWord4() {
		test=new Count("./case/word_4.txt");
		test.countWord();
		assertEquals("sd",test.getWordArray().get(0).word);
	}
	@Test
	public void testWord5() {
		test=new Count("./case/word_5.txt");
		test.countWord();
		assertEquals("i",test.getWordArray().get(0).word);
	}
	@Test
	public void testWord6() {
		test=new Count("./case/word_6.txt");
		test.countWord();
		assertEquals("dsdsfdfg",test.getWordArray().get(0).word);
	}
	@Test
	public void testWord7() {
		test=new Count("./case/word_7.txt");
		test.countWord();
		assertEquals("sdfdf",test.getWordArray().get(0).word);
	}
	@Test
	public void testWord8() {
		test=new Count("./case/word_8.txt");
		test.countWord();
		assertEquals("night",test.getWordArray().get(0).word);
	}
	@Test
	public void testWord9() {
		test=new Count("./case/word_9.txt");
		test.countWord();
		assertEquals("adf",test.getWordArray().get(0).word);
	}
	@Test
	public void testWord10() {
		test=new Count("./case/word_10.txt");
		test.countWord();
		assertEquals("kdf",test.getWordArray().get(0).word);
	}
	@Test
	public void testNum1() {
		test=new Count("./case/num_1.txt");
		test.countWord();
		assertEquals("sdf 1",test.getWordArray().get(0).word+" "+String.valueOf(test.getWordArray().get(0).num));
		assertEquals("sdfd 1",test.getWordArray().get(1).word+" "+String.valueOf(test.getWordArray().get(1).num));
		assertEquals("fsdfs 1",test.getWordArray().get(2).word+" "+String.valueOf(test.getWordArray().get(2).num));
	}
	@Test
	public void testNum2() {
		test=new Count("./case/num_2.txt");
		test.countWord();
		assertEquals("sdf 2",test.getWordArray().get(0).word+" "+String.valueOf(test.getWordArray().get(0).num));
	}
	@Test
	public void testNum3() {
		test=new Count("./case/num_3.txt");
		test.countWord();
		assertEquals("ab 3",test.getWordArray().get(0).word+" "+String.valueOf(test.getWordArray().get(0).num));
	}
	@Test
	public void testNum4() {
		test=new Count("./case/num_4.txt");
		test.countWord();
		assertEquals("yam 2",test.getWordArray().get(0).word+" "+String.valueOf(test.getWordArray().get(0).num));
	}
}
