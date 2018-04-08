import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Word {
	public String word;
	public int num;
	public Word(String theWord)
	{
		this.num=1;
		this.word=theWord;
	}
	public void add(){
		this.num++;
	}
	public void change(){
		this.word=this.word.toLowerCase();
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
}
