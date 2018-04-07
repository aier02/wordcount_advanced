import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class count {
		private ArrayList<word>  wordArray;//单词数
		private String file;//统计的源文件
		public count(String theFile){
			this.file=theFile;
		}
		//计算每个文件的单词数
		public void countWord(){
			readFileByLines readFile= new readFileByLines(this.file);
			//按行读取指定文件
		    ArrayList<String>  lineArray = new ArrayList<String> ();
		    ArrayList<word>  wordArray = new ArrayList<word> ();
		    lineArray=readFile.fileString();
		    String pattern="([a-zA-Z]+(-[a-zA-Z]+)*)";
		    Pattern r = Pattern.compile(pattern);
			for(int i =0;i<lineArray.size();i++){
			   Matcher m = r.matcher(lineArray.get(i));
			    while(m.find()){
			    	word cur=new word(m.group(1));
			    	//System.out.println(wordArray.size());
			    	int flag=0;
			    	for(int j=0;j<wordArray.size();j++){
			    		if(wordArray.get(j).word.equals(cur.word)){
			    			wordArray.get(j).add();
			    			flag++;
			    			//sSystem.out.println("nihao");
			    			break;
			    		}
			    	}
			    	if(flag==0){
			    	cur.change();
			    	wordArray.add(cur);
			    	}
			    	}
			    }
			setWordArray(wordArray);
		    }
		public ArrayList<word> getWordArray() {
			return wordArray;
		}
		public void setWordArray(ArrayList<word> wordArray) {
			this.wordArray = wordArray;
		}
		
}
