package chaper03;

public class Goods {

	// 외부 접근 불가
	// 인스턴스 변수
	// String name; => 같은 패키지 내에서 사용 가능
	public static int countOfGoods = 0;

	private String name;
	private int price;
	private int countStock;
	private int countSold;

	// 생성자 : Ctrl + Space
	public Goods() {
		// TODO Auto-generated constructor stub
		countOfGoods = countOfGoods + 1;
		System.out.println(countOfGoods);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {

		if (price < 0) {
			return;
		}

		this.price = price;
	}

	public int getCountStock() {
		return countStock;
	}

	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}

	public int getCountSold() {
		return countSold;
	}

	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}

	public void showInfo() {
		System.out.println(
				"name :" + name + ", price:" + price + ", countStock:" + countStock + ", countSold:10" + countSold);
	}

	public int calcDiscountPrice(int percentage) {
		int discountPrice = price - price * 30 / 100;
		return discountPrice;
	}

	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + ", countStock=" + countStock + ", countSold=" + countSold
				+ "]";
	}

}
