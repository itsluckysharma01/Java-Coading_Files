class BitDemo 
 {
   public static void main(String args[])
    {
          String 	binary[]={"0000","0001","0010","0011",
	"0100","0000","0001","0010","0011","0100"};
        
        int a=3;
        int b=4;
        int d =a & b;
        int e =a ^ b;
        int f =a | b;
       
            System.out.println("The Val of A  -: "+binary[a]);
           System.out.println("The Val of  B  -: "+binary[b]);
          System.out.println("The Val of A & B  -: "+binary[d]);
          System.out.println("\nThe Val of A ^ B   -: "+binary[e]);
         System.out.println("\nThe Val of A | B   -: "+binary[e]);
        
     }
  }
