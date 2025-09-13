package javamatter.ex1.ex2;

public class Product {
	private String name;
	private int balance;
	
	public Product(String name , int balance) {
		this.name = name;
		this.balance = balance;
	}
	
	public int deposit(int mount) {
		balance += mount;
		System.out.println("입금된 금액 : " + balance);
		return balance;
	}
	public int withdraw(int mount){
		if(mount > balance) {
			System.out.println("잘못된 금액입니다");
		}else {
			balance -= mount;
			System.out.println("출금된 금액 : " + balance);
		}
		return balance;
	}
	//target은 상대 계좌임
	public void transfer(Product target , int mount) {
		if(mount > balance) {
			System.out.println("잔액 부족입니다");
		}else {
	        this.balance -= mount;
	        target.balance += mount;
	        System.out.println(this.name + " → " + target.name + "에게 " + mount + "원 송금 완료");
	        System.out.println("남은 금액 : " + balance);
	    }
	}
}
