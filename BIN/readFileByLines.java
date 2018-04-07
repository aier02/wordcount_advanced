import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
public class readFileByLines {
	public String fileName;
	public readFileByLines(String theFilename){
		this.fileName=theFilename;
	}
    public ArrayList<String> fileString(){
	File file = new File(fileName);
	ArrayList<String>  lineArray = new ArrayList<String> ();
    BufferedReader reader =null;{
    try {
    	reader = new BufferedReader(new FileReader(file));
        String tempString = null;
        // һ�ζ���һ�У�ֱ������nullΪ�ļ�����
        while ((tempString = reader.readLine()) != null) {
        	lineArray.add(tempString);
        }
        reader.close();
    } catch (IOException e) {
        //e.printStackTrace();
    	System.out.println("�Ҳ���ָ���ļ�������������");
    } finally {
        if (reader != null) {
            try {
                reader.close();
            } catch (IOException e1) {
            }
        }
    }
}
	return lineArray;
    }
}

