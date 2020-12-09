package homework;
import java.io.*;

public class Search {
	public static int search(String src,String code){
        int i = 0;
        int n = -1;
        byte [] ary = new byte[100];
        File f = new File("src\\homework\\A.txt");
        try{
            FileInputStream in = new FileInputStream(f);
            int m = code.length();
            while((n = in.read(ary,0,2*m)) != -1){
                String s = new String (ary,0,n);
                if(code.equals(s)){
                    i++;
                }
            }
            in.close();
        }catch(IOException ne){
            System.out.println("文件导入错误");
        }
        System.out.println(i);
        return i;
    }
	

}
