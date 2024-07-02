import java.util.*;
public class Reverse
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
        System.out.print("Enter the value:");
for(int i=0;i<n;i++){
    
    a[i]=sc.nextInt();
   // System.out.println("Enter the value:");

}
reversedArray(a);
System.out.println("The reversed value is:");
for(int i=0;i<n;i++){
System.out.println(a[i]);
}
    }
    public static void reversedArray(int[] n){
        int l=0;
        int r=n.length-1;
        while(l<r){
            int temp=n[l];
            n[l]=n[r];
            n[r]=temp;

            l++;
            r--;
        }
    }
}
















    