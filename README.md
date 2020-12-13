# 陈立男 2019311232 计192 
# Java第五次上机实验
## 模拟学生作业处理


<br>

### 实验目的  

<br>

1.掌握字符串String及其方法的使用



<br>

2.掌握文件的读取/写入方法

<br>

3.掌握异常处理结构


<br>



### 实验要求

<br>

在某课上,学生要提交实验结果，该结果存储在一个文本文件A中。
文件A包括两部分内容：
一是学生的基本信息；
二是学生处理后的作业信息，该作业的业务逻辑内容是：利用已学的字符串处理知识编程完成《长恨歌》古诗的整理对齐工作，写出功能方法，实现如下功能：
  
    
<br>

1.每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。”<br>
2.允许提供输入参数，统计古诗中某个字或词出现的次数<br>
3.输入的文本来源于文本文件B读取，把处理好的结果写入到文本文件A<br>
4.考虑操作中可能出现的异常，在程序中设计异常处理程序<br>
5.设计学生类（可利用之前的）<br>
6.采用交互式方式实例化某学生<br>
7.设计程序完成上述的业务逻辑处理，并且把“古诗处理后的输出”结果存储到学生基本信息所在的文本文件A中<br>


### 实验结果
----
![](https://github.com/Mellisa1002/JavaLab5/blob/main/%E8%BF%90%E8%A1%8C%E6%88%AA%E5%9B%BE.png)
![](https://github.com/Mellisa1002/JavaLab5/blob/main/%E7%BB%93%E6%9E%9CA.png)

<br>

### 实验过程

<br>

1.自己先是大约画了一下流程图，明确大致怎么写这个程序以及需要实现哪些功能<br>
2.根据不同的功能确定需要有的基本类和方法<br>
3.重写toString（）方法，来实现对学生信息的简单调用<br>



### 核心代码

<br>

```
//Scanner多次输入:
Scanner name = new Scanner(System.in);
		        if (name.hasNext()) {
		        	
		            stu1.setName(name.next());
		            stu1.setNumber(name.next());
		            stu1.setSex(name.next());
		            stu1.setMajor(name.next());                                              
		            stu1.setGrade(name.next());       
		        }

```
```
//查找字次数的代码:
int m = code.length();
            while((n = in.read(ary,0,2*m)) != -1){
                String s = new String (ary,0,n);
                if(code.equals(s)){
                    i++;
                }
            }
```

### 编程感想

<br>
这次编程题是我比较弱的一部分,从学Python开始有关文件处理就是我的弱项,在文件处理这块总是搞不清楚.而且Java这里有了一个输入流和输出流的新的概念,当时就很弄不明白为什么要这个输入流输出流.
之前学Python时,做查找字出现的次数就很简单,因为有jieba库还能给断词,结果到java中没有这个库给用了,就不太会写了,但是是有一个思路的,大概是把文本导入数组中然后对比要查询的第一个字是否相同,若果相同再对比这个字对应的数组中的下一个字所在的数组中的内容是否相同,以此类推往下比较.想法是好的,这样写着试了试发现实际上没自己想的那么简单,(因为当时哪怕在开头数组那里就有困难)在问了同学后,把数组倒明白了后就放弃了(查词太难了,就写了查字)
考试的时候考了查词急中生智写了个遍历写出来了,后来发现可以用pattern和matcher解决,不想改了
<br>
