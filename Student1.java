package homework;

public class Student1 {
	private String name;      		    //����
	private String number;					//���
	private String sex;					//�Ա�
	private String major;				//רҵ
	private String grade;					//�꼶
	
	public Student1() {
		//super();
	}
	public String toString(Student1 stu) {
		return "	ѧ������:	"+stu.name+"	ѧ��:	"+stu.number+"	�Ա�:	"+stu.sex+"	רҵ:	"+stu.major+"	�꼶:	"+stu.grade;
	}
	
	public void setName(String name) {     //�趨����
		this.name=name;
	}
	public String getName() {
        return name;
    }
	
	public void setNumber(String number) {		  //�趨ѧ��
		this.number=number;
	}
	public String getNumber() {
        return number;
    }
	
	public void setSex(String sex) {		  //�趨�Ա�
		this.sex=sex;
	}
	public String getSex() {
        return sex;
    }
	
	public void setMajor(String major) {	  //�趨רҵ
		this.major=major;
	}
	public String getMajor() {
        return major;
    }
	
	public void setGrade(String grade) {    	  //�趨�꼶
		this.grade=grade;
	}
	public String getGrade() {
        return grade;
    }
	
}
