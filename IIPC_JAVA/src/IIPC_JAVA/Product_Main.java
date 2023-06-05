package IIPC_JAVA;

class Product_Main{
	public static void main(String args[]) {
		Product p = new Product();
		p.name = "milk";
		p.price = 40;
		p.quantity = 25;
		Product.totalSold = 10;
		p.sell(2);
		Product p1 = new Product();
		p1.name = "Egg";
		p1.price = 10;
		p1.quantity = 100;
		p1.sell(40);
	}
}
class Product {
	String name;
	double price;
	int quantity;
	static int totalSold;
	void sell(int q) {
		System.out.println(q + " Items sold.");
		quantity -= q;
		totalSold = totalSold + q;
		System.out.println("Remaining Quantity : " +Product.getTotalSold());
	}
	static int getTotalSold() {
		return totalSold;
	}
}
