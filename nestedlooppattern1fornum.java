import java.util.*;
public class nestedlooppattern1fornum{
    public static void main(String args[]){
        Scanner sc=new Scanner( System.in);
        int n=sc.nextInt(); 
        for(int i=1;i<=5;i++)
        {
            for(int j=i;j<=5;j++)
            {
            System.out.print(j+" ");
            }
        System.out.println();
        }
    }
}