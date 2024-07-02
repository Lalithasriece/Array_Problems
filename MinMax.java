import java.util.Scanner;

public class min {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
        System.out.print("Enter the value:");
for(int i=0;i<n;i++){
    a[i]=sc.nextInt();
}
int min=a[0];
for(int i=1;i<n;i++){
    if(a[i]<min){
        min=a[i];
    }
}
System.out.println("The Minimum value is: "+min);


int max=a[0];
for(int i=1;i<n;i++){
    if(a[i]>max){
        max=a[i];
    }
}
System.out.println("The Maximum value is: "+max);
}
}


/*OUTPUT:
5
Enter the value:1
2
3
4
5
The Minimum value is: 1
The Maximum value is: 5 */
