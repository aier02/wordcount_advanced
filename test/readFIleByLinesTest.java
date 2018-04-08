import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Test;


public class ReadFileByLinesTest {
	ReadFileByLines readFile;
    ArrayList<String>  lineArray = new ArrayList<String> ();
	@Test
	public void testEmptyTxt() {
		readFile= new ReadFileByLines("./case/empty.txt");
	    lineArray=readFile.fileString();
		assertEquals(0,lineArray.size());
	}
	@Test
	public void testNottxt() {
		readFile= new ReadFileByLines("./case/source.pptx");
	    lineArray=readFile.fileString();
		assertEquals(0,lineArray.size());
	}
	@Test
	public void testEmptyLine() {
		readFile= new ReadFileByLines("./case/emptyLine.txt");
	    lineArray=readFile.fileString();
		assertEquals("",lineArray.get(0));
	}

}
