import java.util.Scanner;
import java.util.regex.Pattern;
public class CountWord {
	 public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);
		 String com=scan.nextLine();
    	 //利用正则表达式检查用户命令行输入参数是否正确
    	 String pattern = "wcPro.exe .+(\\.)txt";
    	 boolean isMatch = Pattern.matches(pattern, com);
    	 //表达式正确则跳出循环，否则继续接受用户输入
    	 if(isMatch){
    		 Count tar=new Count(com.replace("wcPro.exe ",""));
    		 tar.countWord();
    		 for(int i=0;i<tar.getWordArray().size();i++){
    			 System.out.println(tar.getWordArray().get(i).word+" "+tar.getWordArray().get(i).num);
    		 }
    	 }
}
}
