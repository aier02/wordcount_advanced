import java.util.Scanner;
import java.util.regex.Pattern;
public class countWord {
	 public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);
		 String com=scan.nextLine();
    	 //����������ʽ����û���������������Ƿ���ȷ
    	 String pattern = "wcPro.exe .+(\\.)txt";
    	 boolean isMatch = Pattern.matches(pattern, com);
    	 //���ʽ��ȷ������ѭ����������������û�����
    	 if(isMatch){
    		 count tar=new count(com.replace("wcPro.exe ",""));
    		 tar.countWord();
    		 for(int i=0;i<tar.getWordArray().size();i++){
    			 System.out.println(tar.getWordArray().get(i).word+" "+tar.getWordArray().get(i).num);
    		 }
    	 }
}
}
