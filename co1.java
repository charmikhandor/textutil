import java.util.*;

class co1{
    public static int gcd(int a, int b){
        // b>a
        if (a==0){
            return b;
        }
        return gcd(b%a, a);
   }
   public static int lcm(int a, int b){
        return (a*b)/(gcd(a,b));
   }
   public static int exponent(int a, int b){
        if(b==1){
            return a;
        }
        return exponent(a*a, b-1);
   }
   static int n1=0, n2=1;
   public static void fib(int n){
        if (n>0){
            int n3;
            n3=n1+n2;
            System.out.print(n3+ " ");
            n1=n2;
            n2=n3;
            fib(n-1);
        }
   }
   static int rev=0;
   static int sum=0;
   public static int rev(int x){
        if(x>0){
            rev=rev*10 + x%10;
            return rev(x/10);
        }
        return rev;
   }
   public static int sum(int x){
        if(x>0){
            sum=sum+x;
            return sum(x-1);
        }
        return sum;
   }
   public static int digit=0;
   public static int digits(int x){
        if(x>0){
            digit=digit+x%10;
            return digits(x/10);
        }
        return digit;
   }
   public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the function");
        System.out.println("1) To find GCD and LCM");
        System.out.println("2) To find X^Y ");
        System.out.println("3) To print n Fibonacci numbers");
        System.out.println("4) To find reverse of number ");
        System.out.println("5) To 1+2+3+4+..+ (n-1)+n");
        System.out.println("6) Calculate the sum of digits of a number ");
        int fn = input.nextInt();
        switch (fn) {
 
        case 1:
        int temp;
        System.out.println("Enter the two numbers:");
        int a = input.nextInt();
        int b = input.nextInt();
        if (a < b) { 
            temp = a;
            a = b;
            b = temp;
        }
        System.out.print("GCD is :");
        System.out.println(gcd(a, b));
        System.out.print("LCM is :");
        System.out.println(lcm(a, b));
        break;
        case 2:
        System.out.println("Enter the x and y value");
        int x = input.nextInt();
        int y = input.nextInt();
        if (y == 0) {
            System.out.println("Answer:" + 1);
        }
        else {
            System.out.println("Answer:" + exponent(x, y));
        }
        break;
        case 3:
        System.out.println("Enter the nth value");
        int count = input.nextInt();
        System.out.print(n1 + " ");
        System.out.print(n2 + " "); 
        fib(count - 2);
        break;
        case 4:
        System.out.println("Enter the number");
        int n = input.nextInt();
        System.out.println("reverse is " + rev(n));
        break;
        case 5:
        System.out.println("Enter the nth value");
        int nth = input.nextInt();
        for (int i = 1; i <= nth; i++) { 
            if (i == nth) {
                System.out.print(i);
            }
            else { 
                System.out.print(i + "+");
            }
        }

        System.out.print("=" + sum(nth));
        break;
        case 6:
        System.out.println("Enter the number"); 
        int m = input.nextInt(); 
        System.out.println("Sum is " + digits(m));
        break;
        default: System.out.println("Invalid input");
        }
        }
    }

