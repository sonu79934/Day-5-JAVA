import java.util.*;
public class nestedlooppattern1forchar{
    public static void main(String args[]){
        Scanner sc=new Scanner( System.in);
        int n=sc.nextInt(); 
        for(int i=1;i<=5;i++)
        {
            for(int j=i;j<=5;j++)
            {
            System.out.print((char)(64+j)+" ");
            }
        System.out.println();
        }
    }
}