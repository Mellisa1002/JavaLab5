package homework;
import java.io.*;
import java.util.*;

public class Test {
	
	public static void main(String args[]) {
		Student1 stu1 = new Student1();
		System.out.println("�밴˳������ѧ������,ѧ��,�Ա�,רҵ,�꼶");
	
			 
			 
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
			File A = new File("src\\homework\\A.txt");         //�����ļ�A
			File B = new File("src\\homework\\B.txt");
			FileInputStream in = new FileInputStream(B);         //����������
			Writer out = new FileWriter(A,true);                 //����Ϊ true�����ֽ�д���ļ�ĩβ�����൱��׷����Ϣ;��� append ����Ϊ false, ��д���ļ���ʼ����ʼ�����Ѵ����ļ�.
			out.append(stu1.toString(stu1));					 //append������out������µ�Ҫд�������:ѧ����Ϣ
			out.flush();										//ˢ��out
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
	                
	                 out.append("��");
	                 out.flush();
	             }

	             else if(i%14 == 0){
	                 out.append("��\n");
	                 out.flush();
	             }
	             else{
	             }
	         }
	         in.close();
	         out.close();
			}
			catch(IOException n) {
				 System.out.println("������ҵ����");
			}
		
		 System.out.println("���������ѯ���ַ�");
	        Scanner sc = new Scanner(System.in);
	        String s = new String();
	        s = sc.nextLine();
	        Search.search("src\\Experience1\\A.txt",s);
		    sc.close();    
	}
}
