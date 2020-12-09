package homework;
import java.io.*;
import java.util.*;

public class Test {
	
	public static void main(String args[]) {
		Student1 stu1 = new Student1();
		System.out.println("请按顺序输入学生姓名,学号,性别,专业,年级");
	
			 
			 
				Scanner name = new Scanner(System.in);
		        if (name.hasNext()) {
		        	
		            stu1.setName(name.next());
		            stu1.setNumber(name.next());
		            stu1.setSex(name.next());
		            stu1.setMajor(name.next());                                              
		            stu1.setGrade(name.next());       
		        }
		       // name.close();
				
		
		try {
			File A = new File("src\\homework\\A.txt");         //创建文件A
			File B = new File("src\\homework\\B.txt");
			FileInputStream in = new FileInputStream(B);         //创建输入流
			Writer out = new FileWriter(A,true);                 //参数为 true，则将字节写入文件末尾处，相当于追加信息;如果 append 参数为 false, 则写入文件开始处开始覆盖已存在文件.
			out.append(stu1.toString(stu1));					 //append函数在out后添加新的要写入的内容:学生信息
			out.flush();										//刷新out
			System.out.println(stu1.toString(stu1));
			
			int i = 0;
	        int n = -1;
	        byte [] ary = new byte[100];
	        
			 while((n = in.read(ary,0,2)) != -1){
	             String word = new String (ary,0,n);
	             i++;
	             out.write(word);
	             out.flush();
	             
	             if(i%7 == 0 && i%14 != 0){
	                
	                 out.append("，");
	                 out.flush();
	             }

	             else if(i%14 == 0){
	                 out.append("。\n");
	                 out.flush();
	             }
	             else{
	             }
	         }
	         in.close();
	         out.close();
			}
			catch(IOException n) {
				 System.out.println("导入作业错误");
			}
		
		 System.out.println("输入您想查询的字符");
	        Scanner sc = new Scanner(System.in);
	        String s = new String();
	        s = sc.nextLine();
	        Search.search("src\\Experience1\\A.txt",s);
		    sc.close();    
	}
}
