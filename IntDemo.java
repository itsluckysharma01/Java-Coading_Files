import java.util.Scanner;
class IntDemo 
{
    public static void main(String args[]) 
      {
         byte temp;
         int days;
         short student;
         long distance = 64564;
       
         Scanner in = new Scanner(System.in);
         
        System.out.print("Enter the temprecture: ");
        temp = in.nextByte();
        System.out.print("temp: ");
        System.out.println(temp);
        
         System.out.print("Enter number of days: ");
        days = in.nextInt();
        System.out.print("Days Passed:");
        System.out.println(days);
      
       System.out.print("Enter number of students: ");
        student = in.nextShort();
        System.out.print("Number of Students: ");
        System.out.println(student);
        
        System.out.print("Distance: ");
        System.out.print(distance);
       }
   }
