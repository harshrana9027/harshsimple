import java.util.*;

class student implements Comparable<student>
{
    String name;
    int id,age;
    
    student(String name,int id,int age)
    {
        this.name=name;
        this.id=id;
        this.age=age;
    }
    
    public int compareTo(student st)
    {
        if(age==st.age)
        {
            return 0;
        }
        else if(age>st.age)
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }
}
class test
{
    public static void main(String[] args) 
    {
        ArrayList<student>al=new ArrayList();
        student s1=new student("virat",18,32);
        student s2=new student("dhoni",7,38);
        student s3=new student("rohit",45,34);
        
        al.add(s1);
        al.add(s2);
        al.add(s3);
        
        Collections.sort(al); 
        
        for(student var:al)
        {
            System.out.println("name : "+var.name);
            System.out.println("id   : "+var.id);
            System.out.println("age  : "+var.age);
            System.out.println("age  : "+var.age);
        }
        
    }
    
}
