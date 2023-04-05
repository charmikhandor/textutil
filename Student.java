import java.util.*;

class Student{
    String name;
    int IDno, math, physics, chemistry, total;
    void input(){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter details");
        name=sc.nextLine();
        IDno=sc.nextInt();
        math=sc.nextInt();
        physics=sc.nextInt();
        chemistry=sc.nextInt();
        total=math+physics+chemistry;
    }
    public static void main(String args[]){
        int i, j;
        Student s[]=new Student[5];//declaring an array of object student
        for(i=0; i<3; i++){
            s[i]=new Student();
            //object is class itself
            s[i].input();
        }
        Student temp;//declaring a temp object
        for (i=0; i<2; i++){
            for(j=0; j<2; j++){
                if(s[j].total<s[j+i].total){
                    temp=s[j];
                    s[j]=s[j+1];
                    s[j+1]=temp;
                }
            }
        }
        for (i=0; i<=3; i++){
            System.out.println(s[i].name+"\t"+s[i].IDno+"\t"+s[i].math+"\t"+s[i].physics+"\t"+s[i].chemistry+"\n");
        }
    }
}

