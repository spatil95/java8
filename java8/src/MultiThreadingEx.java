
public class MultiThreadingEx extends Thread{

	int amount =1000;
	
	synchronized public void deposit(int amount)
	{
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.amount=this.amount+amount;
		System.out.println("deposit successfull::"+this.amount);
		
	}
	
	
	synchronized  public void withdraw(int amount)
	{
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.amount=this.amount-amount;
		System.out.println("withdraw successfull::"+this.amount);

	}
	
	synchronized  public void accountActivateOrNot() 
	{
		notifyAll();
		System.out.println("Account activated");

	}
	public static void main(String[] args) {
		MultiThreadingEx mx= new MultiThreadingEx();
		
		mx.start();
		System.out.println(mx.currentThread());
		
		Thread t1= new Thread(()->{
			System.out.println("t1 called....");
			mx.withdraw(100);
		});
		t1.start();
		Thread t2= new Thread(()->{
			System.out.println("t2 called....");
			mx.deposit(100);
		});
		t2.start();

		Thread t3= new Thread(()->{
			System.out.println("notifyAll....");
			mx.accountActivateOrNot();
			
		});
		t3.start();
		
	}
	
}
