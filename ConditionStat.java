import java.util.*; 
class ConditionStat{

public static void main(String argf[]){

// System.out.println("This is the Conditions Statements");
Scanner sc = new Scanner(System.in);
// System.out.println("Enter The Value of a = "); 
// int a = sc.nextInt();

// if (a % 2 == 0){
//     System.out.println("Enter Value is EVEN");
// }
// else if(a == 0 ){
//     System.out.println("Enter Another NO.");
// }
// else{
//     System.out.println("Enter Value is ODD");
// }
System.out.println("Enter Any Number");
int button = sc.nextInt();
switch(button){
    case 1:
    System.out.println("Hellow sir/madam");
    break;
    case 2:
    System.out.println("Namste sir/madam");
    case 3:
    System.out.println("Hii sir/madam");
    default:
    System.out.println("JAY SHREE RAM  sir/madam");
}
}
}