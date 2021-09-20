package Exception;

public class MyException extends Exception {
	private static final long serialVersionUID = 1L;

	public MyException(String message) {
		super(message);
	}
	
	public MyException() {
		super("俺が作ったエラーが発生した！");
	}
	
}
