import java.util.*;
class vampire{

    void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int digits[]= new int[4];
        int nums[]= new int[16];
        int x;
        int i, j, a=0;
        
        x= sc.nextInt();
        int temp=x;
        System.out.println(x);
        System.out.println(temp);
        for(i=1; i<=4; i++){
            digits[i]=temp%10;
            temp=temp/10;
            System.out.println(digits[i]);
        }
        for (i=0; i<=4; i++){
            for (j=0; j<=4; j++){
                nums[a]=(digits[i]*10)+digits[j];
                System.out.println(nums[a]);
                a++;
            }
        }
        for (i=0; i<=16; i++){
            for(j=0; j<=16; j++){
                int p=nums[i];
                int q=nums[j];
                if(p*q==x){
                    System.out.println("It is a vampire number");
                    break;
                }
            }
        }
    }  
}