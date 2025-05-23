import java.util.Scanner;
class Main {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter student name");
     String s=sc.next();
     System.out.println("Enter number of subjects");
     int n=sc.nextInt();
     System.out.println("Enter marks");
     int arr[]=new int[n];
     int sum=0;
     double avg=0,count=0;
     for(int i=0;i<n;i++)
     {
         System.out.println("Marks of subject "+(i+1)+" is");
         arr[i]=sc.nextInt();
         sum=sum+arr[i];
         count++;
     }
     avg=sum/count;
     System.out.println("The marks are:");
     for(int m:arr)
     {
         System.out.print(m+" ");
     }
     System.out.println();
    System.out.println("-----Report card------");
     System.out.println("Student name:"+s);
     System.out.println("Total marks:"+sum);
     System.out.println("Average marks:");
     System.out.printf("%.2f",avg);
     System.out.println();
       if(avg>=80 && avg<=100)
     {
         System.out.println("A Grade");
     }
     else if(avg>=60 && avg<80)
     {
         System.out.println("B Grade");
     }
     else if(avg>=40 && avg<60)
     {
         System.out.println("C Grade");
     }
     else if(avg>=30 && avg<40)
     {
         System.out.println("D Grade");
     }
     else
     {
         System.out.println("Fail");
     }
     sc.close();
    }
}