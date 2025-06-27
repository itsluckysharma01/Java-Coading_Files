class MyDemo
{
    int height;
    int weight;
    MyDemo(int x , int y)
    {
        height=x;
        weight=y;
        System.out.print("Constructor is called \n ");
        System.out.print("Height is "+x);
        System.out.print("\nWidth is "+y);
    }

        void getVal(){
            int z = height*weight;
            System.out.print("\nMultiple is "+z);
        }
    }
    
    class  construtor
    {
        public static void main(String argf[])
        {
            MyDemo ob = new MyDemo(10,20);
            ob.getVal();
        
            System.out.println(" \n Successfully Calles the Constructor");
        }
    }