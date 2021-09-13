package prob3;

public class Duck extends Bird {

	public Duck() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly() {

		System.out.println("오리(" + this.name + ")는 날지 않습니다.");
		// TODO Auto-generated method stub

	}

	@Override
	public void sing() {
		System.out.println("오리(" + this.name + ")가 소리내어 웁니다.");
		// TODO Auto-generated method stub

	}
	
	@Override
	public String toString() {
		return "오리의 이름은 " + this.name + "입니다.";
	}
	

}
