package javamatter.ex3;

public class BookMain {

	public static void main(String[] args) {
		Book[] b = new Book[3];
		
		
		b[0] = new Book("자바의 정석" , 50000);
		b[1] = new Book("수학의 정석" , 30000);
		b[2] = new Book("국어의 정석" , 20000);
		
		int sum = 0;
		String maxName = "";
		int maxPrice = 0;
		for(Book b1 : b) {
			sum += b1.getPrice();
			if(b1.getPrice() > maxPrice) {
				maxPrice = b1.getPrice();
				maxName = b1.getName();
			}
		}
		System.out.println("총 금액 : " + sum);
		System.out.println("가장 비싼 책 : " + maxName);
		

	}

}
