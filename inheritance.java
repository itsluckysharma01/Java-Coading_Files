class A {
    public int x=1;
    public int y=2;
    void getData(){
        System.out.println("xand Y are "+x+" "+y);
    }
}
class B extends A {
    public int c=10;
    void displayData(){
        System.out.println("Vale of c is "+c);
    }
}
class C extends A {
    public int d=11;
    void displayData(){
        System.out.println("Vale of d is "+d);
    }
}

class inheritance{
    public static void main(String arf[]){
        B ob1 = new B();
        C ob2 = new C();
      
        ob1.getData();
       ob1.displayData(); 
       
        System.out.println("Inheritance Example");
    }
}