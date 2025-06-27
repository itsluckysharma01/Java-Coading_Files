interface A {
    public int x=1;
    public int y=2;
     
}
interface B{
    public int c=10;
}
interface C{
    public int d=11;
   
}
class D implements A{
    public int e=11;
    void display(){
        System.out.println("Vale of e is "+e);
    }
}

public class multipleInheritance {
    public static void main(String arf[]){
        D dd = new D();
     
        System.out.println("This is Multilevel Inheritance Example");
    }
    
}
