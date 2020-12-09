package homework;

public class Student1 {
	private String name;      		    //名字
	private String number;					//编号
	private String sex;					//性别
	private String major;				//专业
	private String grade;					//年级
	
	public Student1() {
		//super();
	}
	public String toString(Student1 stu) {
		return "	学生姓名:	"+stu.name+"	学号:	"+stu.number+"	性别:	"+stu.sex+"	专业:	"+stu.major+"	年级:	"+stu.grade;
	}
	
	public void setName(String name) {     //设定姓名
		this.name=name;
	}
	public String getName() {
        return name;
    }
	
	public void setNumber(String number) {		  //设定学号
		this.number=number;
	}
	public String getNumber() {
        return number;
    }
	
	public void setSex(String sex) {		  //设定性别
		this.sex=sex;
	}
	public String getSex() {
        return sex;
    }
	
	public void setMajor(String major) {	  //设定专业
		this.major=major;
	}
	public String getMajor() {
        return major;
    }
	
	public void setGrade(String grade) {    	  //设定年级
		this.grade=grade;
	}
	public String getGrade() {
        return grade;
    }
	
}
