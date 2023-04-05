import java.util.*;
class shape{
    int s1, s2;
    shape(int s){
        s1=s;
        s2=s;
    }
    shape(int l, int b){
        s1=l;
        s2=b;
    }
    double area(){
        return s1*s2;
    }
    public static void main(String args[]){
        shape square = new shape(5);
        shape rectangle = new shape(4, 5);
        System.out.println("The area of the shape is "+ square.area());
        
        System.out.println("The area of the shape is "+ rectangle.area());
    }
}