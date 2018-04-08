import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Count {
		/**word对象数组*/
		private ArrayList<Word>  wordArray;
		/**源文件名*/
		private String file;
		public Count(String theFile){
			this.file=theFile;
		}
		public void countWord(){/**统计文件的单词数，填写动态数组*/
			ReadFileByLines readFile= new ReadFileByLines(this.file);
			//按行读取指定文件
		    ArrayList<String>  lineArray = new ArrayList<String> ();
		    ArrayList<Word>  wordArray = new ArrayList<Word> ();
		    lineArray=readFile.fileString();
		    String pattern="([a-zA-Z]+(-[a-zA-Z]+)*)";
		    Pattern r = Pattern.compile(pattern);
			for(int i =0;i<lineArray.size();i++){
			   Matcher m = r.matcher(lineArray.get(i));
			    while(m.find()){
			    	Word cur=new Word(m.group(1));
			    	int flag=0;
			    	cur.change();
			    	for(int j=0;j<wordArray.size();j++){
			    		if(wordArray.get(j).word.equals(cur.word)){
			    			wordArray.get(j).add();
			    			flag++;
			    			break;
			    		}
			    	}
			    	if(flag==0){
			    	
			    	wordArray.add(cur);
			    	}
			    	}
			    }
			setWordArray(wordArray);
		    }
		public ArrayList<Word> getWordArray() {
			return wordArray;
		}
		public void setWordArray(ArrayList<Word> wordArray) {
			this.wordArray = wordArray;
		}
		
}
