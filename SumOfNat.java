import java.util.*;
public class SumOfNat {
    public static void main(String agf[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter Tha Number: ");
        int n = sc.nextInt();
        int sum=0;
        for (int i =0; i<=n; i++){
            sum = sum + i;
        }
        System.out.println("Sum Of First "+ n + " Natural is "+ sum);
    
    }
    
    // System.out.println("ENter Tha Number: ");
    // int n = sc.nextInt();
    // System.out.println("Table Of "+n);
    // int mul;
    // for(int i=0; i<=10; i++ ){
    //     mul= n*i;
    //     System.out.println(n +" * "+ i+ " = "+ mul);
    // }
}
}
