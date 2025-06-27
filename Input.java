import java.util.*; 
    class Input{
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Name = ");
            String name = sc.nextLine();
            System.out.print(" \n Enter Value of A = ");
            int a = sc.nextInt();
            System.out.print("\n Enter Value of B = ");
            float b = sc.nextFloat();

            float sum = a+b;
            System.out.println("Name is: "+name );
            System.out.println("Sum is= "+sum);
        }
    }
