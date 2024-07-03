import java.util.*;
public class sumofelements {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        /*int n=sc.nextInt();
        int m=sc.nextInt();
        int a[][]=new int[n][m];
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
           a[i][j]=sc.nextInt();
               sum+=a[i][j];
            }
        }
        System.out.println("The sum of element:"+sum);
        */

        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[m];
        int sum=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            b[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            sum+=a[i]+b[i];
        }
           System.out.println("The sum of element:"+sum);
    }
}