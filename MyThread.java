// implement threads usnig 1st method
// implement method in which run method is on another class 
class MyThread implements Runnable
{
	public void run(){
		for(int i=1; i<=10; i++){
	System.out.println("value is "+ i);
	try{Thread.sleep(1000);
		}
	catch(Exception e){}
	
	}
}
	public static void main(String args[]){
	MyThread t = new MyThread();
	Thread thread=new Thread(t);
	thread.start();
	
	}

}