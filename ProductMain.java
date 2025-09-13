package javamatter.ex1.ex2;

public class ProductMain {

	public static void main(String[] args) {
		Product[] p = new Product[2];
		
		p[0] = new Product("도윤" , 30000);
		p[1] = new Product("영희" , 40000);
		
		
		p[0].deposit(3000);
		p[0].withdraw(5000);
		p[0].transfer(p[1] , 20000);
		
		System.out.println("==========================");
		
		p[1].deposit(5000);
		p[1].withdraw(8000);
		p[1].transfer(p[0] , 3000);
		
		

	}

}
