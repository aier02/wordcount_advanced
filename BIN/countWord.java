import java.util.Scanner;
import java.util.regex.Pattern;
public class CountWord {
	 public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);
		 String com=scan.nextLine();
    	 //����������ʽ����û���������������Ƿ���ȷ
    	 String pattern = "wcPro.exe .+(\\.)txt";
    	 boolean isMatch = Pattern.matches(pattern, com);
    	 //���ʽ��ȷ������ѭ����������������û�����
    	 if(isMatch){
    		 Count tar=new Count(com.replace("wcPro.exe ",""));
    		 tar.countWord();
    		 for(int i=0;i<tar.getWordArray().size();i++){
    			 System.out.println(tar.getWordArray().get(i).word+" "+tar.getWordArray().get(i).num);
    		 }
    	 }
}
}
