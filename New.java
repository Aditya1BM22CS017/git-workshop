import java.util.Scanner;
import static java.lang.Math.sqrt;
import static java.lang.Math.abs;

public class New{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a,b,c");
        int a= in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        if(a==0){
            System.out.println("This is not a quadratic equation");
        }
        else{
            int d=b*b-4*a*c;
            if(d>0){
                System.out.println("roots are real");
                float r1 = (float) (-b + sqrt(d))/(2*a) ;
                float r2 = (float) (-b - sqrt(d))/(2*a) ;
                System.out.println(r1);
                System.out.println(r2);
            }
            else if(d<0){
                System.out.println("roots are imaginary");
                float r1 = (float) -b/(2*a);
                float r2 = (float) sqrt(abs(d))/(2*a);
                System.out.println(r1+" + "+" i"+r2);
                System.out.println(r1+" - "+" i"+r2);
            }
            else{
                System.out.println("roots are equal");
                float r = (float) -b/(2*a);
                System.out.println(r);
            }
        }
    }
}