import java.util.*; //importing util file which has the scanner class

class firstprog {
    public static void main(String[] args){
        int a=65;
        for (int i=1; i<=4; i++){
            for(int j=1; j<=(4-i); j++){
                System.out.print(" \t");
            }
            int b=a+2*(i-1);
            for(int k=1; k<=i; k++){
                
                System.out.print((char)b+"\t");
                b--;
            }
            a=a+i-1;
            System.out.print("\n");
            
        }
    }
}
        